package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotateTheMatrix90DegreesTest {


    /**
     *todo: 2023/2/4 21:16 九师兄
     * 16 11 6 1
     * 17 12 7 2
     * 18 13 8 3
     * 19 14 9 4
     **/
    @Test
    public void rotate() {
        int[][] data = new int[][]{
                {1, 2, 3, 4},
                {6, 7, 8, 9},
                {11, 12, 13, 14},
                {16, 17, 18, 19},
        };
        RotateTheMatrix90Degrees.rotate(data);
        RotateTheMatrix90Degrees.printMatrix(data);
    }
}