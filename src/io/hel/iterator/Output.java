package io.hel.iterator;

import java.util.Iterator;
import java.util.List;

/**
 * author: hel
 * date: 2021/1/9 14:57
 * description:
 */
public class Output {
    private List<CollegeCollection> colleges;

    public Output(List<CollegeCollection> colleges) {
        this.colleges = colleges;
    }

    public void print() {
        Iterator<CollegeCollection> iterator = colleges.iterator();
        while (iterator.hasNext()) {
            CollegeCollection college = iterator.next();
            System.out.println(college.getName());
            outputFaculty(college.createIterator());
        }
    }

    private void outputFaculty(CollegeIterator<Faculty> facultyIterator) {
        while (facultyIterator.hasNext()) {
            System.out.println(facultyIterator.next().getName());
        }
    }

}
