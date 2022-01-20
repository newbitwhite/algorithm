package leetcode101.assign_cookies;

import java.util.Arrays;

/**
 * 455.Assign Cookies [Easy]
 * @author ：xiaobai
 * @date ：2022/1/19 16:46
 */
public class AssignCookies {
    public int findContentChildren(int[] kids, int[] cookies){
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
