package io.hel.base.principle.inversion;

/**
 * author: hel
 * date: 2020/12/27 17:21
 * description:
 */
public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
class Email {
    public String getMessage() {
        return "Email receive a message: hello";
    }
}
class Person {
    // 通过具体实现类依赖，耦合度太高，只能接收Email的消息
    public void receive(Email email) {
        System.out.println(email.getMessage());
    }
}