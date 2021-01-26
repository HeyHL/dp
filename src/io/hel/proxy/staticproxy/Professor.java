package io.hel.proxy.staticproxy;

/**
 * author: hel
 * date: 2021/1/3 9:57
 * description: 代理模式-静态代理
 * 角色：被代理类
 */
public class Professor implements Teach{
    @Override
    public void teach() {
        System.out.println("Professor starts to teach");
    }
}
