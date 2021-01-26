package io.hel.composite;

/**
 * author: hel
 * date: 2021/1/2 14:47
 * description: 组合模式Leaf
 */
public class Faculty extends OrganizationComponent{
    public Faculty(String name) {
        super(name);
    }

    @Override
    public void print() {
        System.out.printf("#%s#\n", getName());
    }
}
