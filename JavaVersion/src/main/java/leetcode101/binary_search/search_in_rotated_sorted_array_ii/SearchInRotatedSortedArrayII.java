package leetcode101.binary_search.search_in_rotated_sorted_array_ii;

/**
 * 81. Search in Rotated Sorted Array II [Medium]
 * @author xiaobai
 * @date 2022-01-31 15:28
 */
public class SearchInRotatedSortedArrayII {

    public boolean search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l<=r){
            int mid = l + (r-l)/2;

            if (nums[mid] == target){
                return true;
            }

            if (nums[mid] == nums[l]){
                l++;
            }else if (nums[mid] < nums[l]){
                //右区间递增
                if(nums[mid] < target && target <= nums[r]){
                    l = mid + 1;
                }else{
                    r = mid -1;
                }
            }else{
                //左区间递增
                if (nums[l] <= target && target < nums[mid]){
                    r = mid -1;
                }else{
                    l = mid + 1;
                }
            }
        }
        return false;
    }

}
