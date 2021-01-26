package io.hel.composite;

/**
 * author: hel
 * date: 2021/1/2 14:38
 * description: 组合模式Component
 */
public abstract class OrganizationComponent {
    private String name;

    public void add(OrganizationComponent component) {

    }

    public void remove(OrganizationComponent component) {

    }

    public abstract void print();

    public OrganizationComponent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
