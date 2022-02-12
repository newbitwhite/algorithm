package fundamental.stack;

import java.util.Iterator;

/**
 * 栈 (数组实现)
 * <p>
 * API：push/pop/isEmpty/size
 * 扩展API：peek/copy
 * @author xiaobai
 * @date 2022-02-07 00:31
 */
public class ArrayStack<T> implements Stack<T> {
    private T[] a;
    private int N;
    private static final int DEFAULT_CAP = 10;

    public ArrayStack() {
        this(DEFAULT_CAP);
    }

    public ArrayStack(int n) {
        if (n < 0) {
            throw new RuntimeException("初始化栈容量参数异常");
        }
        a = (T[]) new Object[n];
    }

    public ArrayStack(ArrayStack<T> stack) {
        N = stack.N;
        a = (T[]) new Object[stack.a.length];
        for (int i = 0; i < N; i++) {
            a[i] = stack.a[i];
        }
    }

    @Override
    public void push(T item) {
        if (a.length == N) {
            resize(2 * a.length);
        }

        a[N++] = item;
    }

    /**
     * 返回栈中最近添加的元素（而不弹出它）。
     * @return T
     */
    @Override
    public T peek() {
        if (N <= 0) {
            throw new RuntimeException("空栈！");
        }
        return a[N];
    }

    @Override
    public T pop() {
        if (N <= 0) {
            throw new RuntimeException("空栈！");
        }
        T item = a[--N];
        a[N] = null;  // 避免对象游离
        if (N > 0 && N == a.length / 4) {
            resize(a.length / 2);
        }
        return item;
    }

    @Override
    public int size() {
        return N;
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    private void resize(int max) {
        T[] newA = (T[]) new Object[max];
        for (int i = 0; i < N; i++) {
            newA[i] = a[i];
        }
        a = newA;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int i = N;

            @Override
            public boolean hasNext() {
                return i > 0;
            }

            @Override
            public T next() {
                return a[--i];
            }
        };
    }

    @Override
    public String toString() {
        System.out.println("ArrayStack的toString方法");
        String s = "[";
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()){
            s += iterator.next().toString();
            if (iterator.hasNext()){
                s += ", ";
            }
        }
        s += "]";
        return s;
    }
}
