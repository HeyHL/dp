package io.hel.singleton.type2;

/**
 * author: hel
 * date: 2020/12/28 21:20
 * description:单例模式-饿汉式-静态代码块
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
class Singleton {
    private Singleton(){}
    private static Singleton instance;
    static {
        // 此种方式与“静态变量”的方式类似，只是将new操作放在静态代码块中
        instance = new Singleton();
    }
    public static Singleton getInstance() {
        return instance;
    }
}