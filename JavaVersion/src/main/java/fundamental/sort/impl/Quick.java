package fundamental.sort.impl;

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
    }

    private static void quickSort(Comparable[] arr, int low, int high){
        Comparable posElem = arr[low];
        int index = partition(arr, low, high);
        quickSort(arr, low, index-1);
        quickSort(arr, index+1, high);
    }

    private static int partition(Comparable[] arr, int low, int high){
        return 0;
    }
}
