package com.algorithm.leetcode.swordoffer.offer66;

import com.algorithm.swordoffer.offer66.ProductArray;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-12 13:27
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ProductArrayTest {

    private ProductArray productArray = new ProductArray();

    @Test
    public void constructArr() {
        int[] data = new int[]{1,2};
        int[] ints = productArray.constructArr(data);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void constructArr1_1() {
        int[] data = new int[]{1,2,3,4,5};
        int[] ints = productArray.constructArr1(data);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void constructArr2_1() {
        int[] data = new int[]{2,4,1,3,5};
        int[] ints = productArray.constructArr2(data);
        System.out.println(Arrays.toString(ints));
    }
}