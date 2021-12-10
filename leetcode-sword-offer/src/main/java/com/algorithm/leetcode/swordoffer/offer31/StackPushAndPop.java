package com.algorithm.leetcode.swordoffer.offer31;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-10 08:22
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 31. 栈的压入、弹出序列
 *
 */
public class StackPushAndPop {


    /**
     * 作者：jyd
     * 链接：https://leetcode-cn.com/problems/zhan-de-ya-ru-dan-chu-xu-lie-lcof/solution/mian-shi-ti-31-zhan-de-ya-ru-dan-chu-xu-lie-mo-n-2/
     * 来源：力扣（LeetCode）
     * @param pushed
     * @param popped
     * @return
     */
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for(int num : pushed) {
            stack.push(num); // num 入栈
            // 判断栈顶元素是否等于当前栈顶元素，如果等于说明这个是要弹出的
            while(!stack.isEmpty() && stack.peek() == popped[i]) { // 循环判断与出栈
                stack.pop();
                i++;
            }
        }
        return stack.isEmpty();
    }


}
