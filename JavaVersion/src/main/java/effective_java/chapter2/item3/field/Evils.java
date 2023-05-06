package effective_java.chapter2.item3.field;

/**
 * @author ：xiaobai
 * @date ：2023/5/5 8:46
 */
public class Evils {
    public static final Evils INSTANCE = new Evils();

    private Evils() {
    }

    public void out(){
        System.out.println("Whoa baby, I'm outta here!");
    }


    public static void main(String[] args) {
        Evils.INSTANCE.out();

    }
}
