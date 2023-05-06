package algorithm.leetcode101.greedy.non_descreasing_array;

/**
 * 665. Non-decreasing Array
 * @author xiaobai
 * @date 2022-01-21
 */
public class NonDecreasingArray {

    public boolean checkPossibility(int[] nums) {
        if (nums.length<=2){
            return true;
        }

        int count = 0;
        for (int i = 0; i < nums.length-1; i++) {
            int temp = nums[i];
            if (nums[i] > nums[i + 1]) {
                count++;
                nums[i] = nums[i+1];
            }
            if (count > 1) {
                return false;
            }
            if (i > 0 && nums[i - 1] > nums[i+1]) {
                nums[i] = temp;
                nums[i+1] = nums[i];
            }
        }
        return true;
    }
}
