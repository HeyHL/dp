package io.hel.bridge.deleted;

/**
 * author: hel
 * date: 2021/1/21 22:23
 * description:
 */
public class Client {
    public static void main(String[] args) {
        FoldingPhone foldingXMPhone = new FoldingPhone(new XM());
        foldingXMPhone.on();
        foldingXMPhone.call();
        foldingXMPhone.off();
        System.out.println();
        UprightPhone uprightXMPhone = new UprightPhone(new XM());
        uprightXMPhone.on();
        uprightXMPhone.call();
        uprightXMPhone.off();
    }
}
