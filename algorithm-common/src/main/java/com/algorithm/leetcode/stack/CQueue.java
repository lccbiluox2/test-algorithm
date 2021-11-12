package com.algorithm.leetcode.stack;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-12 09:45
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 1  -
 * <p>
 * 剑指 Offer 09. 用两个栈实现队列
 */
public class CQueue {

    Stack<Integer> stackIn = new Stack();
    Stack<Integer> stackOut = new Stack();

    public CQueue() {
    }

    public void appendTail(Integer value) {
        // 优化点，出站为空，那么可以直接插入
        if(stackOut.isEmpty()){
            stackIn.push(value);
            return;
        }
        while (!stackOut.isEmpty()) {
            Integer pop = stackOut.pop();
            stackIn.push(pop);
        }
        stackIn.push(value);
    }

    public int deleteHead() {
        // 优化点：如果数据都在第二个栈，那么可以直接出站
        if(stackIn.isEmpty() && !stackOut.isEmpty()){
            Integer stackPop = stackOut.pop();
            return stackPop;
        }
        while (!stackIn.isEmpty()) {
            Integer pop = stackIn.pop();
            stackOut.push(pop);
        }
        if (stackOut.isEmpty()) {
            return -1;
        }
        Integer stackPop = stackOut.pop();
        return stackPop;
    }
}
