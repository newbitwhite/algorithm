package algorithm_4th;

import fundamental.node.Node;
import org.junit.jupiter.api.Test;

/**
 *
 * @author ：xiaobai
 * @date ：2022/2/12 16:24
 */
public class ExerciseChapter1 {

    public void $1_3_19(Node head){
        if (head.next == null){
            head = null;
            return;
        }
        Node prev = null;
        while (head.next != null){
            prev = head;
            head = head.next;
        }
        prev.next = null;
    }

    @Test
    public void test_1_3_19(){
        Node<String> node1 = new Node<>();
        Node<String> node2 = new Node<>();
        Node<String> node3 = new Node<>();
        node1.item = "a";
//        node1.next = node2;
//        node2.item = "b";
//        node2.next = node3;
//        node3.item = "c";
        $1_3_19(node1);
        while (node1 != null){
            System.out.println(node1);
            node1 = node1.next;
        }
    }
}
