package io.hel.templatemethod;

/**
 * author: hel
 * date: 2021/1/3 12:22
 * description:
 */
public class PureSoyMilk extends GrindDrinks {

    @Override
    protected void filter() {
        System.out.println("filtering soybeans to make soy milk");
    }

    @Override
    protected void clean() {
        System.out.println("cleaning soybeans to make soy milk");
    }

    @Override
    protected void addIngredients() {

    }

    @Override
    protected void soak() {
        System.out.println("Soak before grinding");
    }

    @Override
    protected void grind() {
        System.out.println("grinding");
    }

}