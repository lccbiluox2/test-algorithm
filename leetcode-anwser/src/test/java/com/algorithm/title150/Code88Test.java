package com.algorithm.title150;

import cn.hutool.core.util.ArrayUtil;
import com.algorithm.utils.ArraysUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class Code88Test {

    private Code88 code88 = new Code88();

    @Test
    public void merge() {
        int[] nums1 = {1,2,3,0,0,0};
        int m = 3;
        int[] nums2 = {2,5,6};
        int n = 3;
        code88.merge(nums1,m,nums2,n);
        ArraysUtils.printIntArray(nums1);
    }

    /***
     * todo: 九师兄  2023/10/15 21:10
     * nums1 = [1], m = 1, nums2 = [], n = 0
     */
    @Test
    public void merge1() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        code88.merge(nums1,m,nums2,n);
        ArraysUtils.printIntArray(nums1);;
    }

    // nums1 = [0], m = 0, nums2 = [1], n = 1
    @Test
    public void merge2() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        code88.merge(nums1,m,nums2,n);
        ArraysUtils.printIntArray(nums1);;
    }

    /***
     * todo: 九师兄  2023/10/15 21:15
     *
     * nums1 =   [2,0] m = 1
     * nums2 =  [1]
     *  n =  1
     */
    @Test
    public void merge3() {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        code88.merge(nums1,m,nums2,n);
        ArraysUtils.printIntArray(nums1);;
    }

}