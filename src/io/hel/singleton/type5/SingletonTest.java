package io.hel.singleton.type5;

/**
 * author: hel
 * date: 2020/12/28 21:54
 * description: 懒汉式-线程安全-DCL(Double Check Lock)（推荐使用）
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance == instance2);
    }
}
class Singleton {
    // volatile保证可见性
    private static volatile Singleton instance;
    private Singleton(){}
    public static Singleton getInstance() {
        // 在instance被创建后可以直接返回，避免了每次都同步处理，提升效率
        if (instance == null) {
            synchronized (Singleton.class) {
                // 防止进入第一层if判断的两个线程创建两个实例，由于instance被volatile修饰，假如线程A先获取到锁，完成了对象实例的创建，那么此时主存中的instance != null，线程B就不会再调用构造器
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}