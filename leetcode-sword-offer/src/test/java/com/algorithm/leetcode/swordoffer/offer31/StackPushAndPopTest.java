package com.algorithm.leetcode.swordoffer.offer31;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-10 11:08
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StackPushAndPopTest {

    private StackPushAndPop client = new StackPushAndPop();


    @Test
    public void validateStackSequences() {
        int[] pushed = new int[]{1,2,3,4,5};
        int[] popped = new int[]{4,5,3,2,1};
        boolean b = client.validateStackSequences(pushed, popped);
        System.out.println(b);

        int[] pushed1 = new int[]{1,2,3,4,5};
        int[] popped1 = new int[]{4,3,5,1,2};
        boolean b1 = client.validateStackSequences(pushed1, popped1);
        System.out.println(b1);
    }
}