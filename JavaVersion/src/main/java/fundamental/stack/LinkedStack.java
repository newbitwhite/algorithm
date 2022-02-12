package fundamental.stack;

import java.util.Iterator;

/**
 * 栈 （链表实现）
 * <p>
 * API：push/pop/isEmpty/size
 * @author xiaobai
 * @date 2022-02-07 11:59
 */
public class LinkedStack<T> implements Iterable<T>{
    private Node top;
    private int N;

    /**
     * 内部类
     */
    private class Node{
        private T item;
        private Node next;
    }

    public void push(T elem){
        Node oldTop = top;
        top = new Node();
        top.item = elem;
        top.next = oldTop;
        N++;
    }

    public T pop(){
        if (N == 0){
            throw new RuntimeException("空栈！");
        }
        T elem = top.item;
        top = top.next;
        N--;
        return elem;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node n = top;

            @Override
            public boolean hasNext() {
                return n != null;
            }

            @Override
            public T next() {
                T elem = n.item;
                n = n.next;
                return elem;
            }
        };
    }
}


