package io.hel.base.principle.liskov;

/**
 * author: hel
 * date: 2020/12/27 19:15
 * description:
 */
public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        B b = new B();
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("3-2+9=" + b.func2(3, 2));
    }
}
class A {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}
class B extends A {
    // 违背里氏替换原则：对于基类的非抽象方法，子类应该尽量少地去覆盖
    public int func1(int num1, int num2) {
        return num1 + num2;
    }
    public int func2(int num1, int num2) {
        return func1(num1, num2) + 9;
    }
}