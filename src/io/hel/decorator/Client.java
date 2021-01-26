package io.hel.decorator;

/**
 * author: hel
 * date: 2021/1/23 15:31
 * description:
 */
public class Client {
    public static void main(String[] args) {
        DataTranslate fileData = new FileDataTranslate("hello.txt");
        //fileData.writeData();
        fileData = new EncryptionDecorator(fileData, "AES", "123");
//        fileData.writeData();
        fileData = new CompressionDecorator(fileData, "zip", 0.35F);
        fileData.writeData();
    }
}
