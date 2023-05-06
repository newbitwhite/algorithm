package effective_java.chapter2.item2.builder;

/**
 * @author ：xiaobai
 * @date ：2023/5/4 16:43
 */
public class NutritionFactsTest {

    public static void main(String[] args) {
        NutritionFacts nutritionFacts = new NutritionFacts.Builder(1, 1)
                .calories(2).carbohydrate(4).fat(5).sodium(6).build();
        System.out.println(nutritionFacts);
    }
}
