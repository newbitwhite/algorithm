package algorithm_4th.element.stack;

import org.junit.jupiter.api.Test;

import java.util.*;

class StackTest {

    @Test
    public void test_stack() {
        ArrayStack<Integer> integerStack = new ArrayStack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        integerStack.push(5);
        Iterator<Integer> iterator = integerStack.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next());
        }
        System.out.println();


        ArrayList<Integer> ints = new ArrayList<>(List.of(1, 2, 3, 4, 5));
        Iterator<Integer> iterator1 = ints.iterator();
        while (iterator1.hasNext()) {
            System.out.print(iterator1.next());
        }
    }

}