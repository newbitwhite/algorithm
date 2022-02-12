package fundamental.queue;

import algorithm_4th.element.Node;

import java.util.Iterator;

/**
 * 队列 （链表实现）
 * <p>
 * API: isEmpty/size/enqueue/dequeue
 * @author xiaobai
 * @date 2022-02-08 00:01
 */
public class LinkedQueue<T> implements Iterable<T>{
    private Node<T> first;
    private Node<T> last;
    private int N;

    public void enqueue(T elem) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = elem;
        if (N == 0){
            first = last;
        } else{
            oldLast.next = last;
        }
        N++;
    }

    public T dequeue() {
        if (N <= 0) {
            throw new RuntimeException("空队列！");
        }
        Node<T> oldFirst = first;
        first = first.next;
        N--;
        if (N == 0){
            last = null;
        }
        return oldFirst.item;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> node = first;

            @Override
            public T next() {
                T elem = node.item;
                node = node.next;
                return elem;
            }

            @Override
            public boolean hasNext() {
                return node != null;
            }

        };
    }

    @Override
    public String toString() {
        String s = "[";
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()){
            s += iterator.next().toString();
            if (iterator.hasNext()){
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
