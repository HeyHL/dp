package io.hel.iterator;

/**
 * author: hel
 * date: 2021/1/9 14:47
 * description:迭代器模式
 * 角色：集合接口
 * 描述：声明一个或多个方法来获取与集合兼容的迭代器。
 */
public interface CollegeCollection {

    String getName();

    CollegeIterator<Faculty> createIterator();
}
