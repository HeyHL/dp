package io.hel.interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * author: hel
 * date: 2021/1/9 21:54
 * description:解释器模式
 * 角色：环境角色
 */
public class Calculator {
    private AbstractExpression abstractExpression;

    public Calculator(String expStr) {
        char curr, next;
        Stack<AbstractExpression> stack = new Stack<>();
        AbstractExpression left, right;
        for (int i = 0; i < expStr.length(); i++) {
            curr = expStr.charAt(i);
            switch (curr) {
                case '+':
                    left = stack.pop();
                    next = expStr.charAt(++i);
                    right = new OperandExpression(next);
                    stack.push(new AddExpression(left, right));
                    break;
                case '-':
                    left = stack.pop();
                    next = expStr.charAt(++i);
                    right = new OperandExpression(next);
                    stack.push(new MinusExpression(left, right));
                    break;
                default:
                    stack.push(new OperandExpression(curr));
                    break;
            }
        }
        this.abstractExpression = stack.pop();
    }

    public int calc(Map<Character, Integer> var) {
        return this.abstractExpression.interpret(var);
    }
}
