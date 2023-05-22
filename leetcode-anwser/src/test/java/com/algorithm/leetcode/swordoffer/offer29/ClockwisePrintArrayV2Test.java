package com.algorithm.leetcode.swordoffer.offer29;

import com.algorithm.swordoffer.offer29.ClockwisePrintArrayV2;
import org.junit.Test;

public class ClockwisePrintArrayV2Test {

    /**
     *todo: 2023/2/4 21:09 九师兄
     * 注意这里故意多了一个21
     **/
    @Test
    public void spiralorderPrint() {
        int[][] data = new int[][]{
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20, 21},
        };
        ClockwisePrintArrayV2.spiralorderPrint(data);
    }

    /**
     *todo: 2023/2/4 21:16 九师兄
     * 节点A:(0,0) 节点B:(6,6)
     * 节点A:(1,1) 节点B:(5,5)
     * 节点A:(2,2) 节点B:(4,4)
     * 节点A:(3,3) 节点B:(3,3)
     * [横着]节点A:(3,3) 节点B:(3,3)
     *
     * 1 2 3 4 5 6 7 14 21 28 35 42 49 48 47 46 45 44 43 36 29 22 15 8
     * 9 10 11 12 13 20 27 34 41 40 39 38 27 30 23 16 17 18 19 26 33 32
     * 31 24 25
     **/
    @Test
    public void spiralorderPrint2() {
        int[][] data = new int[][]{
                {1, 2, 3, 4, 5,6,7},
                {8, 9, 10, 11, 12,13,14},
                {15, 16, 17, 18, 19,20,21},
                {22, 23, 24, 25, 26,27,28},
                {29, 30, 31, 32, 33,34,35},
                {36, 27, 38, 39, 40,41,42},
                {43, 44, 45, 46, 47,48,49},
        };
        ClockwisePrintArrayV2.spiralorderPrint(data);
    }
}