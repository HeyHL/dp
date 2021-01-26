package io.hel.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hel
 * date: 2021/1/2 14:40
 * description: 组合模式Composite
 */
public class University extends OrganizationComponent{
    private List<OrganizationComponent> colleges = new ArrayList<>();
    public University(String name) {
        super(name);
    }

    @Override
    public void add(OrganizationComponent component) {
        if (component instanceof College)
            colleges.add(component);
        else
            throw new UnsupportedOperationException("type mismatched");
    }

    @Override
    public void remove(OrganizationComponent component) {
        if (component instanceof College)
            colleges.remove(component);
        else
            throw new UnsupportedOperationException("type mismatched");
    }

    @Override
    public void print() {
        System.out.printf("******%s******\n", getName());
        for (OrganizationComponent college: colleges) {
            college.print();
        }
    }
}
