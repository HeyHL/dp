package io.hel.base.principle.inversion.improved;

/**
 * author: hel
 * date: 2020/12/27 17:25
 * description: 依赖倒转原则
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
        person.receive(new MSN());
    }
}

/**
 * 面向抽象编程
 */
interface Receiver {
    String getMessage();
}
class Email implements Receiver {
    @Override
    public String getMessage() {
        return "email receive a message: hello";
    }
}
class MSN implements Receiver {
    @Override
    public String getMessage() {
        return "MSN receive a message: OK";
    }
}
class Person {
    // 通过接口依赖，提高扩展性，例如增加WeChat时
    public void receive(Receiver receiver) {
        System.out.println(receiver.getMessage());
    }
}