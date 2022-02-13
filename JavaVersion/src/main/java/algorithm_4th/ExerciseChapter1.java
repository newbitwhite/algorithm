package algorithm_4th;

import fundamental.linked.Node;

/**
 *
 * @author ：xiaobai
 * @date ：2022/2/12 16:24
 */
public class ExerciseChapter1<T> {

    /**
     * 1.3.19　给出一段代码，删除链表的尾结点，其中链表的首结点为head。
     * @param head 链表的首结点
     * @param <T> 结点类型
     */
    public static <T> Node<T> $1_3_19(Node<T> head){
        if (head.next == null){
            return null;
        }
        Node<T> prev = head;
        Node<T> node = head;
        while (node.next != null){
            prev = node;
            node = node.next;
        }
        prev.next = null;
        return head;
    }

    /**
     * 1.3.20　编写一个方法 ，接受一个 int 参数 k，删除链表的第 k 个元素（如果它存在的话）。
     * @param k 第 k 个
     * @param head 链表首节点
     */
    public static <T> Node<T> $1_3_20(int k, Node<T> head){
        if (k <= 0 || head == null){
            return head;
        }
        if (k == 1){
            head = head.next;
            return head;
        }
        int n = 1;
        for (Node<T> node = head; node != null; node = node.next, n++) {
           if (n == k - 1 && node.next != null){
               node.next = node.next.next;
               break;
           }
        }
        return head;
    }

    /**
     * 1.3.21　编写一个方法，接受一条链表和一个字符串 key 作为参数。如果链表中的某个结点的 item 域的值为 key，则方法返回 true，否则返回 false。
     * @param key 查找的值
     * @param head 头节点
     */
    public static <T> boolean $1_3_21(String key, Node<T> head){
        for (Node<T> node = head; node != null; node = node.next) {
           if (node.item.equals(key)){
               return true;
           }
        }
        return false;
    }

    /**
     * 1.3.24　编写一个方法，接受一个链表结点作为参数并删除该结点的后续结点（如果参数结点或参数结点的后续结点为空则什么也不做）。
     * @param node 一个链表结点
     */
    public static <T> void $1_3_24(Node<T> node){
        if (node == null || node.next == null){
            return;
        }
        node.next = node.next.next;
    }

    /**
     * 1.3.25　编写一个方法，接受两个链表结点作为参数，将第二个结点插入链表并使之成为第一个结点的后续结点（如果两个参数为空则什么也不做）。
     * @param node1 第一个结点
     * @param node2 第二个结点
     */
    public static <T> void $1_3_25(Node<T> node1, Node<T> node2){
        if (node1 == null || node2 == null){
            return;
        }
        node2.next = node1.next;
        node1.next = node2;
    }

    /**
     * 1.3.26　编写一个方法，接受一条链表和一个字符串 key 作为参数，删除链表中所有 item 域为 key 的结点
     * @param head
     * @param key
     */
    public static <T> Node<T> $1_3_26(Node<T> head, String key){
        if (head == null){
            return null;
        }
        for (Node<T> node = head; node != null; node=node.next){
            if (node.next != null && NodeItemEqKey(node.next, key)){
                node.next = node.next.next;
            }
        }
        if (NodeItemEqKey(head, key)){
            head = head.next;
        }
        return head;
    }

    private static <T> boolean NodeItemEqKey(Node<T> node, String key){
        if (key == null){
            return node.item == null;
        }
        return key.equals(node.item);
    }


}
