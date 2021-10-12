package com.algorithm.mathematics;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-11 22:26
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 最小公约数
 */
public class CommonDivisor {

    /**
     * 辗转相除法
     *
     * @param a
     * @param b
     * @return
     */
    public static int getGreatestCommonDivisorV2(int a, int b) {
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        if (big % small == 0) {
            return small;
        }
        return getGreatestCommonDivisorV2(big % small, small);
    }

    /**
     * 更相减损术依
     *
     * @param a
     * @param b
     * @return
     */
    public static int getGreatestCommonDivisorV3(int a, int b) {
        if (a == b) {
            return a;
        }
        int big = a > b ? a : b;
        int small = a < b ? a : b;
        return getGreatestCommonDivisorV3(big - small, small);
    }

    public static int gcd(int a, int b) {
        if (a == b) {
            return a;
        }
        // 如果(a&1)==0， 则说明整数a是偶数； 如果(a&1)!=0， 则说明整数a是奇数。
        if ((a & 1) == 0 && (b & 1) == 0) {
            return gcd(a >> 1, b >> 1) << 1;
        } else if ((a & 1) == 0 && (b & 1) != 0) {
            return gcd(a >> 1, b);
        } else if ((a & 1) != 0 && (b & 1) == 0) {
            return gcd(a, b >> 1);
        } else {
            int big = a > b ? a : b;
            int small = a < b ? a : b;
            return gcd(big - small, small);
        }
    }
}
