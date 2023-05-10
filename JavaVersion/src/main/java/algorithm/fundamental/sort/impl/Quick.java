package algorithm.fundamental.sort.impl;

import algorithm.fundamental.sort.test.Util;

import java.util.Arrays;
import java.util.Random;

/**
 * 快速排序
 * 任意找一个基准数（一般就是第一个数），每轮排序是小于基准数的值在左侧，大于基准数的值在右侧。
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

    public static void Quick_Sort(int[] arr, int begin, int end) {
        if(begin > end)
            return;
        int index = arr[begin];
        int i = begin;
        int j = end;
        while(i != j){
            while(arr[j] <= index && j > i){
                j--;
            }
            while(arr[i] >= index && j > i){
                i++;
            }
            if(j > i){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        arr[begin] = arr[i];
        arr[i] = index;
        System.out.println(""+ begin + end  + "每轮排序结果：" + Arrays.toString(Arrays.copyOfRange(arr, begin, end + 1)));
        Quick_Sort(arr, begin, i-1);
        Quick_Sort(arr, i+1, end);
    }

    public static void main(String[] args) {
        int times = 1;
        int bound = 7;
        for (int i = 0; i < times; i++) {
            final int size = new Random().nextInt(bound);
            final int[] ints = new int[size];
            for (int j = 0; j < ints.length; j++) {
                ints[j] = new Random().nextInt(bound);
            }
            System.out.println("  排序前     ："+ Arrays.toString(ints));
            Quick_Sort(ints, 0, size - 1);
            System.out.println("  排序后     ："+Arrays.toString(ints));
            System.out.println();
        }
    }
}
