package leetcode101.assign_cookies;

import java.util.Arrays;

/**
 *题目描述: 有一群孩子和一堆饼干，每个孩子有一个饥饿度，每个饼干都有一个大小。每个孩子只能吃
 *最多一个饼干，且只有饼干的大小大于等于孩子的饥饿度时，这个孩子才能吃饱。求解最多有多少孩
 *可以吃饱。
 * <p>
 *输入输出样例: 输入两个数组，分别代表孩子的饥饿度和饼干的大小。输出最多有多少孩子可以吃饱的数
 *量。
 * <p>Input: [1,2], [1,2,3]
 * <p>Output: 2
 * @author ：xiaobai
 * @date ：2022/1/19 14:11
 */
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
