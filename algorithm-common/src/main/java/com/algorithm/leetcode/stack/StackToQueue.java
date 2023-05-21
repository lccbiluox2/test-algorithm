package com.algorithm.leetcode.stack;

import java.util.Stack;

public class StackToQueue {

    //用的jdk自带的栈
    private Stack<Integer> in = new Stack<>();
    private Stack<Integer> out = new Stack<>();

    public void offer(Integer val) {
        //入队
        in.push(val);
    }

    public Integer poll() throws Exception {
        // bud 代码
        if(in.isEmpty() && out.isEmpty()){
            return null;
        }
        //出队
        while (out.empty()) {
            while (!in.empty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty())
            throw new Exception("queue is empty");

        return out.pop();
    }

}
