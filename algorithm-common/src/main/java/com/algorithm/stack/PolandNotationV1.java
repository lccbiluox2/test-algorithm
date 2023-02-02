package com.algorithm.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 18:13
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: todo: 逆波兰 表达式  https://www.bilibili.com/video/BV1E4411H73v?p=37
 * 计算器
 * https://blog.csdn.net/qq_21383435/article/details/120539224
 */
public class PolandNotationV1 {


    public List<String> getListString(String suffixExpression) {
        String[] split = suffixExpression.split(" ");
        List<String> list = Arrays.asList(split);
        return list;
    }


    public int calculate(List<String> ls) {
        Stack<String> stack = new Stack<>();
        for (String item : ls) {
            if (item.matches("\\d+")) {
                stack.push(item);
            } else {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                int res = cal(num1, num2, item);
                stack.push(res + "");
            }
        }
        int res = Integer.parseInt(stack.pop());
        System.out.println("计算的结果" + res);
        return res;
    }


    public int cal(int num1, int num2, String operator) {
        int res = 0;
        switch (operator) {
            case "+":
                res = num1 + num2;
                break;
            case "-":
                res = num2 - num1;
                break;
            case "*":
                res = num1 * num2;
                break;
            case "/":
                res = num2 + num1;
                break;
            default:
                break;
        }
        return res;
    }


}
