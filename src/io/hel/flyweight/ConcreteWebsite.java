package io.hel.flyweight;

/**
 * author: hel
 * date: 2021/1/2 22:28
 * description:
 */
public class ConcreteWebsite extends Website {
    private String type;

    public ConcreteWebsite(String type) {
        this.type = type;
    }

    @Override
    protected void use(Manager manager) {
        System.out.printf("%s manages the website in the form of a %s\n", manager.getName(), type);
    }
}
