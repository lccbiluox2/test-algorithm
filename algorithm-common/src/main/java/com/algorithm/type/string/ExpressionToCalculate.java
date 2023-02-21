package com.algorithm.type.string;

import java.util.LinkedList;

/**
 * todo: 2023/2/20 22:40 九师兄
 * 【算法】字符串表达式计算、计算器、带括号、递归套路
 *  https://blog.csdn.net/qq_21383435/article/details/129073313
 **/
public class ExpressionToCalculate {

    public static int getValue(String str) {
        return value(str.toCharArray(), 0)[0];
    }

    //请从strri...了往下算，遇到字符串终止位置或者右括号，就停止
    //返回两个值，长度为2的数组
    // 0）负责的这一段的结果是多少
    // 1）负责的这一段计算到了哪个位置
    public static int[] value(char[] str, int i) {
        LinkedList<String> que = new LinkedList<String>();
        int num = 0;
        int[] bra = null;
        while (i < str.length && str[i] != ')') {
            if (str[i] >= '0' && str[i] <= '9') {
                num = num * 10 + str[i++] - '0';
            } else if (str[i] != '(') {
                // 遇到的是运算符号
                addNum(que, num);
                que.addLast(String.valueOf(str[i++]));
                num = 0;
            } else {//遇到左括号了
                bra = value(str, i + 1);
                num = bra[0];
                i = bra[1] + 1;
            }
        }
        addNum(que, num);
        return new int[]{getNum(que), i};
    }

    private static int getNum(LinkedList<String> que) {
        int res = 0;
        boolean add = true;
        String cur = null;
        int num = 0;
        while (!que.isEmpty()) {
            cur = que.pollFirst();
            if (cur.equals("+")) {
                add = true;
            } else if (cur.equals("-")) {
                add = false;
            } else {
                num = Integer.valueOf(cur);
                res += add ? num : (-num);
            }
        }
        return res;
    }

    private static void addNum(LinkedList<String> que, int num) {
        if (!que.isEmpty()) {
            int cur = 0;
            String top = que.pollLast();
            if (top.equals("+") || top.equals("-")) {
                que.addLast(top);
            } else {
                cur = Integer.valueOf(que.pollLast());
                num = top.equals("*") ? (cur * num) : (cur / num);
            }
        }
        que.addLast(String.valueOf(num));
    }
}
