package io.hel.base.principle.segregation;

/**
 * author: hel
 * date: 2020/12/27 16:20
 * description:
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

interface Interface1 {
    void operation1();

    void operation2();

    void operation3();

    void operation4();

    void operation5();
}

class B implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("class B implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("class B implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("class B implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("class B implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("class B implements operation5");
    }
}

class D implements Interface1 {
    @Override
    public void operation1() {
        System.out.println("class D implements operation1");
    }

    @Override
    public void operation2() {
        System.out.println("class D implements operation2");
    }

    @Override
    public void operation3() {
        System.out.println("class D implements operation3");
    }

    @Override
    public void operation4() {
        System.out.println("class D implements operation4");
    }

    @Override
    public void operation5() {
        System.out.println("class D implements operation5");
    }
}

/**
 * A只需要使用接口中的operation1、operation2、operation3
 * 但B不得不实现接口中的全部方法，此时不满足最小接口
 */
class A {
    public void depend1(Interface1 i) {
        i.operation1();
    }

    public void depend2(Interface1 i) {
        i.operation2();
    }

    public void depend3(Interface1 i) {
        i.operation3();
    }
}

class C {
    public void depend1(Interface1 i) {
       i.operation1();
    }

    public void depend4(Interface1 i) {
        i.operation4();
    }

    public void depend5(Interface1 i) {
        i.operation5();
    }
}