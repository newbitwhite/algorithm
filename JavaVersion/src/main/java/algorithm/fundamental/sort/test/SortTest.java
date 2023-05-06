package algorithm.fundamental.sort.test;

import algorithm.fundamental.sort.impl.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@SuppressWarnings("all")
class SortTest {
    @Test
    public void test_sort() {
        String alg1 = "Bubble";
        String alg2 = "Insertion";
        int N = 10;
        int T = 1;
        // 算法 1 的总时间
        double t1 = timeRandomInput(alg1, N, T);
        // 算法 2 的总时间
        double t2 = timeRandomInput(alg2, N, T);
        System.out.println(String.format("For %d random Doubles\n %s is", N, alg1));
        System.out.print(String.format(" %.1f times faster than %s\n",t2 / t1, alg2));
    }

    /**
     *使用算法 alg 将 T 个长度为 N 的数组排序
     */
    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        // 进行一次测试(生成一个数组并排序)
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) {
                a[i] = Math.random();
            }
            total += time(alg, a);
            //断言数组是否有序
            Assertions.assertTrue(Util.isSorted(a));
        }
        return total;
    }

    public static double time(String alg, Double[] a) {
        Stopwatch timer = new Stopwatch();
        if (alg.equals("Insertion")) {
            Insertion.sort(a);
        }
        if (alg.equals("Selection")) {
            Selection.sort(a);
        }
        if (alg.equals("Shell")) {
            Shell.sort(a);
        }
        if (alg.equals("Merge")) {
            Merge.sort(a);
        }
        if (alg.equals("Bubble")) {
            Bubble.sort(a);
        }
        if (alg.equals("Quick")) {
            Quick.sort(a);
        }
        if (alg.equals("Heap")) {
            Heap.sort(a);
        }
        return timer.elapsedTime();
    }
}

/**
 * 程序运行时间计时类
 */
class Stopwatch {
    private final long start;

    public Stopwatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
}
