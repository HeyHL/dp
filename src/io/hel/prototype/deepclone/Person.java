package io.hel.prototype.deepclone;

import java.io.*;

/**
 * author: hel
 * date: 2021/1/1 9:33
 * description: 深拷贝
 */
public class Person implements Serializable, Cloneable {
    private static final long serialVersionUID = -6849794470754667700L;
    private String name;
    private int age;
    private DeepTarget friend;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setFriend(DeepTarget friend) {
        this.friend = friend;
    }

    public DeepTarget getFriend() {
        return friend;
    }

    /**
     * 深拷贝方式一：重写clone方法
     * 这种方式对每一个非String的引用数据类型的成员变量都需要一一处理，较为繁琐，不推荐使用
     * @return 深拷贝后的克隆对象
     */
    @Override
    protected Object clone() {
        Person person = null;
        try {
            // 利用默认的clone方法拷贝基本数据类型和String类型
            person = (Person) super.clone();
            // 对于非String的引用类型成员变量进行手工处理，也即调用其默认的clone方法，如果存在多个非String的引用类型成员变量，则都需要一一调用其默认的clone方法，较为繁琐
            DeepTarget newFriend = (DeepTarget) this.friend.clone();
            // 指向拷贝后的引用类型成员变量
            person.friend = newFriend;
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return person;
    }

    /**
     * 深拷贝方式二：利用对象的序列化机制实现，推荐使用
     * @return 深拷贝后的克隆对象
     */
    public Person deepClone() {
        Person person = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        try {
            // 创建一个字节输出流存放序列化的对象
            bos = new ByteArrayOutputStream();
            // 创建一个对象输出流
            oos = new ObjectOutputStream(bos);
            // 将对象写出到指定的输出流中（此处为字节输出流）
            oos.writeObject(this);
            // 根据上文中的字节输出流创建对象输入流
            ois = new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            // 将写出的数据读回
            person = (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
                if (oos != null)
                    oos.close();
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return person;
    }
}
