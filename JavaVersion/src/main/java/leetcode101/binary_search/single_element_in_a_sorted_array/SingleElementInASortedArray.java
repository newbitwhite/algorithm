package leetcode101.binary_search.single_element_in_a_sorted_array;

/**
 * 540. Single Element in a Sorted Array
 *
 * @author xiaobai
 * @date 2022-02-02 19:48
 * 思路：nums数组的特点是，在单元素没出现之前相同两元素的下标是偶，奇。单元素出现之后相同两元素的下标变成奇，偶。这个就是二分查找的判断依据
 */
public class SingleElementInASortedArray {

    public int singleNonDuplicate(int[] nums) {
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            int yu = mid % 2;
            if (nums[mid] == nums[mid-1]){
                if (yu == 0){
                    r = mid;
                }else{
                    l = mid + 1;
                }
            }else if (nums[mid] == nums[mid + 1]){
                if (yu == 0){
                    l = mid;
                }else{
                    r = mid - 1;
                }
            }else{
                return nums[mid];
            }
        }
        return nums[l];
    }

}
