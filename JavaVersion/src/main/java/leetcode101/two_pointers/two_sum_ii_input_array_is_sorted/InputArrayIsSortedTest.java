package leetcode101.two_pointers.two_sum_ii_input_array_is_sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class InputArrayIsSortedTest {

    @Test
    public void test_two_sum(){
        int[] ints = {2,6,7,11,15};
        int[] res = new InputArrayIsSorted().twoSum(ints, 18);
        System.out.println(Arrays.toString(res));
        Assertions.assertArrayEquals(new int[]{3,4}, res);
    }
}