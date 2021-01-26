package io.hel.memento;

/**
 * author: hel
 * date: 2021/1/9 20:46
 * description:
 */
public class Client {
    public static void main(String[] args) {
        GameRole gameRole = new GameRole();
        gameRole.setVit(100);
        gameRole.setDef(100);
        System.out.println("original state");
        gameRole.show();

        gameRole.archive();
        gameRole.setVit(80);
        gameRole.setDef(80);
        System.out.println("After the first fight");
        gameRole.show();

        gameRole.archive();
        gameRole.setVit(60);
        gameRole.setDef(60);
        System.out.println("After the second fight");
        gameRole.show();

        gameRole.restore();
        System.out.println("Restore to previous state");
        gameRole.show();

        gameRole.restore();
        System.out.println("Restore to previous state");
        gameRole.show();
//        gameRole.
    }
}
