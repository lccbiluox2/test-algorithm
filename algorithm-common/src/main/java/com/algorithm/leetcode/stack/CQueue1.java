package com.algorithm.leetcode.stack;

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
public class CQueue1 {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        // 如果输出的size小于0
        if(s2.size() <= 0){
            // 那么将输入的全部转义到输出的
            while(s1.size() > 0){
                s2.push(s1.pop());
            }
        }
        if(s2.size() == 0){
            return -1;
        }
        return s2.pop();
    }
}
