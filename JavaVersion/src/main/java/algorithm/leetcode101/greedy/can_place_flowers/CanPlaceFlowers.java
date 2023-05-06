package algorithm.leetcode101.greedy.can_place_flowers;

/**
 * 605. Can Place Flowers
 * @author ：xiaobai
 * @date ：2022/1/20 10:51
 */
public class CanPlaceFlowers {

    public boolean canPlaceFlowers(int[] flowerbed, int n){
        if (n == 0){
            return true;
        }

        int length = flowerbed.length;
        if (length == 1){
            return flowerbed[0] == 0;
        }

        int num = 0;
        if (flowerbed[0] == 0 && flowerbed[1] == 0){
            flowerbed[0] = 1;
            ++num;
        }
        if (flowerbed[length-1] == 0 && flowerbed[length-2] == 0){
            flowerbed[length-1] = 1;
            ++num;
        }
        for (int i = 1; i < length-2; i++) {
            if (flowerbed[i] == 0 && flowerbed[i-1] == 0 && flowerbed[i+1] == 0){
                flowerbed[i] = 1;
                ++num;
            }
        }

        return num >= n;
    }
}
