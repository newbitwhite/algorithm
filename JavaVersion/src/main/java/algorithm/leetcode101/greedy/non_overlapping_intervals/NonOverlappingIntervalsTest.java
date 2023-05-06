package algorithm.leetcode101.greedy.non_overlapping_intervals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class NonOverlappingIntervalsTest {

    @Test
    public void test_erase_overlap_intervals(){
        int[][] arr = {{0, 2}, {1, 3}, {2, 4}, {3,5}, {4,6}};
        int i = new NonOverlappingIntervals().removeOverlapIntervals(arr);
        System.out.println(i);
        Assertions.assertEquals(2, i);
    }
}
