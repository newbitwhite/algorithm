package algorithm.leetcode101.binary_search.sqrt_x;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SqrtXTest {

    @Test
    public void test_my_sqrt(){
        int x = 100;
        int i = new SqrtX().mySqrt(x);
        int expected = (int)Math.floor(Math.sqrt(x));
        System.out.print(x);
        System.out.println(" " + i);
        Assertions.assertEquals(expected, i);
    }
}
