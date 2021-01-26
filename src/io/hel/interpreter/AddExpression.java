package io.hel.interpreter;

import java.util.Map;

/**
 * author: hel
 * date: 2021/1/9 21:51
 * description:解释器模式
 * 角色：具体表达式
 */
public class AddExpression extends SymbolExpression {
    public AddExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<Character, Integer> var) {
        // 非终结符表达式的两边是终结符
        return super.left.interpret(var) + super.right.interpret(var);
    }
}
