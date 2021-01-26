package io.hel.chainofresponsibility;

/**
 * author: hel
 * date: 2021/1/10 14:43
 * description:
 */
public class Client {
    public static void main(String[] args) {
        PurchaseRequest request = new PurchaseRequest(31000);
        FacultyApprover facultyApprover = new FacultyApprover("Director Zhang");
        CollegeApprover collegeApprover = new CollegeApprover("Dean Li");
        ViceSchoolMasterApprover viceSchoolMasterApprover = new ViceSchoolMasterApprover("Deputy School Wang");
        SchoolMasterApprover schoolMasterApprover = new SchoolMasterApprover("Principal Zhao");
        facultyApprover.next = collegeApprover;
        collegeApprover.next = viceSchoolMasterApprover;
        viceSchoolMasterApprover.next = schoolMasterApprover;
        facultyApprover.procRequest(request);
    }
}
