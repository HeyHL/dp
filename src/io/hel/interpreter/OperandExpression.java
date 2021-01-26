package io.hel.interpreter;

import java.util.Map;

/**
 * author: hel
 * date: 2021/1/9 21:48
 * description:解释器模式
 * 角色：终结符表达式
 * 描述：终结符表达式可以直接被非终结符使用
 */
public class OperandExpression extends AbstractExpression {
    private Character key;

    public OperandExpression(Character key) {
        this.key = key;
    }

    @Override
    public int interpret(Map<Character, Integer> var) {
        return var.get(key);
    }
}
