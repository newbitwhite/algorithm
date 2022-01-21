package leetcode101.greedy.non_decreasing_array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NonDecreasingArrayTest {

    @Test
    public void test_check_possibility(){
        int[] ints = {-1,4,2,3};
        boolean b = new NonDecreasingArray().checkPossibility(ints);
        System.out.println(b);
        Assertions.assertEquals(true, b);
    }

}
