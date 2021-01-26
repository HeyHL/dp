package io.hel.singleton.type3;

/**
 * author: hel
 * date: 2020/12/28 21:29
 * description: 懒汉式-线程不安全（不得使用）
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
class Singleton {
    private static Singleton instance;
    private Singleton() {}
    public static Singleton getInstance() {
        // lazy loading
        if (instance == null) {
            // 线程A还未执行完被挂起时（也即此时instance仍为null），线程B进入到这里，那么构造器会被调用两次，存在两个对象实例，违背了单例模式
            instance = new Singleton();
        }
        return instance;
    }
}