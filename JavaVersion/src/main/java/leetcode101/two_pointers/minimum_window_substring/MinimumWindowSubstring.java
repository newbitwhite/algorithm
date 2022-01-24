package leetcode101.two_pointers.minimum_window_substring;

import java.util.HashMap;

/**
 * 76. Minimum Window Substring
 * @author ：xiaobai
 * @date ：2022/1/24 16:16
 */
public class MinimumWindowSubstring {

    public String minWindow(String s, String t) {
        //统计t
        char[] tChars = t.toCharArray();
        HashMap<Character, Integer> statistics = new HashMap<>(tChars.length);
        for (char tCh: tChars) {
            //getOrDefault()
            int tChNums = statistics.getOrDefault(tCh, 0);
            statistics.put(tCh, ++tChNums);
        }
        //寻找满足条件的s的子串
        char[] sChars = s.toCharArray();
        int count = 0;
        int minSize = sChars.length;
        int minLeft = 0;
        int left = 0;
        for (int right = 0; right < sChars.length; right++) {
            if (statistics.containsKey(sChars[right])){
                if (statistics.get(sChars[right]) > 0){
                    ++count;
                    statistics.put(sChars[right], statistics.get(sChars[right])-1);
                }

                while (count == tChars.length){
                    if (statistics.containsKey(sChars[left]) && ){
                        --count;
                        statistics.put(sChars[left], statistics.get(sChars[left])+1);
                    }
                    if (minSize > right-left + 1){
                        minSize = right-left + 1;
                        minLeft = left;
                    }
                    ++left;
                }
            }
        }
        if (minSize > 0){
            return s.substring(minLeft, minLeft+minSize);
        }
        return "";
    }

}
