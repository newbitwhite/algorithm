package algorithm.leetcode101.greedy.partition_labels;

import java.util.LinkedList;
import java.util.List;

/**
 * 763.Partition Labels
 * @author ：xiaobai
 * @date ：2022/1/21 8:53
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {
        //all char last index
        int[] ints = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            ints[chars[i] - 'a'] = i;
        }

        //current intervals last index
        int idx = 0;
        //last intervals last index
        int last = -1;
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < chars.length; i++) {
            idx = Math.max(idx, ints[chars[i] - 'a']);
            if (idx == i){
                list.add(i-last);
                last = i;
            }
        }
        return list;
    }
}
