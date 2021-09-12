package com.algorithm.stack.queue;

import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-02 18:59
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StackToQueue {

    private static Stack<Integer> stackIn = new Stack<>();
    private static Stack<Integer> stackOut = new Stack<>();

    public static boolean stackInAdd(Integer in) {
        // 栈1 为空的时候 才允许加入
        if (stackOut.isEmpty()) {
            stackIn.add(in);
            System.out.println("栈1加入数据"+stackIn.size() + " 栈2："+stackOut.size());
            return true;
        }
        return false;
    }

    public static void stackOutAdd() {
        // 栈1 为空的时候 才允许加入
        if (!stackIn.isEmpty()) {
            Integer stackPop = stackIn.pop();
            if (stackPop != null) {
                System.out.println("栈2加入数据"+stackOut.size() + " 栈1："+stackIn.size());
                stackOut.push(stackPop);
            }
        }
    }


    public static void stackOutPrint() {
        // 栈1 为空的时候 才允许加入
        if (!stackOut.isEmpty()) {
            Integer stackPop = stackOut.pop();
            if (stackPop != null) {
                System.out.println(stackPop);
            }
        }
    }
}
