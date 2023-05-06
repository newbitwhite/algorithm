package algorithm.fundamental.queue;

/**
 * 优先队列
 *   - MaxPriorityQueue() 创建一个优先队列
 *   - MaxPriorityQueue(int max) 创建一个初始容量为 max 的优先队列
 *   - MaxPriorityQueue(Key[] a) 用 a[] 中的元素创建一个优先队列
 *   - void Insert(Key v) 向优先队列中插入一个元素
 *   - Key max() 返回最大元素
 *   - Key delMax() 删除并返回最大元素
 *   - boolean isEmpty() 返回队列是否为空
 *   - int size() 返回优先队列中的元素个数
 * @author xiaobai
 * @date 2022-02-21 00:36
 */
@SuppressWarnings("all")
public class MaxPriorityQueue<T extends Comparable<T>> {
    private T[] pq;
    private int N;

    private static int DEFAULT_CAP = 10;

    public MaxPriorityQueue(){
        this(DEFAULT_CAP);
    }

    public MaxPriorityQueue(int max){
        if (max < 0){
            throw new RuntimeException("参数错误");
        }
        pq = (T[]) new Object[max + 1];
    }

    public MaxPriorityQueue(T[] a){
        pq = (T[]) new Object[a.length + 1];
        for (int i = 0; i < a.length - 1; i++) {
            insert(a[i]);
        }
    }

    public void insert(T elem){
        if (N == pq.length - 1){
            resize(2 * pq.length);
        }
        pq[++N] = elem;
        swim(N);
    }

    public T max(){
        if (N <= 0){
            throw new RuntimeException("空队列");
        }
        return pq[1];
    }

    public T delMax(){
        if (N <= 0){
            throw new RuntimeException("空队列");
        }
        T elem = pq[1];
        exch(1, N);
        pq[N] = null;
        --N;
        sink(1);
        if (N < pq.length / 4){
            resize(pq.length / 2);
        }
        return elem;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    private boolean less(int i, int j) {
        return pq[i].compareTo(pq[j]) < 0;
    }

    private void exch(int i, int j) {
        T t = pq[i];
        pq[i] = pq[j];
        pq[j] = t;
    }

    /**
     * 上浮
     * @param k
     */
    private void swim(int k){
        while (k > 1 && less(k/2, k)){
            exch(k/2, k);
            k = k/2;
        }
    }

    /**
     * 下沉
     * @param k
     */
    private void sink(int k){
        while (2 * k <= N){
            int j = 2*k;
            if (j < N && less(j, j  + 1)){
                j++;
            }
            if (!less(k, j)){
                break;
            }
            exch(j, k);
            k = j;
        }
    }

    private void resize(int max) {
        T[] newA = (T[]) new Object[max];
        for (int i = 0; i < N; i++) {
            newA[i] = pq[i];
        }
        pq = newA;
    }
}
