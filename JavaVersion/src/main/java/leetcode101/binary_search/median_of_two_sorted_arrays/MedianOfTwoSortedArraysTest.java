package leetcode101.binary_search.median_of_two_sorted_arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MedianOfTwoSortedArraysTest {

    @Test
    public void test_find_median_sorted_arrays(){
        int[] nums1 = {};
        int[] nums2 = {2,3};
        double expected = 2.5;
        double medianNumber = new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1, nums2);
        System.out.println(medianNumber);
        Assertions.assertEquals(expected, medianNumber);
    }

}
