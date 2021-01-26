package io.hel.visitor;

/**
 * author: hel
 * date: 2021/1/7 22:10
 * description: 访问者模式
 * 角色：抽象访问者
 * 描述：为对象结构中每一个具体元素角色声明一个访问操作接口。
 */
public abstract class Action {
    // 重载（第二次分派）
    public abstract void getResult(Man man);
    public abstract void getResult(Woman woman);
}
