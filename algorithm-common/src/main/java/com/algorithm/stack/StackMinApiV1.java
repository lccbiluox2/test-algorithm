package com.algorithm.stack;

import java.util.Stack;

/**
 * todo: 2023/6/29 22:59 九师兄
 *
 * 【算法】JZ30 包含min函数的栈
 * https://blog.csdn.net/qq_21383435/article/details/131466048
 **/
public class StackMinApiV1 {

    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        dataStack.push(node);
        // 最小值栈为空 或者 最小值栈顶元素 大于 入栈元素 需要更新最小元素
        if(minStack.isEmpty() || node < minStack.peek()){
            minStack.push(node);
        } else{
            // 否则入栈一个最小元素的栈顶元素 ，很巧妙的地方
            minStack.push(minStack.peek());
        }
    }

    public void pop() {
        dataStack.pop();
        minStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
