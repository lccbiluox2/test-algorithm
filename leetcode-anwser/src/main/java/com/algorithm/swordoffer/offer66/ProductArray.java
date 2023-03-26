package com.algorithm.swordoffer.offer66;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-12 13:16
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 66. 构建乘积数组
 */
public class ProductArray {

    /**
     * 1,2,3,4,5
     * 120,60,40,30,24
     * <p>
     * i=0 2*3*4*5=120
     * i=1 1*3*4*5=60
     * i=2 1*2*4*5=40
     * i=3 1*2*3*5=30
     * i=4 1*2*3*4=24
     * <p>
     * 结果 超时
     */
    public int[] constructArr(int[] a) {
        if (a == null || a.length < 1) {
            return new int[0];
        }
        if (a.length == 1) {
            return a;
        }

        int[] resultArr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int[] tempArr = a.clone();
            tempArr[i] = 1;
            int result = 1;
            for (int j = 0; j < tempArr.length; j++) {
                result = result * tempArr[j];
            }
            resultArr[i] = result;
        }
        return resultArr;
    }


    /**
     * 看不懂
     */
    public int[] constructArr1(int[] a) {
        int len = a.length;
        if (len == 0) return new int[0];
        int[] b = new int[len];
        b[0] = 1;

        /**
         * 1,   2,   3,     4,      5
         * 1    0    0      0       0
         *     1*1   1*2    2*3     6*4
         * 1    1     2      6      24
         */
        for (int i = 1; i < len; i++) {
            b[i] = b[i - 1] * a[i - 1];
        }

        int tmp = 1;
        /**
         * a[i+1] 5   4   3   2   1
         * temp   5   20  60  120 120
         * b[i]   1    1   2  6   24
         *        5
         */
        for (int i = len - 2; i >= 0; i--) {
            tmp *= a[i + 1];
            b[i] *= tmp;
        }
        return b;
    }

    public int[] constructArr2(int[] a) {
        int len = a.length;
        if (len == 0) return new int[0];


        // 求前缀之积
        int[] preData = new int[len];
        preData[0] = 1;
        for (int i = 1; i < a.length; i++) {
            preData[i] = preData[i-1] * a[i-1];
        }

        // 求后缀积
        int[] afterData = new int[len];
        afterData[len-1] = 1;
        for (int i = a.length - 2; 0<= i ; i--) {
            afterData[i] = afterData[i+1] * a[i+1];
        }


        // pre * ans
        int[] ans = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            ans[i] = preData[i] * afterData[i];
        }


        return ans;
    }


}
