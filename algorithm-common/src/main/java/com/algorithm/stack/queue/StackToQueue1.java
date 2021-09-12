package com.algorithm.stack.queue;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-03 21:15
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StackToQueue1<E> {
    //用的jdk自带的栈
    private Stack<E> s1 = new Stack<>();
    private Stack<E> s2 = new Stack<>();

    public void offer(E val) {
        //入队
        s1.push(val);
    }

    public E poll() {
        //出队
        //
        while (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.peek());
                s1.pop();
            }
        }
        E val = s2.peek();
        s2.pop();
        //获取出队元素后，再将s2里面的元素放入s1里面。
        //
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return val;
    }

    public E peek() {
        //查看对头元素
        while (s2.empty()) {
            while (!s1.empty()) {
                s2.push(s1.peek());
                s1.pop();
            }
        }
        E val = s2.peek();
        //获取出队元素后，再将s2里面的元素放入s1里面。
        while (!s2.empty()) {
            s1.push(s2.pop());
        }
        return val;
    }

    public boolean empty() {
        //判断队是否为空
        return s1.empty();
    }
}
