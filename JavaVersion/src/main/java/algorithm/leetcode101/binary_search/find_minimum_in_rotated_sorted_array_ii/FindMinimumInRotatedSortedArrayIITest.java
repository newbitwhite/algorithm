package algorithm.leetcode101.binary_search.find_minimum_in_rotated_sorted_array_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FindMinimumInRotatedSortedArrayIITest {

    @Test
    public void test_find_min(){
        int[] nums = {10,1,10,10,10};
        int expected = 1;
        int min = new FindMinimumInRotatedSortedArrayII().findMin(nums);
        System.out.println(min);
        Assertions.assertEquals(expected, min);
    }
}
