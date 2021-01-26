package io.hel.prototype.improved;

/**
 * author: hel
 * date: 2021/1/1 8:31
 * description:
 */
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String nationality = "China";
    Sheep friend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    protected Object clone(){
        Sheep sheep = null;
        try {
          sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return sheep;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
