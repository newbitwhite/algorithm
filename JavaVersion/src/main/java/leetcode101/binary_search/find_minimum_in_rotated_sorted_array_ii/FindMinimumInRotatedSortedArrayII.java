package leetcode101.binary_search.find_minimum_in_rotated_sorted_array_ii;

/**
 * 154. Find Minimum in Rotated Sorted Array II [Hard]
 *
 * @author xiaobai
 * @date 2022-01-31 16:38
 */
public class FindMinimumInRotatedSortedArrayII {

    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int res = 5001;
        while (l <= r) {
            if (nums[l] < nums[r]){
                return nums[l];
            }
            int mid = l + (r - l) / 2;
            res = Math.min(nums[mid], res);
            if (nums[l] == nums[mid]) {
                l++;
            } else if (nums[l] > nums[mid]) {
                //右区间递增
                r = mid;
            } else {
                //左区间递增
                l = mid;
            }
        }
        return res;
    }
}
