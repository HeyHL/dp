package io.hel.interpreter;

import java.util.Map;

/**
 * author: hel
 * date: 2021/1/9 21:53
 * description:
 */
public class MinusExpression extends SymbolExpression {
    public MinusExpression(AbstractExpression left, AbstractExpression right) {
        super(left, right);
    }

    @Override
    public int interpret(Map<Character, Integer> var) {
        return super.left.interpret(var) - super.right.interpret(var);
    }
}
