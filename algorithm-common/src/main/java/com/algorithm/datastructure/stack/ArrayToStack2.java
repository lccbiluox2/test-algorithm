package com.algorithm.datastructure.stack;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 10:54
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 数组模拟栈
 */
public class ArrayToStack2 {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayToStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int push(int data) {
        if (isFull()) {
            throw new IllegalArgumentException("栈满了");
        }
        top++;
        stack[top] = data;
        return 0;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalArgumentException("栈中没有数据");
        }
        int data = stack[top];
        stack[top] = 0;
        top--;
        return data;
    }

    public void print() {
        ArraysUtils.printIntArray(stack);
    }

}