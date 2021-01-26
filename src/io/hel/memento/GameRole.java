package io.hel.memento;


import java.util.Stack;

/**
 * author: hel
 * date: 2021/1/9 20:41
 * description:备忘录模式
 * 角色：备忘发起角色
 */
public class GameRole {
    /**
     * 需要备忘录保存的数据
     */
    private int vit;
    private int def;
    /**
     * 备忘录管理者
     */
    private Caretaker caretaker = new Caretaker();

    /**
     * 空接口，用于备忘录管理者与备忘录角色的依赖关系
     */
    interface Null{}

    /**
     * 备忘录角色，用于保存备忘发起角色的数据
     */
    private class Memento implements Null{
        private int vit;
        private int def;

        Memento(int vit, int def) {
            this.vit = vit;
            this.def = def;
        }
    }

    /**
     * 备忘录管理者，维护多个备忘录角色
     */
    private class Caretaker {
        private Stack<Null> mementos = new Stack<>();

        public Null getMemento() {
            return mementos.pop();
        }

        public void setMemento(Null memento) {
            this.mementos.push(memento);
        }
    }


    public void setVit(int vit) {
        this.vit = vit;
    }

    public void setDef(int def) {
        this.def = def;
    }

    /**
     * 保存至备忘录
     */
    public void archive() {
        caretaker.setMemento(new Memento(vit, def));
    }

    /**
     * 从备忘录中恢复上一次的状态
     */
    public void restore() {
        Memento memento = (Memento) caretaker.getMemento();
        this.vit = memento.vit;
        this.def = memento.def;
    }

    public void show() {
        System.out.printf("vit: %d, def: %d\n", vit, def);
    }
}
