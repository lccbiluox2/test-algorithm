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

    /***
     * todo: 九师兄  2023/7/1 15:22
     *
     * 【算法】剑指 Offer 57. 和为s的两个数字
     * https://blog.csdn.net/qq_21383435/article/details/121598461
     * 今天再次遇到这个问题，然后一瞬间就想到了这个双指针方法
     * 然后速度非常的快
     */
    @Test
    public void twoSum5() {
        int[] data = new int[]{1,3,4,7,9,12,14,15};
        int[] ints = andNumIsSpecified.twoSum5(data, 11);
        System.out.println(Arrays.toString(ints));
    }

    /***
     * todo: 九师兄  2023/7/1 16:43
     * 扩展题目：【算法】和为s的两个数字 最小乘积
     * https://blog.csdn.net/qq_21383435/article/details/131492106
     */
    @Test
    public void twoSum6() {
        int[] data = new int[]{1,2,3,4,5,6};
        int[] ints = andNumIsSpecified.twoSum6(data, 7);
        System.out.println(Arrays.toString(ints));
    }
}