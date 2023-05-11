package effective_java.chapter4.item19;

import java.time.Instant;

/**
 * Demonstration of what can go wrong when you override a method  called from constructor
 * <p>演示在构造其中调用可覆盖的方法会发生什么问题</p>
 * @author ：xiaobai
 * @date ：2023/5/11 15:36
 */
public class Sub extends Super{
    /** Blank final, set by constructor **/
    private final Instant instant;

    Sub(){
        this.instant = Instant.now();
    }

    /**Overriding method invoked by superclass constructor**/
    @Override
    public void overrideMe() {
        System.out.println(instant);
    }


    public static void main(String[] args) {
        final Sub sub = new Sub();
        sub.overrideMe();
    }
}
