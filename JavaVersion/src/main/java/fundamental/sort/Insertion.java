package fundamental.sort;

import fundamental.sort.Utils.Util;

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
            int j = i;
            Comparable current = arr[i];
            while (j > 0 && Util.less(current, arr[j-1])) {
                Util.assign(arr, j, j-1);
                j--;
            }
            arr[j] = current;
        }
        Util.show(arr);
    }
}
