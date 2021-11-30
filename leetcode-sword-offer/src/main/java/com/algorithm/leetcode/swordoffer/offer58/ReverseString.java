package com.algorithm.leetcode.swordoffer.offer58;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-29 21:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 58 - I. 翻转单词顺序
 */
public class ReverseString {

    /**
     * 使用栈完成字符串反转
     * <p>
     * the sky is blue
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        Stack stack = new Stack();

        s = s.replaceAll(" +"," ");
        s = s.trim();

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i <= s.length(); i++) {
            // 证明到结尾了
            if(i == s.length()){
                stack.push(temp.toString());
                continue;
            }
            if (s.charAt(i) == ' ' && s.charAt(i+1) != ' ') {
                stack.push(temp.toString());
                stack.push(' ');
                temp = new StringBuilder();
            } else {
                temp.append(s.charAt(i));
            }

        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public String reverseWords1(String s) {
        //将传进来的字符串以空格拆分
        String[] strings = s.trim().split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        //从尾巴开始遍历
        for (int i = strings.length - 1; i >= 0; i--) {
            if (strings[i].equals("")) {
                continue;
            }
            //到头了，append然后去空格
            if (i == 0) {
                stringBuffer.append(strings[i].trim());
            } else {
                // 怕有多余的空格，去掉，再加上去
                stringBuffer.append(strings[i].trim()).append(" ");
            }
        }
        //输出String 完事，安排！
        return stringBuffer.toString();
    }
}
