package com.algorithm.leetcode.swordoffer.offer13;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 15:21
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution1Test {

    Solution1 method = new Solution1();

    @Test
    public void movingCount1() {
        System.out.println();
        System.out.println();
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print("(" + i + "," + j + ")\t");
            }
            System.out.println();
            System.out.println();
        }

    }


    @Test
    public void movingCount() {
        int abcced = method.movingCount(7, 2, 3);
        System.out.println(abcced);

        System.out.println();
        System.out.println();
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("(" + i + "," + j + ")\t");
            }
            System.out.println();
            System.out.println();
        }

    }
}