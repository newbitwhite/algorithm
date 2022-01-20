package leetcode101.minimum_number_of_arrows_to_burst_balloons;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 452.MinimumNumberOfArrowsToBurstBalloons
 * @author ：xiaobai
 * @date ：2022/1/20 14:07
 */
public class MinimumNumberOfArrowsToBurstBalloons {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 0){
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));

        int shotNum = 1;
        int currentShot = points[0][1];
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > currentShot){
                shotNum++;
                currentShot = points[i][1];
            }else{
                //this balloon is burst by currentShot...
            }
        }
        return shotNum;
    }
}
