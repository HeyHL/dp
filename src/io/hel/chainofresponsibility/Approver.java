package io.hel.chainofresponsibility;

/**
 * author: hel
 * date: 2021/1/10 14:33
 * description:职责链模式
 * 角色：抽象处理者
 * 描述：通常仅包含用于请求处理的方法。
 */
public abstract class Approver {
    // 下一个处理者
    protected Approver next;
    private String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setNext(Approver next) {
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public abstract void procRequest(PurchaseRequest request);
}
