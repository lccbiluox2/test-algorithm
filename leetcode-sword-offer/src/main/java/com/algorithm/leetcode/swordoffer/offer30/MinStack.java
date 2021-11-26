package com.algorithm.leetcode.swordoffer.offer30;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 16:55
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinStack {

    Stack<Integer> dataStack;
    Stack<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        dataStack = new Stack<Integer>();
        minStack = new Stack<Integer>();
    }

    public void push(int x) {
        System.out.println("插入数据：" + x);
        dataStack.push(x);
        // 如果都是空的默认最小值是第一个数据
        if (minStack.empty()) {
            minStack.push(x);
        } else {
            Integer currentMin = minStack.peek();
            // 如果新来的值小于当前最小的值那么就继续加入 这里要注意等于也要加进去
            if (x <= currentMin) {
                minStack.push(x);
            }
        }
        System.out.println("当前数据栈：" + dataStack);
        System.out.println("当前最小值栈：" + minStack);
        System.out.println();
    }

    public void pop() {
        Integer val = dataStack.pop();
        Integer currentMin = minStack.peek();
        // 如果当前取出来的值是最小值，那么说明就是最小值要被扔掉了
        if (val.equals(currentMin)) {
            minStack.pop();
        }

        System.out.println("当前数据栈：" + dataStack);
        System.out.println("当前最小值栈：" + minStack);
        System.out.println();
    }

    public int top() {
        if(dataStack.isEmpty()){
            return -1;
        }
        return dataStack.peek();
    }

    public int min() {
        if(minStack.isEmpty()){
            return -1;
        }
        return minStack.peek();
    }

}
