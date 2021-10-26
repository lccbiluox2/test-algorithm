package com.algorithm.search;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-26 22:25
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo:【算法】插值查找算法
 * https://blog.csdn.net/qq_21383435/article/details/120981935
 */
public class InsertSearchTest {

    /**
     * 测试点：测试插值查找
     * 查找次数
     * 0
     * 可以看到只用了一次就找到了
     */
    @Test
    public void insertValueSearch() {
        int[] arr = {1,2,3,4,6,7,7,9,10,11,12,13,13,15,15,17,17,19};
        Integer aa = InsertSearch.insertValueSearch(arr, 0, arr.length - 1, 1);
        System.out.println(aa);
    }

    /**
     * 测试点：测试插值查找  测试查找一个不是边界值 也不是中间值需要多少
     * 查找次数
     * 4
     * 可以看到只用了一次就找到了
     */
    @Test
    public void insertValueSearch1() {
        int[] arr = {1,2,3,4,6,7,7,9,10,11,12,13,13,15,15,17,17,19};
        Integer aa = InsertSearch.insertValueSearch(arr, 0, arr.length - 1, 6);
        System.out.println(aa);
    }
}