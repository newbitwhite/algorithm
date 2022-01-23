package leetcode101.greedy.non_descreasing_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NonDecreasingArrayTest {

    @Test
    public void test_check_possibility(){
        int[] ints = {4,3,2};
        boolean b = new NonDecreasingArray().checkPossibility(ints);

        System.out.println(b);
        Assertions.assertEquals(false, b);
    }

}