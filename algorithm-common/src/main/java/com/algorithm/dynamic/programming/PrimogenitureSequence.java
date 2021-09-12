package com.algorithm.dynamic.programming;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-05-26 21:14
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 最长子序列 算法
 */
public class PrimogenitureSequence {

    public Integer cal(int[] numbers, int i) {
        if (i == numbers.length - 1) {
            return 1;
        }
        int maxLenth = 1;
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[j] > numbers[i]) {
                maxLenth = Math.max(maxLenth, cal(numbers, j) + 1);
            }
        }
        return maxLenth;
    }

    public int lengthOfList(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {
            max = Math.max(cal(numbers, i), i);
        }
        return max;
    }

}
