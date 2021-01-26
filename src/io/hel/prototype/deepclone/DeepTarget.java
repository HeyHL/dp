package io.hel.prototype.deepclone;

import java.io.Serializable;

/**
 * author: hel
 * date: 2021/1/1 9:31
 * description:
 */
public class DeepTarget implements Serializable, Cloneable {
    private static final long serialVersionUID = -6849794470754667711L;
    private String name;
    private int age;
    private String hobby;

    public DeepTarget(String name, int age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
