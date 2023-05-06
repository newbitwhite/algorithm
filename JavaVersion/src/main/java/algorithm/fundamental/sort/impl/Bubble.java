package algorithm.fundamental.sort.impl;

import algorithm.fundamental.sort.test.Util;

/**
 * 冒泡排序
 * @author ：xiaobai
 * @date ：2022/2/12 10:28
 */
@SuppressWarnings("all")
public class Bubble{

    public static void sort(Comparable[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (!Util.lessOrEqual(a[j], a[j+1])){
                    Util.exch(a, j, j+1);
                }
            }
        }
//        Util.show(a);
    }
}
