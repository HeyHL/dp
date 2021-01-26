package io.hel.factory.factorymethod;

/**
 * author: hel
 * date: 2021/1/17 20:56
 * description:
 */
public class BmwFactory implements CarFactory {
    @Override
    public void buildEngine() {
        System.out.println("Manufacturing BMW's engine");
    }

    @Override
    public void assemble() {
        System.out.println("Assemble BMW cars");
    }

    @Override
    public Car getCar() {
        buildEngine();
        assemble();
        return new Bmw();
    }
}
