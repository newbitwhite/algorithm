package leetcode101.greedy.non_decreasing_array;

/**
 * 665. Non-decreasing Array
 * @author ：xiaobai
 * @date ：2022/1/21 15:49
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int limit = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i+1]){
                limit++;
            }
            if (limit > 1){
                return false;
            }
            if (i > 0 && nums[i-1] > nums[i+1]){
                nums[i+1] = nums[i];
            }
        }
        return true;
    }
}
