package io.hel.visitor;

/**
 * author: hel
 * date: 2021/1/7 22:09
 * description:访问者模式
 * 角色：元素
 * 描述：接收访问者
 */
public abstract class Person {
    public abstract void accept(Action action);
}
