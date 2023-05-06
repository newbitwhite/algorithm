package algorithm.leetcode101.two_pointers.longest_word_in_dictionary_through_deleting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class LongestWordInDictionaryThroughDeletingTest {

    @Test
    public void test_find_longest_word(){
        List<String> dictionary = new ArrayList<>(List.of("ale","apple","monkey","plea"));
        String subStr = new LongestWordInDictionaryThroughDeleting().findLongestWord("abpcplea", dictionary);
        System.out.println(subStr);
        Assertions.assertEquals("apple", subStr);
    }

    @Test
    public void test_judge_subStr(){
        Assertions.assertTrue(new LongestWordInDictionaryThroughDeleting().judgeSubStr("abpcplea", "apple"));
    }

}
