package leetcode101.two_pointers.sum_of_square_numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SumOfSquareNumbersTest {

    @Test
    public void test_judge_square_sum(){
        boolean b = new SumOfSquareNumbers().judgeSquareSum(2147483600);
        Assertions.assertTrue(b);
//        Assertions.assertFalse(b);
    }
}