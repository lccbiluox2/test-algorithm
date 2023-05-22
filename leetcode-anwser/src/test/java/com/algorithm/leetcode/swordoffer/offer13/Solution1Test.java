package com.algorithm.leetcode.swordoffer.offer13;

import com.algorithm.swordoffer.offer13.Solution1;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-25 15:21
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 剑指 Offer 13. 机器人的运动范围 【重刷】
 * https://blog.csdn.net/qq_21383435/article/details/121538897
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
        int abcced = method.movingCount(4, 4, 3);
        System.out.println(abcced);

        System.out.println();
        System.out.println();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("(" + i + "," + j + ")\t");
            }
            System.out.println();
        }

    }
}