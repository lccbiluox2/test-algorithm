package com.algorithm.sort.count;

import cn.hutool.core.util.ArrayUtil;
import com.algorithm.utils.ArraysUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class CountSortV2Test {

    /***
     * todo: 14_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_14  2023/1/30 14:34 14 九师兄
     *   计数排序参考
     *   https://segmentfault.com/a/1190000039898739
     */
    @Test
    public void countSort() {
        int[] A = new int[]{1,3,5,3,100,4,5,6,2,8};
        int[] ints = CountSortV2.countSort(A);
        ArraysUtils.printIntArray(ints);
    }

    @Test
    public void countSort2() {
        int[] A = new int[]{1,3,5,3,100,4,5,6,2,8,10000};
        int[] ints = CountSortV2.countSort2(A);
        ArraysUtils.printIntArray(ints);
    }

    @Test
    public void countSort4() {
        int[] A = new int[]{1,3,5,3,100,4,5,6,2,8,10000};
        int[] ints = CountSortV2.countSort4(A);
        ArraysUtils.printIntArray(ints);
    }
}