package leetcode101.two_pointers.two_sum_ii_input_array_is_sorted;

/**
 * 167. Two Sum II - Input Array Is Sorted
 *
 * @author xiaobai
 * @date 2022-01-23
 */
public class InputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int hign = numbers.length - 1;
        while (true) {
            int tempRes = numbers[low] + numbers[hign];
            if (tempRes == target) {
                break;
            }
            if (tempRes < target) {
                low++;
            }
            if (tempRes > target) {
                hign--;
            }
        }
        return new int[]{low + 1, hign + 1};
    }
}
