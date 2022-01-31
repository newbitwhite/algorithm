package leetcode101.binary_search.search_in_rotated_sorted_array_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedSortedArrayIITest {

    @Test
    public void test_search(){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        boolean expected = true;
        boolean search = new SearchInRotatedSortedArrayII().search(nums, target);
        System.out.println(search);
        Assertions.assertEquals(expected, search);
    }
}