package leetcode101.assign_cookies;

import java.util.Arrays;

public class AssignCookies {
    public int assign(int[] kids, int[] cookies){
        Arrays.sort(kids);
        Arrays.sort(cookies);
        int kid = 0;
        int cookie = 0;
        for (; kid <= kids.length-1 && cookie <= cookies.length-1; cookie++) {
            if (kids[kid] <= cookies[cookie]){
                ++kid;
            }
        }
        return kid;
    }
}
