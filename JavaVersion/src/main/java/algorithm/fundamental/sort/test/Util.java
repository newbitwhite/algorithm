package algorithm.fundamental.sort.test;

/**
 * 排序工具类
 * @author xiaobai
 * @program: algorithm
 * @description
 * @date 2022-02-15 23:36
 */
@SuppressWarnings("all")
public class Util {
    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static boolean lessOrEqual(Comparable v, Comparable w) {
        return v.compareTo(w) <= 0;
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static void assign(Comparable[] a, int i, int j) {
        a[i] = a[j];
    }

    public static void show(Comparable[] a) {  // 在单行中打印数组
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    public static boolean isSorted(Comparable[] a) {  // 测试数组元素是否有序
        for (int i = 1; i < a.length; i++)
            if (less(a[i], a[i - 1])) return false;
        return true;
    }
}
