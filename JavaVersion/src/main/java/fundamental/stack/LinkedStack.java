package fundamental.stack;

import fundamental.node.Node;

import java.util.Iterator;

/**
 * 栈 （链表实现）
 * <p>
 * API：push/pop/isEmpty/size
 * 扩展API：peek/copy
 * @author xiaobai
 * @date 2022-02-07 11:59
 */
public class LinkedStack<T> implements Stack<T>{
    private Node<T> top;
    private int N;

    public LinkedStack() {
    }

    public LinkedStack(LinkedStack<T> stack) {
        top = new Node<>(stack.top);
        N = stack.N;
    }

    @Override
    public void push(T elem){
        Node<T> oldTop = top;
        top = new Node<>();
        top.item = elem;
        top.next = oldTop;
        N++;
    }

    /**
     * 返回栈中最近添加的元素（而不弹出它）
     * @return T
     */
    @Override
    public T peek() {
        if (N <= 0) {
            throw new RuntimeException("空栈！");
        }
        return top.item;
    }

    @Override
    public T pop(){
        if (N == 0){
            throw new RuntimeException("空栈！");
        }
        T elem = top.item;
        top = top.next;
        N--;
        return elem;
    }

    @Override
    public int size(){
        return N;
    }

    @Override
    public boolean isEmpty(){
        return N == 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private Node<T> n = top;

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

    @Override
    public String toString() {
        System.out.println("LinkedStack的toString方法");
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


