package algorithm.leetcode101.two_pointers.longest_word_in_dictionary_through_deleting;

import java.util.List;

/**
 * 524. Longest Word in Dictionary through Deleting [Medium]
 * @author xiaobai
 * @date 2022-01-29 17:08
 */
public class LongestWordInDictionaryThroughDeleting {

    public String findLongestWord(String s, List<String> dictionary) {
        //sort the dictionary
        dictionary.sort((s1, s2)->{
            if (s1.length() == s2.length()){
                return s1.compareTo(s2);
            }
            return s2.length() - s1.length();
        });
        System.out.println(dictionary);
        //return the first conformable str in dictionary
        for (String subStr: dictionary) {
            if (judgeSubStr(s, subStr)){
                return subStr;
            }
        }
        return "";
    }

    public boolean judgeSubStr(String str, String subStr){
        int pStr = 0;
        int pSubStr = 0;
        while(pSubStr < subStr.length() && pStr < str.length()) {
            if (str.charAt(pStr) == subStr.charAt(pSubStr)){
                pSubStr++;
            }
            pStr++;
        }
        if (pSubStr == subStr.length()){
            return true;
        }
        return false;
    }
}
