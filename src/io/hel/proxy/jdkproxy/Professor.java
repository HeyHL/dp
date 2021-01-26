package io.hel.proxy.jdkproxy;

/**
 * author: hel
 * date: 2021/1/3 10:35
 * description:动态代理-JDK代理
 * 角色：被代理类
 */
public class Professor implements Teach{
    @Override
    public void teach() {
        System.out.println("Professor starts to teach");
    }

    @Override
    public void sayHello(String name) {
        System.out.printf("hello guys, i am %s\n", name);
    }
}
