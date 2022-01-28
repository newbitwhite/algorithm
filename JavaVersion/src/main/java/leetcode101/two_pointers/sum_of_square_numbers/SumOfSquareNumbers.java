package leetcode101.two_pointers.sum_of_square_numbers;

/**
 * 633. Sum of Square Numbers【Medium】
 * @author ：xiaobai
 * @date ：2022/1/25 17:11
 */
public class SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {
        double sqrt = Math.floor(Math.sqrt(c));
        System.out.println(sqrt);
        long oneNum = 0;
        long twoNum = (int)sqrt;
        for (long i = 0; i <= (long)sqrt; i++) {
            long res = oneNum * oneNum + twoNum * twoNum;
            if (res == c){
                System.out.println("oneNums:" + oneNum);
                System.out.println("twoNum:" + twoNum);
                return true;
            }else if (res > c){
                twoNum--;
            }else{
                oneNum++;
            }
        }
        return false;
    }
}
