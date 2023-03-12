package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoArrayMedianTest {

    public TwoArrayMedian twoArrayMedian = new TwoArrayMedian();

    @Test
    public void fidMedianSortedArrays() {
        int[] aArr = new int[]{1,3};
        int[] bArr = new int[]{2};
        double v = twoArrayMedian.fidMedianSortedArrays(aArr, bArr);
        System.out.println(v);
    }

    @Test
    public void fidMedianSortedArrays2() {
        int[] aArr = new int[]{1,2};
        int[] bArr = new int[]{3,4};
        double v = twoArrayMedian.fidMedianSortedArrays(aArr, bArr);
        System.out.println(v);
    }
}