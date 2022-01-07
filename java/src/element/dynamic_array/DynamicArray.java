package element.dynamic_array;

class DynamicArray<T>{
    private static final int DEFAULT_CAPACITY = 10;
    private static final int CAPACITY_STEP = 10;
    private int size;
    private int length;
    private T[] elementData;

    public DynamicArray(){
        this(DEFAULT_CAPACITY);
    }

    public DynamicArray(int capacity){
        this.length = capacity;
        this.elementData = (T[])new Object[capacity];
    }

    public void add(T addVar){
        this.ensureCapacity();
        this.elementData[this.size] = addVar;
        ++this.size;
    }

    public void remove(int index){

    }

    public void get(int index){

    }

    public void set(int index, T addVar){

    }

    public int size(){
        return this.size;
    }

    public int length(){
        return this.length;
    }

    private void ensureCapacity(){
        if (this.size >= this.length){
            this.length += CAPACITY_STEP;
            T[] ts = (T[]) new Object[this.length];
            for (int i = 0; i < this.size; i++) {
                ts[i] = this.elementData[i];
            }
            this.elementData = ts;
        }
    }
}