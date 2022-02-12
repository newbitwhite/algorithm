package fundamental.dynamic_array;

import java.util.Arrays;

/**
 * 动态数组
 * @author admin
 */
public class DynamicArray<T>{
    private static final int DEFAULT_CAPACITY = 10;

    private int N;
    private Object[] elementData;

    public DynamicArray(){
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity){
        elementData = new Object[capacity];
    }

    public void add(T elem){
        ensureCapacity();
        elementData[N++] = elem;
    }

    public void remove(int index){
        for (int i = index; i < N; i++) {
            elementData[i] = elementData[i+1];
        }
        elementData[N] = null;
        //数组大小减1
        N--;
    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T) elementData[index];
    }

    public void set(int index, T elem){
        if (index > N){
            throw new RuntimeException("索引越界");
        }
        elementData[index] = elem;
    }

    public int size(){
        return N;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity(){
        int length = elementData.length;
        if (N >= length){
            length *= 2;
            elementData = Arrays.copyOf(elementData, length);
        }
    }
}
