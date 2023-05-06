package algorithm.leetcode101.binary_search.find_first_and_last_position_of_element_in_sorted_array;

/**
 * 34. Find First and Last Position of Element in Sorted Array [Medium]
 *
 * @author xiaobai
 * @date 2022-01-30 23:08
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums.length == 0) {
            return res;
        }
        res[0] = binarySearchLower(nums, target);
        res[1] = binarySearchUpper(nums, target);
        return res;
    }

    private int binarySearchLower(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int ans = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target){
                ans = mid;
            }
            if (nums[mid] >= target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }

    private int binarySearchUpper(int[] nums, int target) {
        int min = 0;
        int max = nums.length - 1;
        int ans = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (nums[mid] == target){
                ans = mid;
            }
            if (nums[mid] > target) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return ans;
    }
}
