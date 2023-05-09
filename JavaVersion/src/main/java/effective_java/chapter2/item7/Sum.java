package effective_java.chapter2.item7;

/**
 * @author ：xiaobai
 * @date ：2023/5/5 16:53
 */
public class Sum {

    public static long sum(){
        long sum = 0L;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        return sum;
    }


    public static void main(String[] args) {
        long start = System.nanoTime();
        long x = sum();
        long end = System.nanoTime();
        System.out.println((end - start) / 1_000_000. + " ms.");
    }

}
