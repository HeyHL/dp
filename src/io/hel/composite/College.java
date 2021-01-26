package io.hel.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hel
 * date: 2021/1/2 14:43
 * description:
 */
public class College extends OrganizationComponent{
    private List<OrganizationComponent> faculties = new ArrayList<>();
    public College(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        if (component instanceof Faculty)
            faculties.add(component);
        else
            throw new UnsupportedOperationException("type mismatched");
    }

    @Override
    public void remove(OrganizationComponent component) {
        if (component instanceof Faculty)
            faculties.remove(component);
        else
            throw new UnsupportedOperationException("type mismatched");
    }

    @Override
    public void print() {
        System.out.printf("+++%s+++\n", getName());
        for (OrganizationComponent faculty: faculties) {
            faculty.print();
        }
    }
}
