package com.algorithm.datastructure.stack;

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
public class PolandNotation {


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


    /**
     * 将中缀表达式转成对应的list
     *
     * @param ls
     * @return
     */
    public ArrayList<String> toInfixExpressionList(String ls) {
        ArrayList<String> strings = new ArrayList<>();
        int i = 0;// 指针 用于遍历中缀表达式字符串
        String str = "";
        char c = 0;
        do {
            if ((c = ls.charAt(i)) < 48 || (c = ls.charAt(i)) > 57) {
                strings.add(c + "");
                i++;
            } else {
                str = "";
                while (i < ls.length() && (c = ls.charAt(i)) >= 48 && (c = ls.charAt(i)) <= 57) {
                    str += c;
                    i++;
                }
                strings.add(str);
            }
        } while (i < ls.length());

        return strings;
    }


    /**
     *  中缀表达式 转成 后缀表达式
     *  [31, +, (, (, 2, +, 3, ), *, 4, ), -, 5]
     * @param ls
     * @return
     */
    public ArrayList<String> parseSuffixExpressionList(List<String> ls) {
        Stack<String> s1 = new Stack<>();
        // 因为s2 没有出栈操作，可以直接用list处理
        // 说明:因为s2这个栈，在整个转换过程中，没有pop操作，而且后面我们还需要逆序输出
        ////因此比较麻烦，这里我们就不用Stack<String>直接使用List<String> s2
        ////Stack<String> s2 = new Stack<String>(); //储存中间结果的栈s2
        ArrayList<String> s2 = new ArrayList<>();

        for (String item : ls) {
            // 当item为数字时，直接加入集合
            if(item.matches("\\d+")){
                s2.add(item);
                // 当item为 （ 左括号时，压入栈中
            }else if(item.equals("(")){
                s1.push(item);
            }else if(item.equals(")")){
                // 遇到括号时
                // 当item为）右括号时，则依次弹出stack栈顶的运算符，并加入list中，直到遇到（左括号为止，此时将这一对括号丢弃
                while (!s1.peek().equals("(")){
                    s2.add(s1.pop());
                }
                // 弹出（ 消除小括号
                s1.pop();
            }else {
                //当item的优先级小于等于s1栈顶运算符，将s1栈顶 的运算符弹出并加入到s2中，再次转到(4.1)与s1中新的栈顶运算符相比较
                while (s1.size() != 0 && priority(s1.peek()) >= priority(item) ){
                    s2.add(s1.pop());
                }
                s1.push(item);
            }
        }
        // 将stack中的元素全部加入到list中
        while (s1.size()!=0){
            s2.add(s1.pop());
        }
        return s2;
    }


    public int priority(String oper) {
        if (oper.equals("*") || oper.equals("/") ) {
            return 2;
        } else if (oper.equals("+") || oper.equals( "-")) {
            return 1;
        } else {
            return 0;
        }
    }



}
