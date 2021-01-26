package io.hel.chainofresponsibility;

/**
 * author: hel
 * date: 2021/1/10 14:38
 * description:
 */
public class SchoolMasterApprover extends Approver {
    public SchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void procRequest(PurchaseRequest request) {
        System.out.printf("The purchase amount is greater than 30,000, only the principal: %s can approve\n", getName());
    }
}
