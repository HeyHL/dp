package io.hel.mediator;

/**
 * author: hel
 * date: 2021/1/9 19:40
 * description:中介者模式
 * 角色：具体同事类
 * 描述：包含业务逻辑的类。
 */
public class Curtains extends Colleague {
    public Curtains(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMsg(String nextStep, String intention) {

    }

    public void up() {
        System.out.println("Open the curtains to welcome the first ray of sunshine in the morning");
    }

    public void down() {
        System.out.println("Close the curtains");
    }
}
