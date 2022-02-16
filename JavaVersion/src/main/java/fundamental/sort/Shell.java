package fundamental.sort;

import fundamental.sort.Utils.Util;

/**
 * 希尔排序: 递减增量排序算法
 * @author ：xiaobai
 * @date ：2022/2/12 10:57
 */
@SuppressWarnings("all")
public class Shell {

    public static void sort(Comparable[] arr) {
        int N = arr.length;
        if (N <= 1){
            return;
        }
        //更新步长
        for (int step = N / 2; step >= 1; step /= 2) {
            //对每间隔step的元素排序
            for (int i = step; i < N; i++) {
                for (int j = i; j >= step; j-=step) {
                    if (Util.less(arr[j], arr[j-step])){
                        Util.exch(arr, j, j-step);
                    }
                }
            }
        }
        Util.show(arr);
    }
}
