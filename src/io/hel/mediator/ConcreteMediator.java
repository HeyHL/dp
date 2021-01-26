package io.hel.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * author: hel
 * date: 2021/1/9 17:55
 * description:中介者模式
 * 角色：具体中介者
 * 描述：具体中介者通常会保存所有同事类的引用并对其进行管理
 */
public class ConcreteMediator implements Mediator {
    private Map<String, Colleague> colleagueMap;

    public ConcreteMediator() {
        this.colleagueMap = new HashMap<>();
    }

    @Override
    public void register(String name, Colleague colleague) {
        colleagueMap.put(name, colleague);
    }

    @Override
    public void getMsg(String from, String nextStep, String intention) {
        System.out.println("previous step is from " + from);
        Colleague colleague = colleagueMap.get(nextStep);
        if (colleague instanceof Curtains) {
            Curtains curtains = (Curtains) colleague;
            if ("up".equalsIgnoreCase(intention)) {
                curtains.up();
            } else if ("down".equalsIgnoreCase(intention)) {
                curtains.down();
            }
        }
    }


}
