package io.hel.builder.deleted;

import io.hel.builder.FastFoodDirector;
import io.hel.builder.KFCFastFoodBuilder;
import io.hel.builder.KFCMealSeries;

/**
 * author: hel
 * date: 2021/1/1 10:45
 * description:
 */
public class Client {
    public static void main(String[] args) {
        SoyMilkBuilder soyMilkBuilder = new SoyMilkBuilder();
        Director director = new Director();
        director.setBuilder(soyMilkBuilder);
        SoyMilk soyMilk = director.makeSoyMilk();
        System.out.println(soyMilk);
        SoyMilk result = soyMilkBuilder.getResult();
        System.out.println(result);

    }
}
