package algorithm.fundamental.stack;

/**
 * 栈 (基类)
 * @author xiaobai
 * @date 2022-02-12 00:32
 */
public interface Stack<T> extends Iterable<T>{
    void push(T elem);

    T pop();

    int size();

    boolean isEmpty();

    T peek();
}
