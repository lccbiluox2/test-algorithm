package com.algorithm.mathematics;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-16 17:05
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class EightQueen2 {

    // 皇后/棋盘的个数
    private static final int max = 8;

    // 首先定义一个8 * 8 的棋盘
    private static final int[] array = new int[max];

    // 定义一共有多少种放置皇后的算法
    private static int COUNT = 0;
    private static int jujeCount = 0;

    /**
     * 打印棋盘
     */
    public static final void show() {
        System.out.println("第" + (++COUNT) + "次摆法");
        System.out.println(Arrays.toString(array));
        System.out.println(" ");
        for (int i = 0; i < max; i++) {
            // 第几列有数据
            int lie = array[i];
            for (int j = 0; j < max; j++) {
               if(lie == j){
                   System.out.print("M");
               }else {
                   System.out.print("0");
               }
                System.out.print(" ");
            }
            System.out.println("");
        }
    }


    public static void check(int n) {
        // n=8的时候位置放好了
        if (n == max) {
            show();
            return;
        }

        for (int i = 0; i < max; i++) {
            // 先把这个皇后放到第一个位置
            array[n] = i;
            // 不冲突
            if(juge(n)) {
                // 接着放n+1皇后
                check(n+1);
            }
            //如果冲突，就继续执行array[n] = i;即将第n个皇后，放置在本行得后移的一个位置
        }

        return ;
    }



    public static void main(String[] args) {
        check(0);
        System.out.println("总共判断次数"+jujeCount);
    }


    private static boolean juge(int n) {
        for (int i = 0; i < n; i++) {
            jujeCount++;
            //说明
            //1. array[i] == array[n]表示判断 第n个皇后是否和前面的n-1个皇后在同- -列
            //2. Math.abs(n-i) == Math. abs(array[n] - array[i]) 表示判断第n个皇后是否和第i皇后是否在同一斜线
            //n=1放置第2列1n=1array[1]=1
            // Math.abs(1-0) == 1 Math. abs(array[n] - array[i]) = Math.abs(1-0) = 1
            //3.判断是否在同一行，没有必要, n每次都在递增
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

}
