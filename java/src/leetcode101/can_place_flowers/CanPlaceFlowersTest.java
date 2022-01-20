package leetcode101.can_place_flowers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CanPlaceFlowersTest {

    @Test
    public void test_can_place_flowers(){
        int[] ints = {1,0,0,0,1};
        int n = 2;
        boolean b = new CanPlaceFlowers().canPlaceFlowers(ints, n);
        System.out.println(b);
        Assertions.assertEquals(false, b);
    }

}
