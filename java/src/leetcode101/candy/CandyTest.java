package leetcode101.candy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CandyTest {

    @Test
    public void test_assign(){
        int[] ints = {1,0,2,3,4,4};
        int assign = new Candy().assign(ints);
        System.out.println(assign);
        Assertions.assertEquals(13, assign);
    }

}
