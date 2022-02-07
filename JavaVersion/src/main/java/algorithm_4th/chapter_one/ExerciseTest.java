package algorithm_4th.chapter_one;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

class ExerciseTest {

    @Test
    public void test_exercise_1_1_9(){
        int n = new Random().nextInt(10000);
        String expected = Integer.toBinaryString(n);
        String s = new Exercise().exercise_1_1_9(n);
        System.out.println(n);
        System.out.println(s);
        Assertions.assertEquals(expected, s);
    }

    @Test
    public void test_exercise_1_1_11(){
        char[][] chars = {{'*', ' ', '*'}, {' ', '*', ' '}, {'*', ' ', '*'}};
        new Exercise().exercise_1_1_11(chars);
    }

    @Test
    public void test_exercise_1_1_13(){
        int[][] ints = {{1,1}, {2,2}, {3,3}};
        new Exercise().exercise_1_1_13(ints);
    }

    @Test
    public void test_exercise_1_1_14(){
        int n = 10;
        int i = new Exercise().exercise_1_1_14(n);
        System.out.println(i);
        Assertions.assertEquals((int)Math.floor(Math.log(n) / Math.log(2)), i);
    }

    /**
     * 反转字符串（练习1.2.7
     * @param s 原字符串
     * @return 反转的字符串
     */
    public static String mystery(String s)
    {
        int N = s.length();
        if (N <= 1) return s;
        String a = s.substring(0, N/2);
        String b = s.substring(N/2, N);
        return mystery(b) + mystery(a);
    }


    public static void main(String[] args) {
        System.out.println(mystery("hello"));
    }
}