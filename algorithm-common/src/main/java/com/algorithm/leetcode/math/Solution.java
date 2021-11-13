package com.algorithm.leetcode.math;

import java.util.HashMap;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-12 14:36
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Solution {

    /**
     * 这个数据量一旦大了就会超时
     *
     * @param n
     * @return
     */
    public int fib(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    int constant = 1000000007;

    /**
     * 下面这个使用Map保留已经计算的，这样会加快速度
     *
     * @param n
     * @return
     */
    public int fibMap(int n) {
        return fibMapCal(n, new HashMap<>());
    }

    /**
     * @param n           要计算的数据
     * @param allreadyCal 已经计算过的
     * @return
     */
    private int fibMapCal(int n, HashMap<Integer, Integer> allreadyCal) {
        if (n < 2) {
            return n;
        }
        // 如果n值已经计算过了 那么就直接获取
        if (allreadyCal.containsKey(n)) {
            return allreadyCal.get(n);
        }
        int first = fibMapCal(n - 1, allreadyCal) % constant;
        allreadyCal.put(n - 1, first);
        int second = fibMapCal(n - 2, allreadyCal) % constant;
        allreadyCal.put(n - 2, second);
        int res = (first + second) % constant;
        allreadyCal.put(n, res);
        return res;
    }

    /**
     * 使用公式计算
     * <p>
     * TODO: 这个公式不会写
     *
     * @param n
     * @return
     */
    public int fibMath(int n) {
        double sqrt = Math.sqrt(5);

        return 0;
    }

    public int fibNoRecursive(int n) {
        int constant = 1000000007;
        int first = 0;
        int second = 1;
        while (n-- > 0) {
            int temp = first + second;
            first = second % constant;
            second = temp % constant;
        }
        return first;
    }
}