package algorithm.leetcode101.greedy.non_descreasing_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NonDecreasingArrayTest {

    @Test
    public void test_check_possibility(){
        int[] ints = {5,7,1,8};
        boolean b = new NonDecreasingArray().checkPossibility(ints);
        System.out.println(b);
        Assertions.assertEquals(false, b);
    }
}
