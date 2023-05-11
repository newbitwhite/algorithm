package algorithm;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author ：xiaobai
 * @date ：2023/5/10 9:52
 */
public class Solution {

    public static int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((array1, array2) -> array2[0] - array1[0]);

        for (int i = 0; i < k; ++i) {
            pq.offer(new int[]{points[i][0] * points[i][0] + points[i][1] * points[i][1], i});
        }
        int n = points.length;
        for (int i = k; i < n; ++i) {
            int dist = points[i][0] * points[i][0] + points[i][1] * points[i][1];
            if (dist < pq.peek()[0]) {
                pq.poll();
                pq.offer(new int[]{dist, i});
            }
        }
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; ++i) {
            ans[i] = points[pq.poll()[1]];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] arr = {{1,3},{-2,2},{1,1}};
        System.out.println(Arrays.deepToString(Solution.kClosest(arr, 2)));
    }
}
