package effective_java.chapter2.item2.hierarchicalbuilder;

import static effective_java.chapter2.item2.hierarchicalbuilder.NyPizza.Size.SMALL;
import static effective_java.chapter2.item2.hierarchicalbuilder.Pizza.Topping.HAM;
import static effective_java.chapter2.item2.hierarchicalbuilder.Pizza.Topping.MUSHROOM;

/**
 * @author ：xiaobai
 * @date ：2023/5/4 15:59
 */
public class PizzaTest {

    public static void main(String[] args) {
        //test1
        Pizza nyPizza = new NyPizza.Builder(SMALL).addTopping(MUSHROOM).addTopping(HAM).build();
        System.out.println(nyPizza);
        //test2
        Pizza calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();
        System.out.println(calzone);
    }
}
