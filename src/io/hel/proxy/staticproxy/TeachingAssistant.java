package io.hel.proxy.staticproxy;

/**
 * author: hel
 * date: 2021/1/3 9:58
 * description:代理模式-静态代理
 * 角色：代理类
 */
public class TeachingAssistant implements Teach{

    private Teach target;

    public TeachingAssistant(Teach target) {
        this.target = target;
    }

    @Override
    public void teach() {
        System.out.println("Teaching assistant preparation handout");
        target.teach();
        System.out.println("Teaching assistant summarizes course content");
    }
}
