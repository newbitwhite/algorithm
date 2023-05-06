package algorithm.leetcode101.binary_search.find_first_and_last_position_of_element_in_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class FindFirstAndLastPositionOfElementInSortedArrayTest {

    @Test
    public void test_search_range() {
        int[] nums = {3, 3, 4, 4, 6};
        int target = 4;
        int[] expected = {2, 2};
        int[] ints = new FindFirstAndLastPositionOfElementInSortedArray().searchRange(nums, target);
        System.out.println(Arrays.toString(ints));
        Assertions.assertArrayEquals(expected, ints);
    }
}
