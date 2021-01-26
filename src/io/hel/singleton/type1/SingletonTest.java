package io.hel.singleton.type1;

/**
 * author: hel
 * date: 2020/12/28 21:11
 * description: 单例模式-饿汉式-静态变量
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
class Singleton {
    private Singleton() {}
    // instance随着类的加载而创建，避免了多线程环境下的线程安全问题，但是不能达到懒加载效果，如果getInstance方法一直不被调用，那么内存中的instance就会造成内存空间的浪费
    private static Singleton instance = new Singleton();
    public static Singleton getInstance() {
        return instance;
    }
}