package io.hel.bridge.deleted;

/**
 * author: hel
 * date: 2021/1/2 10:33
 * description:
 */
public class FoldingPhone extends Phone{
    public FoldingPhone(Brand brand) {
        super(brand);
    }

    @Override
    protected void on() {
        System.out.print("Foldable ");
        super.on();
    }

    @Override
    protected void off() {
        System.out.print("Foldable ");
        super.off();
    }

    @Override
    protected void call() {
        super.call();
        System.out.println("Foldable ");
    }
}
