package com.algorithm.leetcode.swordoffer.offer56;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-11 09:54
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【算法】剑指 Offer 56 - I. 数组中数字出现的次数 【重刷】太难了
 */
public class SingleNumber {

    public int[] singleNumbers(int[] nums) {
        int eor = 0;
        for (Integer item : nums) {
            eor = eor ^ item;
        }
        // eor = a^ b
        // eor ！= 0
        // eor 必然有一个位置上是1
        int rightOne = eor & (~eor + 1); // 提取出最右的1

        int onlyOne = 0;
        for (int item : nums) {
            if ((item & rightOne) == 0) {
                onlyOne ^= item;
            }
        }
        int[] aa = new int[2];
        aa[0] = onlyOne;
        aa[1] = eor ^ onlyOne;
        return aa;
    }



    public static void anOddNumber(Integer[] arr) {
        int eor = 0;
        for (Integer item : arr) {
            eor = eor ^ item;
        }
        System.out.println(eor);
    }

    public static void twoOddNumber(Integer[] arr) {
        int eor = 0;
        for (Integer item : arr) {
            eor = eor ^ item;
        }
        // eor = a^ b
        // eor ！= 0
        // eor 必然有一个位置上是1
        int rightOne = eor & (~eor + 1); // 提取出最右的1

        int onlyOne = 0;
        for (int item : arr) {
            if ((item & rightOne) == 0) {
                onlyOne ^= item;
            }
        }
        System.out.println(onlyOne + " " + (eor ^ onlyOne));
    }


    public int[] singleNumbers1(int[] nums) {
        int ret = 0; // 所有数字的异或结果
        int a = 0;
        int b =0;
        for (int n:nums){
            ret = ret ^ n;
        }

        // 找到第一位不是0的
        int h = 1;
        while ((ret & h) == 0){
            h <<= 1;
        }
        for (int n:nums){
            if((h & n) == 0 ){
                a ^= n;
            }else {
                b ^= n;
            }
        }
        int[] aa = new int[2];
        aa[0] = a;
        aa[1] = b;
        return aa;
    }

}
