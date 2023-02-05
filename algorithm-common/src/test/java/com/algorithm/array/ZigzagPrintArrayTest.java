package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigzagPrintArrayTest {

    /**
     *todo: 2023/2/5 09:51 九师兄
     * 1 2 6 11 7 3 4 8 12 16 17 13 9 14 18 19
     **/
    @Test
    public void printMatrixZigZag() {
        int[][] data = new int[][]{
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19},
        };

        ZigzagPrintArray.printMatrixZigZag(data);
    }
}