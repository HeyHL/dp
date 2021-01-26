package io.hel.visitor;

/**
 * author: hel
 * date: 2021/1/7 22:20
 * description:访问者模式
 * 角色：具体访问者
 * 描述：为不同的具体元素类（Woman和Man）实现相同行为（此处的行为为not pass）
 */
public class NotPass extends Action {
    @Override
    public void getResult(Man man) {
//        man.
        System.out.println("Male judges choose not to pass");
    }

    @Override
    public void getResult(Woman woman) {
        System.out.println("Female judges choose not to pass");
    }
}
