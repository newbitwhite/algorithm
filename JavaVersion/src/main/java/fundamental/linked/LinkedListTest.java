package fundamental.linked;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    public void test_linked_link(){
        LinkedList<String> link = new LinkedList<>();
        link.add("a");
        link.add("b");
        link.add("c");
        System.out.println(link);
        System.out.println(link.size());
        link.remove();
        link.remove();
//        link.remove();
        System.out.println(link);
        System.out.println(link.size());
    }

    @Test
    public void test_doubly_linked_link(){
        DoublyLinkedList<String> link = new DoublyLinkedList<>();
        link.insertLast("b");
        link.insertLast("c");
        link.insertLast("d");
        link.insertLast("e");
        link.insertFirst("a");
        System.out.println(link);
        int size = link.size();
        System.out.println(size);
        Assertions.assertEquals("a->b->c->d->e", link.toString(), "first assertion");
        Assertions.assertEquals(5, size);
        link.removeFirst();
        System.out.println(link);
        int size2 = link.size();
        System.out.println(size2);
        Assertions.assertEquals("b->c->d->e", link.toString(), "second assertion");
        Assertions.assertEquals(4, size2);
        link.removeLast();
        System.out.println(link);
        int size3 = link.size();
        System.out.println(size3);
        Assertions.assertEquals("b->c->d", link.toString(), "third assertion");
        Assertions.assertEquals(3, size3);
    }
}