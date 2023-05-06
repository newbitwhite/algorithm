package effective_java.chapter2.item3.enumtype;

/**
 * @author ：xiaobai
 * @date ：2023/5/5 9:56
 */
public enum Evils {
    INSTANCE;

    public void out() {
        System.out.println("Whoa baby, I'm outta here!");
    }



    public static void main(String[] args) {
        Evils.INSTANCE.out();
    }
}
