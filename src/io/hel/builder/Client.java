package io.hel.builder;

/**
 * author: hel
 * date: 2021/1/1 10:45
 * description:
 */
public class Client {
    public static void main(String[] args) {
        KFCFastFoodBuilder kfcFastFoodBuilder = new KFCFastFoodBuilder();
        FastFoodDirector fastFoodDirector = new FastFoodDirector(kfcFastFoodBuilder);
        fastFoodDirector.make();
        KFCMealSeries kfcMealSeries = kfcFastFoodBuilder.getResult();
        System.out.println(kfcMealSeries);
    }
}
