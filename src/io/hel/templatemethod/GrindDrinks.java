package io.hel.templatemethod;

/**
 * author: hel
 * date: 2021/1/24 19:36
 * description:模板方法模式
 * 角色：抽象基类
 * 描述：定义制造研磨饮品的基本步骤和模板方法，基本步骤交由具体子类实现
 */
public abstract class GrindDrinks {

    /**
     * final防止子类重写此模板方法
     */
    public final void make() {
        filter();
        clean();
        if (needIngredients())
            addIngredients();
        soak();
        grind();
    }

    /**
     * 以下为基本步骤，需强制子类提供实现
     */
    protected abstract void filter();

    protected abstract void clean();

    protected abstract void addIngredients();

    protected abstract void soak();

    protected abstract void grind();

    /**
     * 钩子方法，决定某一个方式是否需要调用
     * @return 返回true代表需要添加配料
     */
    protected boolean needIngredients() {
        return false;
    }
}
