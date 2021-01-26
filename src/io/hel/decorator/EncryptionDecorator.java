package io.hel.decorator;

/**
 * author: hel
 * date: 2021/1/23 15:21
 * description:
 */
public class EncryptionDecorator extends DataTranslateDecorator {
    private String type;
    private String key;

    public EncryptionDecorator(DataTranslate wrappee, String type, String key) {
        super(wrappee);
        this.type = type;
        this.key = key;
    }

    @Override
    public void writeData() {
        encrypt();
        System.out.println("encrypt successfully");
        super.writeData();
    }

    @Override
    public void readData() {
        super.readData();
        decrypt();
        System.out.println("decrypt successfully");
    }

    private void encrypt() {
        System.out.printf("encrypt type: %s\n", type);
        System.out.printf("encrypt key: %s\n", key);
    }

    private void decrypt() {
        System.out.printf("decrypt type: %s\n", type);
        System.out.printf("decrypt key: %s\n", key);
    }
}
