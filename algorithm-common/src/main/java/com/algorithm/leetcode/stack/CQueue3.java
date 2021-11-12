package com.algorithm.leetcode.stack;

import java.util.LinkedList;
import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-12 09:45
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 1  -
 * <p>
 * 1
 * 2 -
 */
class CQueue3 {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public CQueue3() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) return -1;
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            return stack2.pop();
        } else return stack2.pop();
    }
}