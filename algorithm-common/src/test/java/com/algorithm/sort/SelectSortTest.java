package com.algorithm.sort;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-17 20:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SelectSortTest {

    @Test
    public void selectSortDemo1() {
        int[] arr = {1,5,2,4,2,7,9};
        SelectSort.selectSortDemo1(arr);
    }
}