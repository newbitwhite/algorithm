package leetcode101.binary_search.sqrt_x;

/**
 * 69. Sqrt(x) [Easy]
 * @author xiaobai
 * @date 2022-01-30 20:47
 */
public class SqrtX {

    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r-l) / 2;
            if ((long) mid * mid == x){
                return mid;
            } else if ((long) mid * mid < x) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }


}
