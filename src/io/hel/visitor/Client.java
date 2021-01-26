package io.hel.visitor;

/**
 * author: hel
 * date: 2021/1/7 22:16
 * description:
 */
public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        objectStructure.attach(new Man());
        objectStructure.attach(new Woman());
        // 第一次分派：将具体访问者作为参数传递给具体元素
        objectStructure.display(new Pass());
//        objectStructure.display(new NotPass());
    }
}
