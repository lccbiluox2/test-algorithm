package com.algorithm.leetcode.swordoffer.offer47;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-10 13:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class GiftMaxValueTest {

    private GiftMaxValue giftMaxValue = new GiftMaxValue();

    @Test
    public void maxValue() {
        int[][] grid = new int[][]{
                {1, 3, 1, 10},
                {1, 5, 1, 2},
                {4, 2, 1, 6}
        };
        // 23
        int i = giftMaxValue.maxValue(grid);
        System.out.println(i);

        int[][] grid1 = new int[][]{
                {1,3,1,5},
                {1,5,1,2},
                {4,2,1,6}
        };
        //   1 3 5 2 1 6 = 18
        int i1 = giftMaxValue.maxValue(grid1);
        System.out.println(i1);


        int[][] grid2 = new int[][]{
                {1,1,5,5},
                {3,1,1,2},
                {4,2,1,6}
        };
        //   1 1 5 5 2 6 = 20
        int i2 = giftMaxValue.maxValue(grid2);
        System.out.println(i2);

        int[][] grid3 = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        //   1 3 5 2 1 = 12
        int i3 = giftMaxValue.maxValue(grid3);
        System.out.println(i3);

    }


    @Test
    public void maxValue1_1() {
        int[][] grid = new int[][]{
                {1, 3, 1, 10},
                {1, 5, 1, 2},
                {4, 2, 1, 6}
        };
        // 23
        int i = giftMaxValue.maxValue1(grid);
        System.out.println(i);

        int[][] grid1 = new int[][]{
                {1,3,1,5},
                {1,5,1,2},
                {4,2,1,6}
        };
        //   1 3 5 2 1 6 = 18
        int i1 = giftMaxValue.maxValue1(grid1);
        System.out.println(i1);


        int[][] grid2 = new int[][]{
                {1,1,5,5},
                {3,1,1,2},
                {4,2,1,6}
        };
        //   1 1 5 5 2 6 = 20
        int i2 = giftMaxValue.maxValue1(grid2);
        System.out.println(i2);

        int[][] grid3 = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        //   1 3 5 2 1 = 12
        int i3 = giftMaxValue.maxValue1(grid3);
        System.out.println(i3);

    }

    @Test
    public void maxValue1_2() {


        int[][] grid3 = new int[][]{
                {1,3,1},
                {1,5,1},
                {4,2,1}
        };
        //   1 3 5 2 1 = 12
        int i3 = giftMaxValue.maxValue1(grid3);
        System.out.println(i3);

    }
}