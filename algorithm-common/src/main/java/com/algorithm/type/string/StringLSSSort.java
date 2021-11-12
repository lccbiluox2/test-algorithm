package com.algorithm.type.string;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-11 13:56
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class StringLSSSort {

    public static void sort(String[] a,int w){
        int N= a.length;
        int R = 256;
        String[] aux = new String[N];
        for (int d = w -1; 0 <= d ; d--) {
            // 根据第几个字符用键索引计数法排序
            int[] count = new int[R+1];

            // 计算出现的频率
            for (int i = 0; i < N; i++) {
                count[a[i].charAt(d)+1]++;
            }
            // 将频率转成索引
            for (int r = 0; r < R; r++) {
                count[r+1] += count[r];
            }

            for (int i = 0; i < N ; i++) {
                aux[count[a[i].charAt(d)]++] =a[i];
            }

            for (int i = 0; i < N; i++) {
                a[i] = aux[i];
            }

            System.out.println(Arrays.toString(a));
        }
    }
}
