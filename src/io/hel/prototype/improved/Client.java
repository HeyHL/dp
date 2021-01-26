package io.hel.prototype.improved;

/**
 * author: hel
 * date: 2021/1/1 8:41
 * description:
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("tom", 1, "white");
        sheep.friend  = new Sheep("jack", 1, "gray");
        Sheep sheep1 = (Sheep) sheep.clone();
        Sheep sheep2 = (Sheep) sheep.clone();
        Sheep sheep3 = (Sheep) sheep.clone();
        Sheep sheep4 = (Sheep) sheep.clone();
        Sheep sheep5 = (Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(sheep1);
        System.out.println(sheep2);
        System.out.println(sheep3);
        System.out.println(sheep4);
        System.out.println(sheep5);
        // 默认的clone方法为浅拷贝
        System.out.println(sheep1.friend == sheep2.friend);
        System.out.println(sheep1.friend == sheep3.friend);
        System.out.println(sheep1.friend == sheep4.friend);
        System.out.println(sheep1.friend == sheep5.friend);
    }
}
