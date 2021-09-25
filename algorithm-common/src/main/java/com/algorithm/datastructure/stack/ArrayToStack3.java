package com.algorithm.datastructure.stack;

import com.algorithm.utils.ArraysUtils;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 10:54
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 用栈实现综合计算
 */
public class ArrayToStack3 {
    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayToStack3(int maxSize) {
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

    public int priority(int oper) {
        if (oper == '*' || oper == '/') {
            return 1;
        } else if (oper == '+' || oper == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean isOperator(char value) {
        if (value == '+' || value == '-'
                || value == '*' || value == '/' ) {
            return true;
        }
        return false;
    }

    public int cal(int num1, int num2, int operator) {
        int res = 0;
        switch (operator) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 + num1;
                break;
            default:
                break;
        }
        return res;
    }


    public int peak() {
        if (isEmpty()) {
            throw new IllegalArgumentException("栈中没有数据");
        }
        int data = stack[top];
        return data;
    }
}