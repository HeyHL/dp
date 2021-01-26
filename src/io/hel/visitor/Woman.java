package io.hel.visitor;

/**
 * author: hel
 * date: 2021/1/7 22:13
 * description:访问者模式
 * 角色：具体元素
 */
public class Woman extends Person {
    public void discuss () {
        System.out.println("Female judges discussed for 10 minutes");
    }
    @Override
    public void accept(Action action) {
        action.getResult(this);
    }
}
