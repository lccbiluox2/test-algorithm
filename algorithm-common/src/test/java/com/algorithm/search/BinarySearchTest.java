package com.algorithm.search;

import com.algorithm.sort.RadixSort;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-26 10:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo: 【算法】算法 二分查找 二分查找 查找多个相同的值
 * https://blog.csdn.net/qq_21383435/article/details/120975055
 */
public class BinarySearchTest {

    /**
     * 测试点：测试二分查找
     */
    @Test
    public void binarySearch() {
        int[] arr = {3, 14, 53, 214, 542, 748};
        int aa = BinarySearch.binarySearch(arr, 0, arr.length - 1, 53);
        System.out.println(aa);
    }


    /**
     * 测试点：测试二分查找 查找多个相同的值
     */
    @Test
    public void binarySearch1() {
        int[] arr = {3, 14, 53,53,53, 214, 542, 748};
        List<Integer> aa = BinarySearch.binarySearch1(arr, 0, arr.length - 1, 53);
        System.out.println(aa);
    }
}