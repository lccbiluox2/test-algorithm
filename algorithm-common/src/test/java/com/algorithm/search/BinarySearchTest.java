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

    /**
     * 测试点：测试二分查找 查找可能浪费性能
     *
     * 查找次数
     * 查找次数
     * 查找次数
     * 查找次数
     * [0]
     */
    @Test
    public void binarySearch2() {
        int[] arr = {1,2,3,4,6,7,7,9,10,11,12,13,13,15,15,17,17,19};
        List<Integer> aa = BinarySearch.binarySearch1(arr, 0, arr.length - 1, 1);
        System.out.println(aa);
    }


    /**
     * 测试点：测试查找  测试查找一个不是边界值 也不是中间值需要多少
     *
     * 查找次数
     * 查找次数
     * 查找次数
     * 查找次数
     * [4]
     *
     * 可以看到用了4次
     *
     * todo:【算法】插值查找算法
     * https://blog.csdn.net/qq_21383435/article/details/120981935
     */
    @Test
    public void binarySearch3() {
        int[] arr = {1,2,3,4,6,7,7,9,10,11,12,13,13,15,15,17,17,19};
        List<Integer> aa = BinarySearch.binarySearch1(arr, 0, arr.length - 1, 6);
        System.out.println(aa);
    }

    /**
     * 二分查找非递归的方式实现
     *
     * 这里不能处理多个的情况
     *
     * https://blog.csdn.net/qq_21383435/article/details/120975055
     */
    @Test
    public void binarySearchNoRecursive() {
        int[] arr = {1,2,3,4,6,7,7,9,10,11,12,13,13,15,15,17,17,19};
        int aa = BinarySearch.binarySearchNoRecursive(arr, 2);
        System.out.println(aa);
    }
}