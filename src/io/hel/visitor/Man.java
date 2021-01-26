package io.hel.visitor;

/**
 * author: hel
 * date: 2021/1/7 22:12
 * description:访问者模式
 * 角色：具体元素
 * 描述：实现元素角色中定义的”接收“方法，该方法的目的是根据当前具体元素类（此处具体元素为Man）将其调用重定向到相应访问者的方法。
 */
public class Man extends Person {
    public void discuss () {
        System.out.println("Male judges discussed for 5 minutes");
    }
    @Override
    public void accept(Action action) {
        // 第二次分派：具体访问者将当前对象（具体元素）作为参数传递调用与当前对象匹配的访问方法
        action.getResult(this);
    }
}
