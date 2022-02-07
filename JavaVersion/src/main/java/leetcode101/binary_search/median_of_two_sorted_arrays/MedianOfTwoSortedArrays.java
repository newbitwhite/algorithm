package leetcode101.binary_search.median_of_two_sorted_arrays;

/**
 * 4. Median of Two Sorted Arrays [Hard]
 *
 * @author xiaobai
 * @date 2022-02-02 23:28
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        if ((len1 + len2) % 2 == 0) {
            return getKthElement(nums1, nums2, (len1 + len2) / 2 - 1)
                    + getKthElement(nums1, nums2, (len1 + len2) / 2)
                    / 2.0;
        } else {
            return getKthElement(nums1, nums2, (len1 + len2) / 2);
        }
    }

    private int getKthElement(int[] nums1, int[] nums2, int k) {
        //TODO
        return 0;
    }
}
