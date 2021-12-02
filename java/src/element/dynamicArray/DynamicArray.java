package element.dynamicArray;

import java.util.ArrayList;

/**
 * @author ：xiaobai
 * @date ：2021/12/2 16:35
 */
public class DynamicArray<T>{
    private static final int DEFAULT_CAPACITY = 10;
    private int size;

    private T[] data;

    public DynamicArray() {
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity) {
        this.data = (T[]) new Object[capacity];
    }
}