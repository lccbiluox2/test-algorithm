package com.algorithm.anoperation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-02 13:27
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BitAboveTest {

    @Test
    public void sortByBits() {
        int[] arr = {2, 3, 5, 7, 11, 13, 17, 19};
        int[] ints = BitAbove.sortByBits(arr);
        System.out.println(Arrays.toString(ints));
    }
}