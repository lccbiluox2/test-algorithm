package com.algorithm.datastructure.stack;

import java.util.ArrayDeque;
import java.util.Deque;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/31 10:37 4 九师兄
 *     双栈表达式实现计算器，与 逆波兰表达式相关
 *     参考：PolandNotation
 * 文章参考：https://blog.csdn.net/qq_43164662/article/details/121578728
 */
public class TwoStackForComputer {

    public int computing(String[] els) {
        //存数据的栈
        Deque<Integer> data = new ArrayDeque<>();
        //存符号优先级的优先级
        Deque<Character> symbols = new ArrayDeque<>();
        //规则为从右向左计算
        for (int i = els.length - 1; i >= 0; i--) {
            if (isDigit(els[i])) {
                data.push(Integer.parseInt(els[i]));
                continue;
            }
            char c = els[i].charAt(0);
            //不是数字
            if (symbols.isEmpty() || priority(c, symbols.peekFirst())) {
                symbols.offerFirst(els[i].charAt(0));
                continue;
            }
            //计算加减乘
            char ch = els[i].charAt(0);
            while (!symbols.isEmpty() && !priority(ch, symbols.peekFirst())) {
                int leftData = data.pollFirst(), rightData = data.pollFirst();
                int result = compute(rightData, leftData, symbols.pollFirst());
                data.push(result);
            }
            symbols.push(ch);
        }
        //最后计算栈内元素
        while (!symbols.isEmpty()) {
            int leftData = data.pollFirst(), rightData = data.pollFirst();
            data.push(compute(rightData, leftData, symbols.pollFirst()));
        }

        return data.poll();
    }

    //根据符号计算结果
    private int compute(int data1, int data2, char ch) {
        if (ch == '+')
            return data1 + data2;
        if (ch == '-')
            return Math.abs(data1 - data2);
        if (ch == '%')
            return data1 % data2;
        return data1 * data2;
    }

    //符号优先级（根据加减乘除和取余的优先级去设定规则，这里的规则为取余为低优先级，其它优先级相等）
    private boolean priority(char ch1, char ch2) {
        //大于等于为true
        if (ch2 == '%')
            return true;
        if (ch1 == '%')
            return false;
        return true;
    }

    //是否为数字
    private boolean isDigit(String s) {
        //也可for循环去判断里面的字符是否在0-9中。要看是否有+-号。
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}


