package leetcode101.two_pointers.minimum_window_substring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumWindowSubstringTest {

    @Test
    public void test_min_window(){
        String resStr = new MinimumWindowSubstring().minWindow("ADOBECODEBANC", "ABC");
        System.out.println(resStr);
        Assertions.assertEquals("BANC", resStr);
    }

}
