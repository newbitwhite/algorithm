package fundamental.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SortTest {
    @Test
    public void test_sort() {
        int[] nums = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        int[] expected = {2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50};
        //快速排序
        new QuickSort().sort(nums);
        System.out.println(Arrays.toString(nums));
        Assertions.assertArrayEquals(expected, nums);
    }
}
