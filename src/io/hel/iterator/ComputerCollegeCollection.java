package io.hel.iterator;

/**
 * author: hel
 * date: 2021/1/9 14:48
 * description:迭代器模式
 * 角色：具体集合
 * 描述：返回一个特定的具体迭代器类实体
 */
public class ComputerCollegeCollection implements CollegeCollection {

    private Faculty[] faculties;
    private int index;
    private String name;

    public String getName() {
        return name == null? "IT Academy": name;
    }

    public ComputerCollegeCollection() {
        this.faculties = new Faculty[5];
    }

    public void addFaculty(Faculty faculty) {
        faculties[index++] = faculty;
    }

    @Override
    public CollegeIterator<Faculty> createIterator() {
        return new ComputerIterator(faculties);
    }
}
