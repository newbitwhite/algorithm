package leetcode101.two_pointers.merge_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortedArrayTest {

    @Test
    public void test_merge(){
        int[] nums1 = {1};
        int[] nums2 = {};
        int m = nums1.length - nums2.length;
        int n = nums2.length;
        new MergeSortedArray().merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));
        Assertions.assertArrayEquals(new int[]{1}, nums1);
    }

}
