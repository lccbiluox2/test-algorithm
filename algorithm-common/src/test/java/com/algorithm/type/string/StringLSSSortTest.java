package com.algorithm.type.string;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-11 14:24
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StringLSSSortTest {

    @Test
    public void sort() {
        String[]  arr = {"4p23sx","443sfw","4p543s","1wfr3w","14fr3w"};
        StringLSSSort.sort(arr,6);
        System.out.println(Arrays.toString(arr));
    }
}