package io.hel.singleton.type4;

/**
 * author: hel
 * date: 2020/12/28 21:38
 * description: 懒汉式-线程安全-同步方法（不推荐使用）
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
    private Singleton(){}
    // 对该方法的每次调用都做同步处理是低效的，正确的做法是，只在第一次调用时做同步处理，后续可以直接返回instance。
    public static synchronized Singleton getInstance() {
        // lazy loading
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}