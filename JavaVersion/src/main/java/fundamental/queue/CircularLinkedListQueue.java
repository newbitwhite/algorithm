package fundamental.queue;

import fundamental.node.Node;

import java.util.Iterator;

/**
 * 队列 （循环链表实现）
 * <p>
 * API: isEmpty/size/enqueue/dequeue
 * @author xiaobai
 * @date 2022-02-13 22:50
 */
public class CircularLinkedListQueue<T> implements Iterable<T>{
    private Node<T> last;
    private int N;

    public void enqueue(T elem) {
        Node<T> oldLast = last;
        last = new Node<>();
        last.item = elem;
        if (N == 0){
            last.next = last;
        } else{
            last.next = oldLast.next;
            oldLast.next = last;
        }
        N++;
    }

    public T dequeue() {
        if (N <= 0) {
            throw new RuntimeException("空队列！");
        }
        Node<T> oldFirst = last.next;
        N--;
        if (N == 0){
            last = null;
        }else{
            last.next = oldFirst.next;
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
            private int i = N;
            private Node<T> node = last;

            @Override
            public T next() {
                T elem = node.next.item;
                node = node.next;
                i--;
                return elem;
            }

            @Override
            public boolean hasNext() {
                return i > 0;
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
