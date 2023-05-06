package algorithm.fundamental.stack;

import org.junit.jupiter.api.Test;

class StackTest {

    @Test
    public void test_stack() {
        ArrayStack<String> stack = new ArrayStack<>();
        String[] strings = {"to", "be", "or", "not", "to", "-", "be", "-", "-", "that", "-", "-", "-", "is"};
        for (int i = 0; i < strings.length; i++) {
            if (!strings[i].equals("-")) {
                stack.push(strings[i]);
            }else{
                System.out.println("pop elem: " + stack.pop());
            }
        }
        System.out.println("\n*****遍历栈: *****");
        System.out.println(stack);
        System.out.println(stack.size() + " left on queue");

        ArrayStack<String> copyStack = new ArrayStack<>(stack);
        System.out.println(copyStack);
    }

}
