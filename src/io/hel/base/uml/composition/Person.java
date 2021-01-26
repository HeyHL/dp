package io.hel.base.uml.composition;

/**
 * author: hel
 * date: 2020/12/27 22:37
 * description:类与类之间的关系之组合
 */
public class Person {
    // 组合，整体与部分不可分开
    private Heart heart = new Heart();
    // 聚合
    private IDCard idCard;
}
class IDCard{}
class Heart{}