package com.algorithm.sort;

import com.algorithm.utils.ArraysUtils;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-19 19:42
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 计数排序
 */
public class CountSort {

    /**
     * 测试点:腾讯面试题，你高考考了600分，不使用排序，如何知道你的名次
     * 核心思考： 参考：https://www.bilibili.com/video/BV14i4y1T7Af?p=20
     * 桶排序，计数排序
     * <p>
     * 这里我们假设分数是1-10分。
     *
     * @param arr
     * @return
     */
    public static int ranking(int[] arr, int score) {
        int[] countArr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        ArraysUtils.printIntArray(countArr);

        int count = 0;
        // score <= i  不带并列第几 如果是 score < i  那么就能算出来并列第几
        for (int i = countArr.length - 1; score <= i; i--) {
            count = count + countArr[i];
        }
        return count;
    }


    /**
     * 测试点： 累加数组，保持稳定性
     * todo: 这个思路有点不好理解
     * 参考：https://www.bilibili.com/video/BV14i4y1T7Af?p=21
     * 现在就变成一个稳定的排序了
     *
     * @param arr
     * @return
     */
    public static int[] cumulative(int[] arr) {
        int[] countArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i]]++;
        }
        ArraysUtils.printIntArray(countArr);


        for (int i = 1; i < countArr.length; i++) {
            countArr[i] = countArr[i] + countArr[i - 1];
        }

        int[] result = new int[arr.length];
        for (int i = arr.length - 1; 0 <= i; i--) {
            result[--countArr[arr[i]]] = arr[i];
        }
        ArraysUtils.printIntArray(result);

        return result;
    }


    public static int[] countSort(int[] array) {
        //1.得到数列的最大值
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        //2.根据数列最大值确定统计数组的长度
        int[] countArray = new int[max + 1];
        //3.遍历数列，填充统计数组
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        //4.遍历统计数组，输出结果
        int index = 0;
        int[] sortedArray = new int[array.length];
        for (int i = 0; i < countArray.length; i++) {
            for (int j = 0; j < countArray[i]; j++) {
                sortedArray[index++] = i;
            }
        }
        return sortedArray;
    }

}
