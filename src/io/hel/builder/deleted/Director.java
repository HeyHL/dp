package io.hel.builder.deleted;

/**
 * author: hel
 * date: 2021/1/19 22:41
 * description:
 */
public class Director {
    private Builder builder;

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public SoyMilk makeSoyMilk() {
        builder.filter();
        builder.clean();
        builder.soak();
        builder.grind();
        if (!(builder instanceof SoyMilkBuilder))
            throw new RuntimeException("");
        SoyMilkBuilder soyMilkBuilder = (SoyMilkBuilder) builder;
        return soyMilkBuilder.getResult();
    }

    public Coffee makeCoffee() {
        if (!(builder instanceof CoffeeBuilder))
            throw new RuntimeException("");
        CoffeeBuilder coffeeBuilder = (CoffeeBuilder) builder;
        return coffeeBuilder.getResult();
    }
}
