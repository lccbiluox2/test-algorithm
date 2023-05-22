package com.algorithm.leetcode.swordoffer.offer29;

import com.algorithm.swordoffer.offer29.ClockwisePrintArray;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 10:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ClockwisePrintArrayTest {

    ClockwisePrintArray clockwisePrintArray = new ClockwisePrintArray();

    /**
     [
     *  [1,2,3,4,5]
     *  [6,7,8,9,10]
     *  [11,12,13,14,15]
     *  [16,17,18,19]
     * ]
     */
    @Test
    public void spiralOrder() {
        int[][] data = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20,21},
        };
        int[] ints = clockwisePrintArray.spiralOrder(data);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void spiralOrder1() {
        int[][] data = new int[][]{
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12}
        };
        int[] ints = clockwisePrintArray.spiralOrder(data);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void spiralOrder2_1() {
        int[][] data = new int[][]{
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20,21},
        };
        int[] ints = clockwisePrintArray.spiralOrder2(data);
        System.out.println(Arrays.toString(ints));
    }

}