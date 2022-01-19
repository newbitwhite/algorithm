package leetcode101.candy;

import java.util.Arrays;

/**
 * @author ：xiaobai
 * @date ：2022/1/19 16:46
 */
public class Candy {

    public int assign(int[] kidsScores){
        int[] candies = new int[kidsScores.length];
        Arrays.fill(candies, 1);

        for (int i = 0; i < kidsScores.length-1; i++) {
            if (kidsScores[i+1] > kidsScores[i]){
                candies[i+1] = candies[i] + 1;
            }
        }

        for (int i = kidsScores.length-1; i > 0; i--) {
            if (kidsScores[i-1] > kidsScores[i]){
                //易错点：这里的max很容易想不到，漏了
                candies[i-1] = Math.max(candies[i-1], candies[i] + 1);
            }
        }

        return Arrays.stream(candies).sum();
    }
}
