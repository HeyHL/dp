package io.hel.interpreter;

import java.util.Map;

/**
 * author: hel
 * date: 2021/1/9 21:46
 * description:解释器模式
 * 角色：抽象表达式
 * 描述：声明一个解释操作
 */
public abstract class AbstractExpression {
    public abstract int interpret(Map<Character, Integer> var);
}
