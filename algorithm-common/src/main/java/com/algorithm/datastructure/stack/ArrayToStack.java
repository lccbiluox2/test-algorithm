package com.algorithm.datastructure.stack;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 10:54
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 数组模拟栈
 */
public class ArrayToStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;
    private int free;

    public ArrayToStack(int maxSize) {
        this.maxSize = maxSize;
        this.free = maxSize;
        stack = new int[maxSize];
    }

    public int push(int data) {
        if (free < 1) {
            throw new IllegalArgumentException("栈满了");
        }
        int index = maxSize - free;
        stack[index] = data;
        free--;
        return 0;
    }

    public int pop() {
        if (free == maxSize) {
            throw new IllegalArgumentException("栈中没有数据");
        }
        int index = (maxSize - free - 1);
        int data = stack[index];
        free++;
        stack[index] = 0;
        return data;
    }

    public void print() {
        ArraysUtils.printIntArray(stack);
    }

}