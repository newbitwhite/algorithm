package algorithm_4th.element.queue;

import java.util.Iterator;

/**
 * 队列 （数组实现）
 * <p>
 * API: isEmpty/size/enqueue/dequeue
 *
 * @author xiaobai
 * @date 2022-02-08 00:01
 */
public class ArrayQueue<T> implements Iterable<T> {
    private T[] arr;
    private int N;

    private static final int DEFAULT_CAP = 10;

    public ArrayQueue() {
        this(DEFAULT_CAP);
    }

    public ArrayQueue(int n) {
        if (n < 0) {
            throw new RuntimeException("初始化队列容量参数异常");
        }
        arr = (T[]) new Object[n];
    }

    public void enqueue(T elem) {
        //队列中元素数量等于数组长度，将数组长度扩展一倍
        if (N >= arr.length) {
            resize(arr.length * 2);
        }
        arr[N++] = elem;
        System.out.println("queue["+ N +"]: " + elem);
    }

    public T dequeue() {
        if (N <= 0) {
            throw new RuntimeException("空队列！");
        }
        //取出队列头元素
        T elem = arr[0];
        //将所有剩余元素向前移动一位
        for (int i = 0; i < N - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[N-1] = null;
        //队列元素数量减1
        N--;
        //队列中元素数量不足数组长度1/4，将数组长度减半
        if (N <= arr.length / 4) {
            resize(arr.length / 2);
        }
        //返回头元素
        return elem;
    }

    public int size() {
        return N;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    private void resize(int max) {
        T[] newArr = (T[]) new Object[max];
        for (int i = 0; i < N; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<>() {
            private int i = 0;
            @Override
            public boolean hasNext() {
                return i < N;
            }

            @Override
            public T next() {
                return arr[i++];
            }
        };
    }
}
