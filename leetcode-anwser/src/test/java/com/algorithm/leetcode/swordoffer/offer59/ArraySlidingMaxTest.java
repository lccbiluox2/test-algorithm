package com.algorithm.leetcode.swordoffer.offer59;

import com.algorithm.swordoffer.offer59.ArraySlidingMax;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-04 22:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ArraySlidingMaxTest {

    private ArraySlidingMax arraySlidingMax = new ArraySlidingMax();

    @Test
    public void maxSlidingWindow1() {
        int[] numbers = new int[]{1,3,-1,-3,5,3,6,7};
        int[] ints = arraySlidingMax.maxSlidingWindow1(numbers, 3);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow2() {
        int[] numbers = new int[]{};
        int[] ints = arraySlidingMax.maxSlidingWindow1(numbers, 0);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow4() {
        int[] numbers = new int[]{1,-1};
        int[] ints = arraySlidingMax.maxSlidingWindow1(numbers, 1);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow3() {
        int[] numbers = new int[]{1,3,-1,-3,5,3,6,7};
        int[] ints = arraySlidingMax.maxSlidingWindow2(numbers, 3);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow2_2() {
        int[] numbers = new int[]{1,-1};
        int[] ints = arraySlidingMax.maxSlidingWindow2(numbers, 1);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow2_3() {
        int[] numbers = new int[]{7,2,4};
        int[] ints = arraySlidingMax.maxSlidingWindow2(numbers, 2);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow3_1() {
        int[] numbers = new int[]{1,3,-1,-3,5,3,6,7};
        int[] ints = arraySlidingMax.maxSlidingWindow3(numbers, 3);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow4_1() {
        int[] numbers = new int[]{1,3,-1,-3,5,3,6,7};
        int[] ints = arraySlidingMax.maxSlidingWindow4(numbers, 3);
        System.out.println(Arrays.toString(ints));
    }

    @Test
    public void maxSlidingWindow4_2() {
        int[] numbers = new int[]{7,2,4};
        int[] ints = arraySlidingMax.maxSlidingWindow4(numbers, 2);
        System.out.println(Arrays.toString(ints));
    }
}