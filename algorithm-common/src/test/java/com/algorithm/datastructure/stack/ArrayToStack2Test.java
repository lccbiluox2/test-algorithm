package com.algorithm.datastructure.stack;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-25 11:08
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ArrayToStack2Test {

    @Test
    public void push() {
        ArrayToStack2 arrayToStack = new ArrayToStack2(4);
        arrayToStack.push(1);
        arrayToStack.push(3);
        arrayToStack.push(2);
        arrayToStack.push(5);

        arrayToStack.print();
    }

    @Test
    public void push1() {
        ArrayToStack2 arrayToStack = new ArrayToStack2(4);
        arrayToStack.push(1);
        arrayToStack.push(3);
        arrayToStack.push(2);
        arrayToStack.push(5);
        arrayToStack.push(8);

        arrayToStack.print();
    }

    @Test
    public void pop2() {
        ArrayToStack2 arrayToStack = new ArrayToStack2(4);
        arrayToStack.push(1);
        arrayToStack.push(3);
        arrayToStack.push(2);
        arrayToStack.push(5);

        System.out.println(arrayToStack.pop());
        System.out.println(arrayToStack.pop());
        System.out.println(arrayToStack.pop());
        System.out.println(arrayToStack.pop());
        System.out.println(arrayToStack.pop());
    }

    @Test
    public void pop1() {
        ArrayToStack2 arrayToStack = new ArrayToStack2(4);
        arrayToStack.push(1);
        arrayToStack.push(3);
        arrayToStack.push(2);
        arrayToStack.push(5);

        System.out.println(arrayToStack.pop());
        System.out.println(arrayToStack.pop());
        System.out.println(arrayToStack.pop());
        System.out.println(arrayToStack.pop());

        arrayToStack.push(8);
        arrayToStack.push(10);
        arrayToStack.push(2);
        arrayToStack.push(7);

        arrayToStack.print();
    }
}