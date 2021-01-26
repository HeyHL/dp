package io.hel.builder;

/**
 * author: hel
 * date: 2021/1/20 11:36
 * description:
 */
public class McDonaldsFastFoodBuilder implements FastFoodBuilder{
    private McDonaldsMealSeries mcDonaldsMealSeries = new McDonaldsMealSeries();
    @Override
    public void makeBurger() {
        System.out.println("McDonald's builder make burger");
    }

    @Override
    public void makeFries() {
        System.out.println("McDonald's builder make fries");
    }

    @Override
    public void makeChickenWings() {
        System.out.println("McDonald's builder make chicken wings");
    }

    @Override
    public void makeChickenLeg() {
        System.out.println("McDonald's builder make chicken leg");
    }

    @Override
    public void coke() {
        System.out.println("McDonald's builder make coke");
    }

    @Override
    public void iceCream() {
        System.out.println("McDonald's builder make iced cream");
    }

    public McDonaldsMealSeries getResult() {
        mcDonaldsMealSeries.setPrice(22.1F);
        return mcDonaldsMealSeries;
    }
}
