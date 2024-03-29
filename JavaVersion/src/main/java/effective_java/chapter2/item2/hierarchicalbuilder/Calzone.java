package effective_java.chapter2.item2.hierarchicalbuilder;

/**
 * 半月型比萨
 * @author ：xiaobai
 * @date ：2023/5/4 15:51
 */
public class Calzone extends Pizza{

    private final boolean sauceInside;

    public static class Builder extends Pizza.Builder<Builder>{
        private boolean sauceInside = false;
        public Builder sauceInside(){
            this.sauceInside = true;
            return this;
        }
        @Override
        Pizza build() {
            return new Calzone(this);
        }
        @Override
        protected Builder self() {
            return this;
        }
    }

    private Calzone(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }

    @Override
    public String toString() {
        return "Calzone{" +
                "sauceInside=" + sauceInside +
                ", toppings=" + toppings +
                '}';
    }
}
