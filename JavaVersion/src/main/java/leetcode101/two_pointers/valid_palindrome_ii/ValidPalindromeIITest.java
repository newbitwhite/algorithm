package leetcode101.two_pointers.valid_palindrome_ii;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeIITest {

    @Test
    public void test_valid_palindrome(){
        String s = "lcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupucul";
        boolean b = new ValidPalindromeII().validPalindrome(s);
        Assertions.assertTrue(b);
    }

}