package io.hel.iterator;

/**
 * author: hel
 * date: 2021/1/9 14:41
 * description:迭代器模式
 * 角色：具体迭代器
 * 描述：根据具体集合的数据结构，实现遍历集合的一种特定算法
 */
public class ComputerIterator implements CollegeIterator<Faculty> {
    private Faculty[] faculties;
    private int index;

    public ComputerIterator(Faculty[] faculties) {
        this.faculties = faculties;
    }

    @Override
    public boolean hasNext() {
        if (index >= faculties.length || faculties[index] == null)
            return false;
        return true;
    }

    @Override
    public Faculty next() {
        return faculties[index++];
    }
}
