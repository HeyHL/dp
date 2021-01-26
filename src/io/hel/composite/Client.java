package io.hel.composite;

/**
 * author: hel
 * date: 2021/1/2 14:48
 * description:
 */
public class Client {
    public static void main(String[] args) {
        University tsinghuaUniversity = new University("Tsinghua University");
        College cs = new College("IT Academy");
        Faculty softwareEngineering = new Faculty("Software engineering");
        cs.add(softwareEngineering);
        cs.add(new Faculty("network engineering"));
        cs.add(new Faculty("computer science and Technology"));
        tsinghuaUniversity.add(cs);
        College informationInstitute = new College("Information Institute");
        informationInstitute.add(new Faculty("Communication Engineering"));
        informationInstitute.add(new Faculty("Information Engineering"));
        tsinghuaUniversity.add(informationInstitute);
        tsinghuaUniversity.print();

    }
}
