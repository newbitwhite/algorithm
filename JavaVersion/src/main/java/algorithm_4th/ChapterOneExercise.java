package algorithm_4th;

/**
 * 第一章习题
 *
 * @author xiaobai
 * @date 2022-02-06 18:43
 */
public class ChapterOneExercise {

    /**
     * 将一个正整数 N 用二进制表示并转换为一个String类型的值
     *
     * @param n 正整数 N
     * @return 二进制string
     */
    public String exercise_1_1_9(int n) {
        StringBuilder s = new StringBuilder();
        for (int i = n; i > 0; i /= 2) {
            s.append((i % 2) + "", 0, 1);
        }
        return s.reverse().toString();
    }

    /**
     * 打印出一个二维布尔数组的内容,其中使用*表示真，空格表示假
     *
     * @param chars 二维布尔数组
     */
    public void exercise_1_1_11(char[][] chars) {
        System.out.print("\t");
        for (int j = 0; j < chars[0].length; j++) {
            System.out.print((j + 1) + "\t");
        }
        System.out.println();

        for (int i = 0; i < chars.length; i++) {
            System.out.print((i + 1) + "\t");
            for (int j = 0; j < chars[i].length; j++) {
                System.out.print(chars[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 编写一段代码打印出一个m行n列的二维数组的转置
     *
     * @param ints 二维数组
     */
    public void exercise_1_1_13(int[][] ints) {
        int m = ints.length;
        int n = ints[0].length;
        int[][] newArr = new int[n][m];
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + "\t");
                newArr[j][i] = ints[i][j];
            }
            System.out.println();
        }
        System.out.println("新数组：");
        for (int i = 0; i < newArr.length; i++) {
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    /**
     * 返回不超过log以2为底N的对数的最大整数
     * @param n N
     * @return 最大整数
     */
    public int exercise_1_1_14(int n) {
        if (n <= 1){
            return 0;
        }
        int i = 1;
        int res = 1;
        while (true) {
            res *= 2;
            if (res == n) {
                return i;
            }
            if (res > n){
                return i - 1;
            }
            i++;
        }
    }


}
