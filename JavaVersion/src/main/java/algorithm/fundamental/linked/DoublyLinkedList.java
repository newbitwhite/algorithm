package algorithm.fundamental.linked;

import algorithm.fundamental.node.DoubleNode;

import java.util.Iterator;

/**
 * 双向链表
 * <p>
 *     API: insertFirst/insertLast/removeFirst/removeLast/insertAfter/insertBefore/removeOne/isEmpty/size
 * </p>
 * @author xiaobai
 * @date 2022-02-13 23:40
 */
public class DoublyLinkedList<T> implements Iterable<T>{
    private DoubleNode<T> first;
    private DoubleNode<T> last;
    private int N;

    public void insertFirst(T elem){
        DoubleNode<T> doubleNode = new DoubleNode<>();
        doubleNode.item = elem;
        if (N == 0){
            last = doubleNode;
        }else{
            doubleNode.next = first;
            first.prev = doubleNode;
        }
        first = doubleNode;
        ++N;
    }

    public void insertLast(T elem){
        DoubleNode<T> doubleNode = new DoubleNode<>();
        doubleNode.item = elem;
        if (N == 0){
            first = doubleNode;
        }else{
            doubleNode.prev = last;
            last.next = doubleNode;
        }
        last = doubleNode;
        ++N;
    }

    public void insertBefore(T elem, DoubleNode<T> doubleNode){
        if (doubleNode == null){
            throw new RuntimeException("指定节点不存在");
        }
        if (doubleNode.prev == null){
            insertFirst(elem);
            return;
        }
        DoubleNode<T> insertDoubleNode = new DoubleNode<>();
        insertDoubleNode.item = elem;
        DoubleNode<T> prev = doubleNode.prev;
        prev.next = insertDoubleNode;
        doubleNode.prev = insertDoubleNode;
        insertDoubleNode.prev = prev;
        insertDoubleNode.next = doubleNode;
        ++N;
    }

    public void insertAfter(T elem, DoubleNode<T> doubleNode){
        if (doubleNode == null){
            throw new RuntimeException("指定节点不存在");
        }
        if (doubleNode.next == null){
            insertLast(elem);
            return;
        }
        DoubleNode<T> insertDoubleNode = new DoubleNode<>();
        insertDoubleNode.item = elem;
        DoubleNode<T> next = doubleNode.next;
        next.prev = insertDoubleNode;
        doubleNode.next = insertDoubleNode;
        insertDoubleNode.next = next;
        insertDoubleNode.prev = doubleNode;
        ++N;
    }

    public T removeFirst(){
        if (N == 0){
            throw new RuntimeException("空双向链表！");
        }
        DoubleNode<T> removeDoubleNode = first;
        if (N == 1){
            last = null;
            first = null;
        }else{
            first = first.next;
            first.prev = null;
            removeDoubleNode.next = null;
        }
        --N;
        return removeDoubleNode.item;
    }

    public T removeLast(){
        if (N == 0){
            throw new RuntimeException("空双向链表！");
        }
        DoubleNode<T> removeDoubleNode = last;
        if (N == 1){
            last = null;
            first = null;
        }else{
            last = last.prev;
            last.next = null;
            removeDoubleNode.prev = null;
        }
        --N;
        return removeDoubleNode.item;
    }

    public void removeOne(DoubleNode<T> doubleNode){
        if (doubleNode == null){
            throw new RuntimeException("指定节点不存在！");
        }

        if (doubleNode.prev == null){
            removeFirst();
            return;
        }
        if (doubleNode.next == null) {
            removeLast();
            return;
        }
        DoubleNode<T> prev = doubleNode.prev;
        DoubleNode<T> next = doubleNode.next;
        prev.next = next;
        next.prev = prev;
        --N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int i = N;
            private DoubleNode<T> node = first;
            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                DoubleNode<T> next = node;
                node = node.next;
                --i;
                return next.item;
            }
        };
    }

    @Override
    public String toString() {
        String s = "";
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()){
            s += iterator.next().toString();
            if (iterator.hasNext()){
                s += "->";
            }
        }
        return s;
    }
}
