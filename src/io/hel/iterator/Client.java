package io.hel.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hel
 * date: 2021/1/9 15:04
 * description:
 */
public class Client {
    public static void main(String[] args) {
        List<CollegeCollection> colleges = new ArrayList<>();
        ComputerCollegeCollection computerCollege = new ComputerCollegeCollection();
        computerCollege.addFaculty(new Faculty("C/C++"));
        computerCollege.addFaculty(new Faculty("Java"));
        computerCollege.addFaculty(new Faculty("Golang"));
        colleges.add(computerCollege);

        InformationCollegeCollection informationCollege = new InformationCollegeCollection();
        informationCollege.addFaculty(new Faculty("Network"));
        informationCollege.addFaculty(new Faculty("Server"));
        colleges.add(informationCollege);

        Output output = new Output(colleges);

        output.print();
    }
}
