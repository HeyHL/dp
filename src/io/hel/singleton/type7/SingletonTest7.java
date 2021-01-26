package io.hel.singleton.type7;

/**
 * author: hel
 * date: 2020/12/28 22:21
 * description: 懒汉式-枚举（推荐使用）
 */
public class SingletonTest7 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        instance.printOrdinal();
        instance2.printOrdinal();
    }
}
enum Singleton {
    INSTANCE;
    public void printOrdinal() {
        System.out.println(INSTANCE.ordinal());
    }
}