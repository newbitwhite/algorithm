package effective_java.chapter2.item7;

import java.util.regex.Pattern;

/**
 * 罗马字符正则
 * @author ：xiaobai
 * @date ：2023/5/5 11:20
 */
public class RomanNumeralSlow {

    static boolean isRomanNumeralSlow(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    private static final Pattern ROMAN = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})"
            + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");

    static boolean isRomanNumeralFast(String s){
        return ROMAN.matcher(s).matches();
    }


    public static void main(String[] args) {
        int numSets = Integer.parseInt(args[0]);
        int numReps = Integer.parseInt(args[1]);
        boolean b = false;

        for (int i = 0; i < numSets; i++) {
            long start = System.nanoTime();
            for (int j = 0; j < numReps; j++) {
//                b ^= isRomanNumeralSlow("MCMLXXVI");
                b ^= isRomanNumeralFast("MCMLXXVI");
            }
            long end = System.nanoTime();
            System.out.println(((end - start) / (1_000. * numReps)) + " μs.");
        }

        // Prevents VM from optimizing away everything.
        if (!b){
            System.out.println();
        }
    }
}
