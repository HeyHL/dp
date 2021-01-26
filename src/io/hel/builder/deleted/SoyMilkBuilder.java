package io.hel.builder.deleted;

/**
 * author: hel
 * date: 2021/1/19 22:31
 * description:
 */
public class SoyMilkBuilder implements Builder {
    private SoyMilk soyMilk = new SoyMilk();
    @Override
    public void filter() {
        System.out.println("filtering soybeans to make soy milk");
    }

    @Override
    public void clean() {
        System.out.println("cleaning soybeans to make soy milk");
    }

    @Override
    public void soak() {
        soyMilk.setTimeOfSoak(5);
        System.out.println("Soak before grinding");
    }

    @Override
    public void grind() {
        soyMilk.setTimeOlfGrind(10);
        System.out.println("grinding");
    }

    public SoyMilk getResult() {
        return soyMilk;
    }
}
