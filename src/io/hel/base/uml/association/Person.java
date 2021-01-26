package io.hel.base.uml.association;

import java.util.List;

/**
 * author: hel
 * date: 2020/12/27 22:27
 * description:类与类之间的关系之关联
 */
public class Person {
    // 单向一对一关联
    private IDCard idCard;
    // 单向一对多关联
    private List<IDCard> idCards;
}
class IDCard{}