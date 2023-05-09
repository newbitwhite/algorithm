package effective_java.chapter3.item10;

/**
 * @author ：xiaobai
 * @date ：2023/5/8 17:43
 */
public class CaseInsensitiveString {

    private final String s;

    public CaseInsensitiveString(String s) {
        this.s = s;
    }

    // Broken - violates symmetry!
    @Override public boolean equals(Object o) {
        if (o instanceof CaseInsensitiveString) {
            return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
        }
        // One-way interoperability!
        if (o instanceof String)
        {
            return s.equalsIgnoreCase((String) o);
        }
        return false;
    }

//    // Fixed equals method (right!)
//    @Override public boolean equals(Object o) {
//        return o instanceof CaseInsensitiveString &&
//                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
//    }


    public static void main(String[] args) {
        CaseInsensitiveString s1 = new CaseInsensitiveString("ignore");
        String s2 = "ignore";
        System.out.println(s1.equals(s1));
        System.out.println("s1=s2:" + s1.equals(s2) + ", s2=s1:" + s2.equals(s1));
    }
}
