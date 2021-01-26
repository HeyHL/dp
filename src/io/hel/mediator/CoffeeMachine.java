package io.hel.mediator;

/**
 * author: hel
 * date: 2021/1/9 18:02
 * description:
 */
public class CoffeeMachine extends Colleague {

    public CoffeeMachine(Mediator mediator, String name) {
        super(mediator, name);
        mediator.register(name, this);
    }

    @Override
    public void sendMsg(String nextStep, String intention) {

    }

    public void startWorking() {
        System.out.println("Coffee machine grinding coffee");
    }

    public void stopWorking() {
        System.out.println("Turn off the coffee machine");
    }
}
