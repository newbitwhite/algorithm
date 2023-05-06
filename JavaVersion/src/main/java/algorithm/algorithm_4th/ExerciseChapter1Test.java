package algorithm.algorithm_4th;

import algorithm.fundamental.node.Node;
import org.junit.jupiter.api.Test;

class ExerciseChapter1Test {

    @Test
    public void test_1_3_19(){
        Node<String> node1 = new Node<>();
        Node<String> node2 = new Node<>();
        Node<String> node3 = new Node<>();
        node1.item = "a";
        node1.next = node2;
        node2.item = "b";
        node2.next = node3;
        node3.item = "c";
        node1 = ExerciseChapter1.$1_3_19(node1);
        while (node1 != null){
            System.out.println(node1.item);
            node1 = node1.next;
        }
    }

    @Test
    public void test_1_3_26(){
        Node<String> node1 = new Node<>();
        node1 = ExerciseChapter1.$1_3_26(node1, null);
        System.out.println(node1);
    }

    @Test
    public void test_1_3_30(){
        Node<String> node1 = new Node<>();
        Node<String> node2 = new Node<>();
        Node<String> node3 = new Node<>();
        node1.item = "a";
        node1.next = node2;
        node2.item = "b";
        node2.next = node3;
        node3.item = "c";
        node1 = ExerciseChapter1.$1_3_30(node1);
        while (node1 != null){
            System.out.println(node1.item);
            node1 = node1.next;
        }
    }

    @Test
    public void test_1_3_37(){
        ExerciseChapter1.$1_3_37(7, 2);
    }
}
