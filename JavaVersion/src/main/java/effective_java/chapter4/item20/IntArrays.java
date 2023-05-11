package effective_java.chapter4.item20;

/**
 * @author ：xiaobai
 * @date ：2023/5/11 16:16
 */
import java.util.*;

// Concrete implementation built atop skeletal implementation (Page 101)
public class IntArrays {

    static List<Integer> intArrayAsList(int[] a) {
        Objects.requireNonNull(a);

        // The diamond operator is only legal here in Java 9 and later
        // If you're using an earlier release, specify <Integer>
        return new AbstractList<>() {

            @Override
            public int size() {
                return 0;
            }

            @Override
            public Integer get(int index) {
                return null;
            }

        };
    }

    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }

        List<Integer> list = intArrayAsList(a);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
