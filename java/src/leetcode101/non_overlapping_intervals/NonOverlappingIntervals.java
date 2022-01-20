package leetcode101.non_overlapping_intervals;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 435.non-overlapping intervals [Medium]
 * @author ：xiaobai
 * @date ：2022/1/20 8:50
 */
public class NonOverlappingIntervals {

    public int removeOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0){
            return 0;
        }
        //time：O(nlog(n))   space：O(log(n))
        Arrays.sort(intervals, Comparator.comparingInt((int[] a) -> a[1]));
        int removedIntervals = 0;
        int[] prev = intervals[0];
        //time：O(n)    space：O(1)
        for (int i = 1; i < intervals.length; i++) {
            if (prev[1] > intervals[i][0]){
                ++removedIntervals;
            }else{
                prev = intervals[i];
            }
        }
        //total time：O(nlog(n))    total space：O(log(n))
        return removedIntervals;
    }
}
