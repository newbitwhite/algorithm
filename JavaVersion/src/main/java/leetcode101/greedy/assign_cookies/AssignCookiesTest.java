package leetcode101.greedy.assign_cookies;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssignCookiesTest {

    @Test
    public void test_assign(){
        int[] kids = new int[]{2,3,3,1,1};
        int[] cookies = new int[]{1,2,2,2,3};
        int func = new AssignCookies().findContentChildren(kids, cookies);
        System.out.println(func);
        Assertions.assertEquals(4, func);
    }
}
