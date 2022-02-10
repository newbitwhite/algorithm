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
        if (len1 == 0) {
            return len2 % 2 == 0 ? (double) (nums2[len2 / 2 - 1] + nums2[len2 / 2]) / 2 : nums2[len2 / 2];
        }
        if (len2 == 0) {
            return len1 % 2 == 0 ? (double) (nums1[len1 / 2 - 1] + nums1[len1 / 2]) / 2 : nums1[len1 / 2];
        }
        if ((len1 + len2) % 2 == 0) {
            int kthElement1 = getKthElement(nums1, nums2, (len1 + len2) / 2);
            int kthElement2 = getKthElement(nums1, nums2, (len1 + len2) / 2+1);
            return (kthElement1 + kthElement2) / 2.0;
        } else {
            return getKthElement(nums1, nums2, (len1 + len2) / 2+1);
        }
    }

    private int getKthElement(int[] nums1, int[] nums2, int k) {
        int nums1Pos = 0;
        int nums2Pos = 0;
        int len1 = nums1.length;
        int len2 = nums2.length;
        while (k > 1) {
            int index = k / 2 - 1;
            if (nums1[(Math.min(len1 - 1, nums1Pos + index))] >= nums2[(Math.min(len2 - 1, nums2Pos + index))]) {
                nums2Pos += index + 1;
            } else {
                nums1Pos += index + 1;
            }
            k -= (index + 1);
        }
        return Math.min(nums1[nums1Pos], nums2[nums2Pos]);
    }
}
