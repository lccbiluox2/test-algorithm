package com.algorithm.caculator;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-12 13:54
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ExclusiveOrDemo {


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

}
