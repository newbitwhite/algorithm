package effective_java.chapter3.item14;

/**
 * @author ：xiaobai
 * @date ：2023/5/9 11:26
 */
public class CaseInsensitiveString implements Comparable<CaseInsensitiveString>{

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    @Override
    public int compareTo(CaseInsensitiveString o) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, o.s);
    }

    public static void main(String[] args) {
        effective_java.chapter3.item10.CaseInsensitiveString s1 = new effective_java.chapter3.item10.CaseInsensitiveString("ignore");
        String s2 = "ignore";
        System.out.println(s1.equals(s1));
        System.out.println("s1=s2:" + s1.equals(s2) + ", s2=s1:" + s2.equals(s1));
    }
}
