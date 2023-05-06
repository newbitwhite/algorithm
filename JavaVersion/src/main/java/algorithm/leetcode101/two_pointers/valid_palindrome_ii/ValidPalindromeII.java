package algorithm.leetcode101.two_pointers.valid_palindrome_ii;

/**
 * 680.Valid Palindrome II [Easy]
 * @author xiaobai
 * @date 2022-01-29 11:12
 */
public class ValidPalindromeII {

    public boolean validPalindrome(String s) {
        int p1 = 0;
        int p2 = s.length()-1;
        while(p2 > p1){
            if (s.charAt(p1) == s.charAt(p2)){
                p1++;
                p2--;
            }else{
                return isPalindrome(s, p1 + 1, p2) || isPalindrome(s, p1, p2 - 1);
            }
        }
        return true;
    }

    private boolean isPalindrome(String s, int p1, int p2){
        System.out.println(p1);
        System.out.println(p2);
        while(p2 > p1){
            if (s.charAt(p1) == s.charAt(p2)){
                p1++;
                p2--;
            }else{
                return false;
            }
        }
        return true;
    }

}
