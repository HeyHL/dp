package io.hel.singleton.type6;

/**
 * author: hel
 * date: 2020/12/28 22:11
 * description: 静态内部类（推荐使用）
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
    // 静态内部类不随外部类的加载而加载（lazy loading）
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        // 外部类访问静态内部类成员时，静态内部类加载（类加载机制提供线程安全）
        return SingletonInstance.INSTANCE;
    }
}