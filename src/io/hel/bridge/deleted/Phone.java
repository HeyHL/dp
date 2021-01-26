package io.hel.bridge.deleted;

/**
 * author: hel
 * date: 2021/1/2 10:31
 * description:
 */
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void on() {
        brand.on();
    }

    protected void off() {
        brand.off();
    }

    protected void call() {
        brand.call();
    }
}
