package io.hel.visitor;

import java.util.LinkedList;
import java.util.List;

/**
 * author: hel
 * date: 2021/1/7 22:14
 * description:访问者模式
 * 角色：对象结构
 * 描述：维护元素，将访问者作为参数调用元素的接收方法。
 */
public class ObjectStructure {
    private List<Person> personList = new LinkedList<>();

    public void attach(Person person) {
        personList.add(person);
    }

    public void detach(Person person) {
        personList.remove(person);
    }

    public void display(Action action) {
        for (Person person: personList) {
            person.accept(action);
        }
    }
}
