package com.algorithm.leetcode.swordoffer.offer57;

import com.algorithm.swordoffer.offer57.AndNumIsSpecified;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 21:19
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class AndNumIsSpecifiedTest {

    private AndNumIsSpecified andNumIsSpecified = new AndNumIsSpecified();

    /**
     * [4, 7]
     *
     * 1,3,4,7,9,12,14,15
     * 1,3,4,7,9,12,14,15
     */
    @Test
    public void twoSum() {
        int[] data = new int[]{1,3,4,7,9,12,14,15};
        int[] ints = andNumIsSpecified.twoSum(data, 11);
        System.out.println(Arrays.toString(ints));
    }

    /**
     * 16
     * 15
     * 13
     * 10
     * 12
     * 10
     * 11
     * [4, 7]
     */
    @Test
    public void twoSum2() {
        int[] data = new int[]{1,3,4,7,9,12,14,15};
        int[] ints = andNumIsSpecified.twoSum3(data, 11);
        System.out.println(Arrays.toString(ints));
    }
}