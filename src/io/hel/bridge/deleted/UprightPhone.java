package io.hel.bridge.deleted;

/**
 * author: hel
 * date: 2021/1/2 10:38
 * description:
 */
public class UprightPhone extends Phone{
    public UprightPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void on() {
        System.out.print("upright ");
        super.on();
    }

    @Override
    protected void off() {
        System.out.print("upright");
        super.off();
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("upright");
    }
}
