package fundamental.queue;

import fundamental.node.Node;

import java.util.Iterator;

/**
 * 栈队列
 * <p>
 *     API: push、pop、enqueue、size、isEmpty
 * </p>
 * @author ：xiaobai
 * @date ：2022/2/15 10:00
 */
public class LinkedListSteque<T> implements Iterable<T>{
    private Node<T> left;
    private Node<T> right;
    private int N;

    public void enqueue(T elem){
        Node<T> oldLeft = left;
        left = new Node<>();
        left.item = elem;
        if (N == 0){
             right = left;
        } else{
            left.next = oldLeft;
        }
        N++;
    }

    public void push(T elem){
        Node<T> oldRight = right;
        right = new Node<>();
        right.item = elem;
        if (N == 0){
            left = right;
        } else{
            oldRight.next = right;
        }
        N++;
    }

    public T pop(){
        if (N <= 0) {
            throw new RuntimeException("空队列！");
        }
        Node<T> oldRight = right;
        if (N == 1){
            left = null;
            right = null;
        }else{
            Node<T> node = left;
            while (node.next != right){
                node = node.next;
            }
            right = node;
            node.next = null;
        }
        N--;
        return oldRight.item;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private int i = N;
            private Node<T> node = left;
            @Override
            public boolean hasNext() {
                return i>0;
            }

            @Override
            public T next() {
                T elem = node.item;
                node = node.next;
                i--;
                return elem;
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
