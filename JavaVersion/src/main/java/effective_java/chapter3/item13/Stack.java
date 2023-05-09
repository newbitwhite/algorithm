package effective_java.chapter3.item13;



import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author ：xiaobai
 * @date ：2023/5/9 10:28
 */
// A cloneable version of Stack
public class Stack implements Cloneable {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    //对象拷贝的更好的办法是提供1个拷贝构造器 或 拷贝工厂
    public Stack(Stack s) {
        this.size = s.size;
        this.elements = s.elements.clone();
    }
    public static Stack newInstance (Stack s) {
        Stack stack = new Stack();
        stack.size = s.size;
        stack.elements = s.elements.clone();
        return stack;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }

    public boolean isEmpty() {
        return size ==0;
    }

    // 可变类型的类的克隆方法
    @Override public Stack clone() {
        try {
            Stack result = (Stack) super.clone();
            result.elements = elements.clone();
            return result;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Stack{" +
                "elements=" + Arrays.toString(elements) +
                ", size=" + size +
                '}';
    }

    // Ensure space for at least one more element.
    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    // To see that clone works, call with several command line arguments
    public static void main(String[] args) {
        Stack stack = new Stack();
        for (String arg : args) {
            stack.push(arg);
        }
        Stack copy = Stack.newInstance(stack);
        System.out.println(stack + " ");
        System.out.println(copy + " ");

        stack.push(13);
        System.out.println(stack + " ");
        System.out.print(copy + " ");
    }
}
