package com.algorithm.sum;

import com.algorithm.leecode.array.DeleteRepeatItem;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-13 19:22
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MinSumTest {

    /**
     * 耗时：6890189
     * 时间复杂度为 O(N^2)
     */
    @Test
    public void removeDuplicates() {
        long start = System.nanoTime();
        int[] aa = new int[]{1, 3, 4, 2, 5};
        int i = MinSum.minSumViolence(aa);
        System.out.println(i);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

    /**
     * 耗时：1328494
     * 16
     *
     * 时间复杂度为 O(N) 耗时是上面的6分之一
     */
    @Test
    public void minSumMerge() {
        long start = System.nanoTime();
        int[] aa = new int[]{1, 3, 4, 2, 5};
        int i = MinSum.minSumMerge(aa);
        System.out.println(i);
        long end = System.nanoTime();
        System.out.println(end - start);
    }

}