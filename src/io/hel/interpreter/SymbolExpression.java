package io.hel.interpreter;

import java.util.Map;

/**
 * author: hel
 * date: 2021/1/9 21:50
 * description:解释器模式
 * 角色：非终结符表达式
 * 描述：非终结符需要依赖具体的终结符（此处为操作数）
 */
public class SymbolExpression extends AbstractExpression {
    protected AbstractExpression left;
    protected AbstractExpression right;

    public SymbolExpression(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public int interpret(Map<Character, Integer> var) {
        // 默认实现
        return 0;
    }
}
