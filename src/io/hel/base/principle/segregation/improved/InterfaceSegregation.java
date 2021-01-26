package io.hel.base.principle.segregation.improved;

/**
 * author: hel
 * date: 2020/12/27 16:26
 * description: 接口隔离原则
 */
public class InterfaceSegregation {
    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        a.depend2(new B());
        // A通过接口Interface2依赖B
        a.depend3(new B());
        C c = new C();
        c.depend1(new D());
        c.depend4(new D());
        // C通过接口Interface3依赖D
        c.depend5(new D());
    }
}

/**
 * 通过对接口的拆分，使一个类对另一个类的依赖建立在最小的接口上
 */
interface Interface1 {
    void operation1();
}
interface Interface2 {
    void operation2();
    void operation3();
}
interface Interface3 {
    void operation4();
    void operation5();
}
class B implements Interface1, Interface2 {
    @Override
    public void operation1() {
        System.out.println("operation1 class B implements Interface1");
    }

    @Override
    public void operation2() {
        System.out.println("operation2 class B implements Interface2");
    }

    @Override
    public void operation3() {
        System.out.println("operation3 class B implements Interface2");
    }
}
class D implements Interface1, Interface3 {
    @Override
    public void operation1() {
        System.out.println("operation1 class D implements Interface1");
    }

    @Override
    public void operation4() {
        System.out.println("operation4 class D implements Interface3");
    }

    @Override
    public void operation5() {
        System.out.println("operation5 class D implements Interface3");
    }
}
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface2 i) {
        i.operation2();
    }
    public void depend3(Interface2 i) {
        i.operation3();
    }
}
class C {
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface3 i) {
        i.operation4();
    }
    public void depend5(Interface3 i) {
        i.operation5();
    }
}