package io.hel.base.dependencypass.bysetter;

/**
 * author: hel
 * date: 2020/12/27 17:33
 * description: 通过setter方法传递依赖关系
 */
public class DependencyPassBySetter {
    public static void main(String[] args) {
        Rest rest = new Rest();
        TV tv = new TV() {
            @Override
            public void play() {
                System.out.println("看电视");
            }
        };
        rest.setTv(tv);
        rest.watchTV();
    }
}
interface TV {
    void play();
}
interface WatchTV {
    void watchTV();
}
class Rest implements WatchTV {
    private TV tv;

    public void setTv(TV tv) {
        this.tv = tv;
    }

    @Override
    public void watchTV() {
        tv.play();
    }
}