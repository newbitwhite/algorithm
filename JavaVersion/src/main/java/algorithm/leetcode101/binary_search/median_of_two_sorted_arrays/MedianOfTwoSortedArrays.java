package algorithm.leetcode101.binary_search.median_of_two_sorted_arrays;

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
            return len2 % 2 == 0 ? (nums2[len2 / 2 - 1] + nums2[len2 / 2]) / 2.0 : nums2[len2 / 2];
        }
        if (len2 == 0) {
            return len1 % 2 == 0 ? (nums1[len1 / 2 - 1] + nums1[len1 / 2]) / 2.0 : nums1[len1 / 2];
        }
        if ((len1 + len2) % 2 == 0) {
            int kthElement1 = getKthElement(nums1, nums2, (len1 + len2) / 2);
            int kthElement2 = getKthElement(nums1, nums2, (len1 + len2) / 2 + 1);
            return (kthElement1 + kthElement2) / 2.0;
        } else {
            return getKthElement(nums1, nums2, (len1 + len2) / 2 + 1);
        }
    }

    private int getKthElement(int[] nums1, int[] nums2, int k) {
        /* 主要思路：要找到第 k (k>1) 小的元素，那么就取 pivot1 = nums1[k/2-1] 和 pivot2 = nums2[k/2-1] 进行比较
         * 这里的 "/" 表示整除
         * nums1 中小于等于 pivot1 的元素有 nums1[0 .. k/2-2] 共计 k/2-1 个
         * nums2 中小于等于 pivot2 的元素有 nums2[0 .. k/2-2] 共计 k/2-1 个
         * 取 pivot = min(pivot1, pivot2)，两个数组中小于等于 pivot 的元素共计不会超过 (k/2-1) + (k/2-1) <= k-2 个
         * 这样 pivot 本身最大也只能是第 k-1 小的元素
         * 如果 pivot = pivot1，那么 nums1[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除"，剩下的作为新的 nums1 数组
         * 如果 pivot = pivot2，那么 nums2[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除"，剩下的作为新的 nums2 数组
         * 由于我们 "删除" 了一些元素（这些元素都比第 k 小的元素要小），因此需要修改 k 的值，减去删除的数的个数
         */
        int length1 = nums1.length;
        int length2 = nums2.length;
        int index1 = 0;
        int index2 = 0;

        while (true) {
            // 边界情况
            if (index1 == length1) {
                return nums2[index2 + k - 1];
            }
            if (index2 == length2) {
                return nums1[index1 + k - 1];
            }
            if (k == 1) {
                return Math.min(nums1[index1], nums2[index2]);
            }

            // 正常情况
            int half = k / 2;
            int newIndex1 = Math.min(index1 + half, length1) - 1;
            int newIndex2 = Math.min(index2 + half, length2) - 1;
            if (nums1[newIndex1] <= nums2[newIndex2]) {
                k -= (newIndex1 - index1 + 1);
                index1 = newIndex1 + 1;
            } else {
                k -= (newIndex2 - index2 + 1);
                index2 = newIndex2 + 1;
            }
        }
    }
}
