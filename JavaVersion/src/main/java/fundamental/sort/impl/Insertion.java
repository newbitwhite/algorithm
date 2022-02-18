package fundamental.sort.impl;

import fundamental.sort.test.Util;

/**
 * 插入排序
 * @author ：xiaobai
 * @date ：2022/2/12 10:34
 */
@SuppressWarnings("all")
public class Insertion{
    public static void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0; j--) {
                if(Util.less(arr[j], arr[j-1])){
                    Util.exch(arr, j, j-1);
                }
            }
        }
//        Util.show(arr);
    }
}
