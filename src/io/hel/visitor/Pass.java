package io.hel.visitor;

/**
 * author: hel
 * date: 2021/1/7 22:12
 * description:
 */
public class Pass extends Action {
    @Override
    public void getResult(Man man) {
        man.discuss();
        System.out.println("Male judges choose to pass");
    }

    @Override
    public void getResult(Woman woman) {
        woman.discuss();
        System.out.println("Female judges choose to pass");
    }
}
