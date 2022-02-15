package fundamental.sort;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortTest {
    @Test
    public void test_sort() {
        Integer[] nums = {3, 44, 38, 5, 47, 15, 36, 26, 27, 2, 46, 4, 19, 50, 48};
        Integer[] expected = {2, 3, 4, 5, 15, 19, 26, 27, 36, 38, 44, 46, 47, 48, 50};
        //选择排序
        Selection.sort(nums);
        //插入排序
        Assertions.assertArrayEquals(expected, nums);
    }
}
