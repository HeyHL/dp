package io.hel.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * author: hel
 * date: 2021/1/9 22:05
 * description:
 */
public class Client {
    public static void main(String[] args) throws Exception {
        String expStr = readExpression();
        HashMap<Character, Integer> hashMap = readOperand(expStr);
        Calculator calculator = new Calculator(expStr);
        int result = calculator.calc(hashMap);
        System.out.println(result);
    }

    private static String readExpression() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter an expression, such as a+b-c");
        return reader.readLine();
    }

    private static HashMap<Character, Integer> readOperand(String expStr) throws IOException {
        HashMap<Character, Integer> hashMap = new HashMap<>(expStr.length());
        Character curr;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < expStr.length(); i++) {
            curr = expStr.charAt(i);
            if (isLetter(curr)) {
                System.out.printf("Please enter %c=", curr);
                String val = reader.readLine();
                hashMap.put(curr, Integer.valueOf(val));
            }
        }
        return hashMap;
    }

    private static boolean isLetter(char curr) {
        return (curr >= 65 && curr <= 80) || (curr >= 97 && curr <= 122);
    }
}
