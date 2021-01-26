package io.hel.chainofresponsibility;

/**
 * author: hel
 * date: 2021/1/10 14:33
 * description:职责链模式
 * 角色：请求对象
 * 描述：用于抽象处理者的请求定义
 */
public class PurchaseRequest {
    private float price;

    public float getPrice() {
        return price;
    }

    public PurchaseRequest(float price) {
        this.price = price;
    }
}
