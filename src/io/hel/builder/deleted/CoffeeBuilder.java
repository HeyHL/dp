package io.hel.builder.deleted;

/**
 * author: hel
 * date: 2021/1/19 22:39
 * description:
 */
public class CoffeeBuilder implements Builder {
    private Coffee coffee = new Coffee();

    @Override
    public void filter() {
        System.out.println("Screen high-quality coffee beans");
    }

    @Override
    public void clean() {
        System.out.println("cleaning coffee beans");
    }

    @Override
    public void soak() {
        coffee.setTimeOfSoak(10);
        System.out.println("Soak coffee beans");
    }

    @Override
    public void grind() {
        System.out.println("grind coffee beans");
    }

    public Coffee getResult() {
        coffee.setType("Long black");
        return coffee;
    }
}
