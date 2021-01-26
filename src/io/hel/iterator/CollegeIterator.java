package io.hel.iterator;

/**
 * author: hel
 * date: 2021/1/24 10:35
 * description:迭代器模式
 * 角色：迭代器接口
 * 描述：声明了遍历集合所需的操作
 */
public interface CollegeIterator<E> {
    boolean hasNext();

    E next();
}
