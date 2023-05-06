package effective_java.chapter2.item3.staticfactory;

import java.io.Serializable;

/**
 * @author ：xiaobai
 * @date ：2023/5/5 8:51
 */
public class Evils implements Serializable {
    private static final Evils INSTANCE = new Evils();

    private Evils() {
    }

    public static Evils getInstance(){
        return INSTANCE;
    }

    public void out(){
        System.out.println("Whoa baby, I'm outta here!");
    }



    public static void main(String[] args) {
        System.out.println(Evils.getInstance());
    }
}
