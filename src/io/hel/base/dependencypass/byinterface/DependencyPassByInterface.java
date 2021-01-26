package io.hel.base.dependencypass.byinterface;

/**
 * author: hel
 * date: 2020/12/27 17:33
 * description: 通过接口传递依赖关系
 */
public class DependencyPassByInterface {
    public static void main(String[] args) {
        Rest rest = new Rest();
        rest.watchTV(new TV() {
            @Override
            public void play() {
                System.out.println("看电视");
            }
        });
    }
}
interface TV {
    void play();
}
interface WatchTV {
    void watchTV(TV tv);
}
class Rest implements WatchTV {

    @Override
    public void watchTV(TV tv) {
        tv.play();
    }
}