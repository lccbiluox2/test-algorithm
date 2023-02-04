package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class MagicTwoArrayAvgAddTest {

    @Test
    public void maxOps() {
        int[] aar1 = new int[]{100,40,39,20,33,44};
        int[] aar2 = new int[]{10,30,20,13,12,9};
        int i = MagicTwoArrayAvgAdd.maxOps(aar1, aar2);
        System.out.println(i);
    }
}