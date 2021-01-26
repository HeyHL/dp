package io.hel.base.principle.liskov.improved;

/**
 * author: hel
 * date: 2020/12/27 19:21
 * description: 里氏替换原则
 */
public class LiskovSubstitution {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        B b = new B();
        System.out.println("1+3=" + b.func1(1, 3));
        System.out.println("2-9+9=" + b.func2(2, 9));
    }
}
class Base {

}
class A extends Base {
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}
class B extends Base {
    // 通过组合代替原有的继承
    private A a = new A();
    public int func1(int num1, int num2) {
        return num1 + num2;
    }
    public int func2(int num1, int num2) {
        return a.func1(num1, num2) + 9;
    }
}