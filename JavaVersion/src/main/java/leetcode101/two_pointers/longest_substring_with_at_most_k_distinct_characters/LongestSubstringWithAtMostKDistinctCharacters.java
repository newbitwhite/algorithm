package leetcode101.two_pointers.longest_substring_with_at_most_k_distinct_characters;

import java.util.Collections;
import java.util.HashMap;

/**
 * 340. Longest Substring with At Most K Distinct Characters [Medium]
 * @author xiaobai
 * @date 2022-01-30 16:49
 */
public class LongestSubstringWithAtMostKDistinctCharacters {

    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        if (k == 0){
            return 0;
        }

        HashMap<Character, Integer> statisticsMap = new HashMap<>();
        int maxCharacterLength = 1;
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            statisticsMap.put(s.charAt(right), right);
            if (statisticsMap.size() > k){
                int del_idx = Collections.min(statisticsMap.values());
                statisticsMap.remove(s.charAt(del_idx));
                left = del_idx + 1;
            }
            maxCharacterLength = Math.max(maxCharacterLength, right - left + 1);
            right++;
        }
        return maxCharacterLength;
    }
}
