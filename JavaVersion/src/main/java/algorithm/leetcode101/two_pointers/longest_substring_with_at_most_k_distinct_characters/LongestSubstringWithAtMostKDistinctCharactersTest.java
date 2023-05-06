package algorithm.leetcode101.two_pointers.longest_substring_with_at_most_k_distinct_characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class LongestSubstringWithAtMostKDistinctCharactersTest {

    @Test
    public void test_length_of_longest_substring_k_distinct(){
        String s = "baacccacacabcaabbbb";
        int k = 2;
        int expected = 10;
        int i = new LongestSubstringWithAtMostKDistinctCharacters().lengthOfLongestSubstringKDistinct(s, k);
        System.out.println(i);
        Assertions.assertEquals(expected, i);
    }

}
