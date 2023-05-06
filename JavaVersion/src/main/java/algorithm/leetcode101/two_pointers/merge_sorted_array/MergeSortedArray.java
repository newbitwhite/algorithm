package algorithm.leetcode101.two_pointers.merge_sorted_array;

/**
 * 88. Merge Sorted Array
 * @author ：xiaobai
 * @date ：2022/1/24 9:09
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        int pos = m+n-1;

        while (true) {
            if (p2 < 0){
                break;
            }
            if (p1 < 0 || nums1[p1] <= nums2[p2]){
                nums1[pos] = nums2[p2];
                --p2;
            }else{
                nums1[pos] = nums1[p1];
                --p1;

            }
            --pos;
        }
    }
}
