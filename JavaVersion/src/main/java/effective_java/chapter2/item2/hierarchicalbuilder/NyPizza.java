package effective_java.chapter2.item2.hierarchicalbuilder;

/**
 * 经典纽约风味比萨
 * @author ：xiaobai
 * @date ：2023/5/4 15:40
 */
public class NyPizza extends Pizza{

    public enum Size { SMALL, MEDIUM, LARGE }

    private final Size size;

    public static class Builder extends Pizza.Builder<Builder>{
        private final Size size;
        public Builder(Size size) {
            this.size = size;
        }
        @Override
        Pizza build() {
            return new NyPizza(this);
        }
        @Override
        protected Builder self() {
            return this;
        }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" +
                "size=" + size +
                ", toppings=" + toppings +
                '}';
    }
}
