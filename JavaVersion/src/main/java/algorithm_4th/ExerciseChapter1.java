package algorithm_4th;

import fundamental.node.Node;
import fundamental.queue.ArrayQueue;
import fundamental.queue.CircularLinkedListQueue;
import fundamental.queue.LinkedListDeque;
import fundamental.queue.LinkedListSteque;

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

    /**
     * 1.3.29　用环形链表实现Queue。环形链表也是一条链表，只是没有任何结点的链接为空，且只要链表非空则 last.next 的值为 first。只能使用一个 Node 类型的实例变量（last）。
     */
    public static <T> void $1_3_29(){
        //见下：CircularLinkedListQueue类
        new CircularLinkedListQueue<T>();
    }

    /**
     * 1.3.30　编写一个函数，接受一条链表的首结点作为参数，（破坏性地）将链表反转并返回结果链表的首结点。
     * @param head  头节点
     * @return 链表反转后的头节点
     */
    public static <T> Node<T> $1_3_30(Node<T> head){
        Node<T> prevNode = null;
        Node<T> node = head;
        Node<T> nextNode;
        while (node != null){
            nextNode = node.next;
            node.next = prevNode;
            prevNode = node;
            node = nextNode;
        }
        return prevNode;
    }

    /**
     * 1.3.32　LinkedListSteque。一个以栈为目标的队列（或称 LinkedListSteque），是一种支持 push、pop 和 enqueue 操作的数据类型。为这种抽象数据类型定义一份 API 并给出一份基于链表的实现。
     * push、pop 都是对队列同一端的操作，enqueue 和 push 对应，但操作的是队列的另一端。
     */
    public static <T> void $1_3_32(){
        //见下：LinkedListSteque类
        new LinkedListSteque<T>();
    }

    /**
     * 1.3.33　LinkedListDeque。一个双向队列（或者称为 LinkedListDeque）和栈或队列类似，但它同时支持在两端添加或删除元素。
     */
    public static <T> void $1_3_33(){
        //见下：LinkedListDeque类
        new LinkedListDeque<T>();
    }

    /**
     * 1.3.37　Josephus 问题。在这个古老的问题中，N 个身陷绝境的人一致同意通过以下方式减少生存人数。他们围坐成一圈（位置记为 0 到 N-1）并从第一个人开始报数，报到 M 的人会被杀死，直到最后一个人留下来。传说中 Josephus 找到了不会被杀死的位置。编写一个 Queue 的用例 Josephus，从命令行接受N 和M 并打印出人们被杀死的顺序（这也将显示 Josephus 在圈中的位置）。
     */
    public static void $1_3_37(int n, int m){
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < n; i++) {
            queue.enqueue(i);
        }
        System.out.print("顺序：");
        while (!queue.isEmpty()) {
            for (int i = 0; i < m-1; i++){
                queue.enqueue(queue.dequeue());
            }
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }
}
