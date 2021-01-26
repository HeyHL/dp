package io.hel.mediator;

/**
 * author: hel
 * date: 2021/1/9 17:47
 * description:中介者模式
 * 角色：抽象同事类
 * 描述： 每个具体同事类都有一个指向中介者的引用
 */
public abstract class Colleague {
    private Mediator mediator;
    private String name;

    public Mediator getMediator() {
        return mediator;
    }

    public String getName() {
        return name;
    }

    public Colleague(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    public abstract void sendMsg(String nextStep, String intention);
}
