package io.hel.chainofresponsibility;

/**
 * author: hel
 * date: 2021/1/10 14:37
 * description:
 */
public class CollegeApprover extends Approver {
    public CollegeApprover(String name) {
        super(name);
    }

    @Override
    public void procRequest(PurchaseRequest request) {
        if (request.getPrice() <= 10000) {
            System.out.printf("The purchase amount is less than 10,000, the dean: %s can approve\n", getName());
        } else {
            next.procRequest(request);
        }
    }
}
