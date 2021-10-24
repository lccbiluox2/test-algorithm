package com.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 14:23
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ShellSortTest {

    @Test
    public void sort2() {
        int[] arr = {9, 5, 1, 7, 10};
        ShellSort.sort2(arr);
    }

    @Test
    public void sort() {
        int[] arr = {9, 5, 1, 7, 10};
        ShellSort.sort(arr);
    }

    /**
     * 测地点：测试希尔排序的简单大小最优值
     * h = 3*h+1
     */
    @Test
    public void kunthSort() {
        int[] arr = {9, 5, 1, 7, 10};
        ShellSort.kunthSort(arr);
    }

    /**
     * 测地点： 希尔排序推导
     */
    @Test
    public void tuidao() {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        ShellSort.tuidao(arr);
    }

    /**
     * 测地点： 希尔排序推导
     */
    @Test
    public void tuidao1() {
        int[] arr = {8, 9, 1, 7, 2, 3, 5, 4, 6, 0};
        ShellSort.tuidao1(arr);
    }

    /**
     * 测地点： 希尔排序 8万的性能测试
     */
    @Test
    public void tuidaoXingNeng() {
        int count = 80000;
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 80000);
        }
        long start = System.currentTimeMillis();
        ShellSort.tuidao1(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    /**
     * 测地点： 希尔排序 位移方法
     *
     * 恐怖如斯  测试性能不到1秒
     * 105 毫秒
     *
     * 地址：https://blog.csdn.net/qq_21383435/article/details/120933829
     */
    @Test
    public void weiyi() {
        int count = 80000;
        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = (int) (Math.random() * 80000);
        }
        long start = System.currentTimeMillis();
        arr = ShellSort.weiyi(arr);
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        System.out.println(Arrays.toString(arr));
    }
}