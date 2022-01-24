package leetcode101.two_pointers.linked_list_cycle_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LinkedListCycleIITest {

    @Test
    public void test_detect_cycle(){
        ListNode listNode = new ListNode(3);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(0);
        listNode.next.next.next = new ListNode(-4);
        listNode.next.next.next.next = listNode.next;

        ListNode resNode = new LinkedListCycleII().detectCycle(listNode);
        System.out.println(resNode);
        Assertions.assertEquals(listNode.next, resNode);
    }

}
