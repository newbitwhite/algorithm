package fundamental.sort.impl;

import fundamental.sort.test.Util;

/**
 * 选择排序
 * @author ：xiaobai
 * @date ：2022/2/12 10:33
 */
@SuppressWarnings("all")
public class Selection{
    public static void sort(Comparable[] arr) {
        int N = arr.length;
        for (int i = 0; i < N; i++) {
            //定义最小元素为当前索引的元素
            int minIndex = i;
            //遍历数组剩余元素，找到最小元素的索引
            for (int j = i; j < N; j++) {
                if (Util.less(arr[j], arr[minIndex])){
                    minIndex = j;
                }
            }
            //将当前元素和最小元素交换位置
            Util.exch(arr, i, minIndex);
        }
//        Util.show(arr);
    }
}
