package algorithm;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author ：xiaobai
 * @date ：2023/5/10 9:52
 */
public class Solution {
    public int[][] kClosest(int[][] points, int k) {
        Arrays.sort(points, Comparator.comparingInt(
                this::distance
        ));

        return Arrays.copyOfRange(points, 0, k);
    }

    private int distance(int[] point){
        return point[0] * point[0] + point[1] * point[1];
    }
}
