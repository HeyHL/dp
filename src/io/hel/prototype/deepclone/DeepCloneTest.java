package io.hel.prototype.deepclone;

/**
 * author: hel
 * date: 2021/1/1 9:38
 * description: 深拷贝测试
 */
public class DeepCloneTest {
    public static void main(String[] args) {
        Person tom = new Person("tom", 1);
        tom.setFriend(new DeepTarget("jack", 1, "game"));
//        System.out.println("deeply clone with override clone method");
//        Person tom1 = (Person) tom.clone();
        System.out.println("deeply clone with serializable");
        Person tom1 = tom.deepClone();
        System.out.println(tom);
        System.out.println(tom1);
        System.out.println();
        System.out.println(tom.getFriend());
        System.out.println(tom1.getFriend());
    }
}
