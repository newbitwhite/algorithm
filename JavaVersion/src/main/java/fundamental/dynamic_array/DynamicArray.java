package fundamental.dynamic_array;

import java.util.Arrays;

public class DynamicArray<T>{
    private static final int DEFAULT_CAPACITY = 10;
    private static final int CAPACITY_STEP = 10;
    private int size;
    private int length;
    private Object[] elementData;

    public DynamicArray(){
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity){
        length = capacity;
        elementData = new Object[capacity];
    }

    public void add(T addVar){
        ensureCapacity();
        elementData[size] = addVar;
        ++size;
    }

    public void remove(int index){

    }

    @SuppressWarnings("unchecked")
    public T get(int index){
        return (T) elementData[index];
    }

    public void set(int index, T addVar){

    }

    public int size(){
        return size;
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity(){
        if (size >= length){
            length += CAPACITY_STEP;
            Object[] ts = new Object[length];
            for (int i = 0; i < size; i++) {
                Arrays.copyOf(elementData, length);
            }
            elementData = ts;
        }
    }
}
