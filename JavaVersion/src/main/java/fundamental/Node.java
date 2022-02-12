package algorithm_4th.element;

/**
 * @author xiaobai
 * @date 2022-02-12 01:04
 */
public class Node<T>{
    public T item;
    public Node<T> next;

    public Node(){}

    public Node(Node<T> node) {
        this.item = node.item;
        if (node.next!= null){
            this.next = new Node<>(node.next);
        }
    }
}
