package leetcode101.greedy.minimum_number_of_arrows_to_burst_balloons;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MinimumNumberOfArrowsToBurstBalloonsTest {
    @Test
    public void test_find_min_arrow_shots(){
        int[][] ints = {{1,2}, {3,4}, {5, 6}, {7, 8}};
        int minArrowShots = new MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(ints);
        System.out.println(minArrowShots);
        Assertions.assertEquals(4, minArrowShots);
    }
}
