package algorithm.fundamental.sort.impl;

import algorithm.fundamental.sort.test.Util;

/**
 * 归并排序
 * @author ：xiaobai
 * @date ：2022/2/12 10:36
 */
@SuppressWarnings("all")
public class Merge{

    public static void sort(Comparable[] arr) {
        if (arr.length <= 1){
            return;
        }
        Comparable[] aux = new Comparable[arr.length];
        //递归
//        sortByRecursion(arr, 0, arr.length - 1, aux);
        //迭代
        sortByIteration(arr, aux);
        Util.show(arr);
    }

    /**
     * 自顶向下，递归实现
     */
    private static void sortByRecursion(Comparable[] arr, int low, int high, Comparable[] aux) {
        if (low >= high){
            return;
        }
        //分解成两个子数组
        int mid = low + (high - low) / 2;
        sortByRecursion(arr, low, mid, aux);
        sortByRecursion(arr, mid + 1, high, aux);
        //合并
        merge(arr, low, mid, high, aux);
    }

    private static void merge(Comparable[] arr, int low, int mid, int high, Comparable[] aux){
        int i = low;
        int j = mid + 1;
        for (int k = low; k <= high; k++) {
            aux[k] = arr[k];
        }
        for (int k = low; k <= high; k++) {
            if (i > mid){
                arr[k] = aux[j++];
            }else if (j > high){
                arr[k] = aux[i++];
            }else if (Util.less(aux[j], aux[i])){
                arr[k] = aux[j++];
            }else{
                arr[k] = aux[i++];
            }
        }
    }

    /**
     * 自底向上，迭代实现
     */
    private static void sortByIteration(Comparable[] arr, Comparable[] aux) {
        int high;
        for (int sz = 1; sz < arr.length; sz *= 2) {
            for (int i = 0; i < arr.length - sz; i += 2 * sz) {
                high = Math.min(arr.length - 1, i + 2 * sz - 1);
                //这里的中值要用步长取，因为最后两个数组不一定等长【例如：14个元素，步长到4的时候，最后合并的是size(4)和size(2)， 而不是是size(3)和size(3)】
                merge(arr, i, i + sz - 1, high, aux);
            }
        }
    }
}
