package io.hel.templatemethod;

/**
 * author: hel
 * date: 2021/1/24 19:36
 * description:
 */
public class Coffee extends GrindDrinks {
    @Override
    protected void filter() {
        System.out.println("Screen high-quality coffee beans");
    }

    @Override
    protected void clean() {
        System.out.println("cleaning coffee beans");
    }

    @Override
    protected void addIngredients() {

    }

    @Override
    protected void soak() {
        System.out.println("Soak coffee beans");
    }

    @Override
    protected void grind() {
        System.out.println("grind coffee beans");
    }
}
