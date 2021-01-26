package io.hel.mediator;

/**
 * author: hel
 * date: 2021/1/9 17:49
 * description:
 */
public class Alarm extends Colleague {
    public Alarm(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMsg(String nextStep, String intention) {
        getMediator().getMsg(getName(), nextStep, intention);
    }

    public void rest() {
        System.out.println("A little tired and want to rest for a while");
        sendMsg("curtains", "down");
    }

    public void getUp() {
        System.out.println("The alarm clock goes off, ready to get up");
        sendMsg("curtains", "up");
    }
}
