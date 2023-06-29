package com.algorithm.stack;

import java.util.Stack;

/**
 * todo: 2023/6/29 22:59 九师兄
 *
 * 【算法】JZ30 包含min函数的栈
 * https://blog.csdn.net/qq_21383435/article/details/131466048
 **/
public class StackMinApiV2 {

    Stack<Integer> dataStack = new Stack<Integer>();
    Stack<Integer> minStack = new Stack<Integer>();

    public void push(int node) {
        dataStack.push(node);
        // 最小值栈为空 或者 最小值栈顶元素 大于 入栈元素 需要更新最小元素
        if(minStack.isEmpty() || node < minStack.peek()){
            minStack.push(node);
        }
    }

    public void pop() {
        Integer data = dataStack.peek();
        Integer minTop = minStack.peek();
        /**
         * todo: 2023/6/29 22:49 九师兄
         * 这里按照我这种思路，是有问题的，如果处理没有重复的数据是没有问题的
         * 但是如果处理有重复的数据，那么就是有问题的，因为第一次最小值出现2次
         * 然后如果你移除一次，下一次就没得移除了
         **/
        // 说明要出栈的是最小元素
        if(data == minTop ){
            dataStack.pop();
            minStack.pop();
        }else {
            dataStack.pop();
        }

    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}
