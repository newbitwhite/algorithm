package leetcode101.binary_search.single_element_in_a_sorted_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleElementInASortedArrayTest {

    @Test
    public void test_single_non_duplicate(){
        int[] nums = {1,1,3,2,2,4,4};
        int expected = 3;
        int i = new SingleElementInASortedArray().singleNonDuplicate(nums);
        System.out.println(i);
        Assertions.assertEquals(expected, i);
    }

}