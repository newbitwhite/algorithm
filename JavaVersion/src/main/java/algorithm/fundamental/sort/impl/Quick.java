package algorithm.fundamental.sort.impl;

import algorithm.fundamental.sort.test.Util;

/**
 * 快速排序
 *
 * @author ：xiaobai
 * @date ：2022/2/12 10:56
 */
@SuppressWarnings("all")
public class Quick{
    public static void sort(Comparable[] arr) {

        quickSort(arr, 0, arr.length-1);
//        Util.show(arr);
    }

    private static void quickSort(Comparable[] arr, int low, int high){
        if(low >= high){
            return;
        }
        Comparable posElem = arr[low];
        int index = partition(arr, low, high);
        quickSort(arr, low, index-1);
        quickSort(arr, index+1, high);
    }

    private static int partition(Comparable[] arr, int low, int high){
        int index = low;
        int i = low;
        int j = high;
        while (true){
            while (Util.lessOrEqual(arr[i], arr[index])){
                if (i >= high){
                    break;
                }
                ++i;
            }
            while (!Util.less(arr[j], arr[index])){
                if (j <= low){
                    break;
                }
                --j;
            }
            if (i >= j){
                break;
            }
            Util.exch(arr, i, j);
        }
        Util.exch(arr, index, j);
        return j;
    }
}
