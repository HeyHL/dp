package io.hel.mediator;


/**
 * author: hel
 * date: 2021/1/9 17:46
 * description:中介者模式
 * 角色：中介者接口
 * 描述：声明了与组件交流的方法
 */
public interface Mediator {

    void register(String name, Colleague colleague);

    void getMsg(String from, String nextStep, String intention);
}
