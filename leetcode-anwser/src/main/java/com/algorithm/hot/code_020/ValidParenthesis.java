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
        if (s == null || s.length() < 1) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char item : chars) {
            if (stack.isEmpty()) {
                stack.push(item);
                continue;
            }
            Character peek = stack.peek();
            if (peek == null) {
                stack.push(item);
                continue;
            }
            boolean eq = isEqual(item, peek);
            if (eq) {
                stack.pop();
            } else {
                stack.push(item);
            }
        }
        if (stack.isEmpty()) return true;
        return false;
    }

    // peek 一定是左边的
    private boolean isEqual(char item, Character peek) {
        if (peek == '{' && item == '}' ){
            return true;
        }
        if (peek == '(' && item == ')' ) {
            return true;
        }
        if (peek == '[' && item == ']' ) {
            return true;
        }
        return false;
    }

    /***
     *
     *     作者：huang-ji-hua
     *     链接：https://leetcode.cn/problems/valid-parentheses/solution/java-zhan-de-jing-dian-yun-yong-by-huang-jyev/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public  boolean isValidv1(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for ( int i=0;i<chars.length;i++){
            if (!stack.empty()){
                if (chars[i]==')'){
                    if (stack.peek()!='('){
                        return false;
                    }
                    stack.pop();
                }else if (chars[i]=='}'){
                    if (stack.peek()!='{'){
                        return false;
                    }
                    stack.pop();
                }else if (chars[i]==']'){
                    if (stack.peek()!='['){
                        return false;
                    }
                    stack.pop();
                }else {
                    stack.add(chars[i]);
                }
            }else {
                stack.add(chars[i]);
            }
        }
        return stack.empty()?true:false;
    }

}
