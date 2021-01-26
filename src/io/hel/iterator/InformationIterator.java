package io.hel.iterator;

import java.util.List;

/**
 * author: hel
 * date: 2021/1/9 14:44
 * description:
 */
public class InformationIterator implements CollegeIterator<Faculty> {
    private List<Faculty> facultyList;
    private int index = -1;

    public InformationIterator(List<Faculty> facultyList) {
        this.facultyList = facultyList;
    }

    @Override
    public boolean hasNext() {
        if (index >= facultyList.size() - 1)
            return false;
        index++;
        return true;
    }

    @Override
    public Faculty next() {
        return facultyList.get(index);
    }
}
