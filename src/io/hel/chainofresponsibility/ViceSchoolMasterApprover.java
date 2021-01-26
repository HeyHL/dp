package io.hel.chainofresponsibility;

/**
 * author: hel
 * date: 2021/1/10 14:37
 * description:
 */
public class ViceSchoolMasterApprover extends Approver {
    public ViceSchoolMasterApprover(String name) {
        super(name);
    }

    @Override
    public void procRequest(PurchaseRequest request) {
        if (request.getPrice() <= 30000) {
            System.out.printf("The purchase amount is less than 30,000, the vice principal: %s can approve\n", getName());
        } else {
            next.procRequest(request);
        }
    }
}
