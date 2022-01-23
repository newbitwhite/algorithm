package leetcode101.greedy.non_descreasing_array;

/**
 * 665. Non-decreasing Array
 * @author xiaobai
 * @date 2022-01-21
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                nums[i] = nums[i + 1];
            }
            if (count > 1) {
                return false;
            }
            if (i > 0 && nums[i - 1] > nums[i]) {
                return false;
            }
        }
        return true;
    }
}
