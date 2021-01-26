package io.hel.templatemethod;

/**
 * author: hel
 * date: 2021/1/3 12:05
 * description:模板方法模式
 * 角色：具体子类
 */
public class PeanutSoyMilk extends GrindDrinks {

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
        System.out.println("Add some peanuts");
    }

    @Override
    protected void soak() {
        System.out.println("Soak before grinding");
    }

    @Override
    protected void grind() {
        System.out.println("grinding");
    }

    @Override
    protected boolean needIngredients() {
        return true;
    }
}