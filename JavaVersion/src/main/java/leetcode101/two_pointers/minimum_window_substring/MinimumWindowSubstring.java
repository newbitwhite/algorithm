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
        int count = 0;
        int minSize = s.length()+1;
        int minLeft = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            if (statistics.containsKey(s.charAt(right))){
                if (statistics.get(s.charAt(right)) > 0){
                    ++count;
                }
                statistics.put(s.charAt(right), statistics.get(s.charAt(right))-1);
                while (count == tChars.length){
                    if (minSize > right-left + 1){
                        minSize = right-left + 1;
                        minLeft = left;
                    }
                    if (statistics.containsKey(s.charAt(left))){
                        statistics.put(s.charAt(left), statistics.get(s.charAt(left))+1);
                        if(statistics.get(s.charAt(left))>0){
                            --count;
                        }
                    }
                    ++left;
                }
            }
        }
        System.out.println(minLeft);
        if (minSize <= s.length()){
            return s.substring(minLeft, minLeft+minSize);
        }
        return "";
    }
}
