package io.hel.proxy.cglibproxy;

/**
 * author: hel
 * date: 2021/1/3 11:12
 * description:动态代理-Cglib代理
 * 角色：被代理类
 * 描述：不用实现接口或者继承，简单类也可以被代理
 */
public class Professor {
    public void teach() {
        System.out.println("Professor starts to teach");
    }
}
