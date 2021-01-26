package io.hel.chainofresponsibility;

/**
 * author: hel
 * date: 2021/1/10 14:34
 * description:职责链模式
 * 角色：具体处理者
 * 描述：必须决定自身是否能够进行处理， 以及是否沿着链传递请求。
 */
public class FacultyApprover extends Approver {
    public FacultyApprover(String name) {
        super(name);
    }

    @Override
    public void procRequest(PurchaseRequest request) {
        if (request.getPrice() <= 5000) {
            System.out.printf("The purchase amount is less than 5000, the department head: %s can approve\n", getName());
        } else {
            next.procRequest(request);
        }
    }
}
