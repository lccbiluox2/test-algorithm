package com.algorithm.hot.code_020;

import java.util.Stack;

/***
 * todo: 九师兄  2023/3/26 17:29
 *   20. 有效的括号
 *   https://leetcode.cn/problems/valid-parentheses/?favorite=2cktkvj
 */
public class ValidParenthesis {

    /***
     * todo: 九师兄  2023/3/26 17:47
     *    第一次报错空指针异常
     */
    public boolean isValid(String s) {
        if(s == null || s.length() < 1){
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        stack.push(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            char item = chars[i];
            Character peek = stack.peek();
            if(peek == null){
                stack.push(item);
                continue;
            }
           boolean eq =  isEqual(item,peek);
            if(eq){
                stack.pop();
            }else {
                stack.push(item);
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }

    private boolean isEqual(char item, Character peek) {
        if(item == '{' && peek == '}' || item == '}' && peek == '{' ){
            return true;
        }
        if(item == '(' && peek == ')' || item == ')' && peek == '(' ){
            return true;
        }
        if(item == '[' && peek == ']' || item == ']' && peek == '[' ){
            return true;
        }
        return false;
    }

}
