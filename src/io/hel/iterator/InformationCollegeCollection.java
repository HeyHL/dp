package io.hel.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * author: hel
 * date: 2021/1/9 14:55
 * description:
 */
public class InformationCollegeCollection implements CollegeCollection {
    private List<Faculty> facultyList;

    public InformationCollegeCollection() {
        this.facultyList = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "Information Institute";
    }

    public void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    @Override
    public CollegeIterator<Faculty> createIterator() {
        return new InformationIterator(facultyList);
    }
}
