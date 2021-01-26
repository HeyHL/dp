package io.hel.base.dependencypass.byconstructor;

/**
 * author: hel
 * date: 2020/12/27 17:33
 * description: 通过构造器传递依赖关系
 */
public class DependencyPassByConstructor {
    public static void main(String[] args) {
        Rest rest = new Rest(new TV() {
            @Override
            public void play() {
                System.out.println("看电视");
            }
        });
        rest.watchTV();
    }
}
interface TV {
    void play();
}
interface WatchTV {
    void watchTV( );
}
class Rest implements  WatchTV{
    private TV tv;

    public Rest(TV tv) {
        this.tv = tv;
    }

    @Override
    public void watchTV() {
        tv.play();
    }
}