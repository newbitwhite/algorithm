package fundamental.linked;

import java.util.Iterator;

/**
 * 链表
 * @author xiaobai
 * @date 2022-02-13 17:23
 */
public class Linked<T> implements Iterable<T>{
    private Node<T> head;
    private int N;

    public void add(T elem){
        if (N == 0){
            head.item = elem;
        }else{
            Node<T> node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node<>();
            node.next.item = elem;
        }
        N++;
    }

    public Node<T> remove(){
        if (N == 0){
            throw new RuntimeException("空链表！");
        }
        Node<T> removeNode = head;
        if (N == 1){
            head = null;
        }else{
            Node<T> prevNode = head;
            while (removeNode.next != null){
                prevNode = removeNode;
                removeNode = removeNode.next;
            }
            prevNode.next = null;
        }
        N--;
        return removeNode;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int i = N;
            private Node<T> node = head;
            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                Node<T> next = node;
                node = node.next;
                --i;
                return next.item;
            }
        };
    }


}
