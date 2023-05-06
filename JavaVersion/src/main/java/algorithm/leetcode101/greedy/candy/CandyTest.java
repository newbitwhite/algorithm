package algorithm.leetcode101.greedy.candy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CandyTest {

    @Test
    public void test_assign(){
        int[] ints = {1,2,1,2,3,1,1};
        int assign = new Candy().candy(ints);
        System.out.println(assign);
        Assertions.assertEquals(11, assign);
    }

}
