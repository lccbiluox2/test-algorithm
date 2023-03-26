package com.algorithm.swordoffer.offer17;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-05 12:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PrintNumbers {

    public int[] printNumbers(int n) {
        int max = getMax(n);
        int[] data = new int[max];
        for (int i = 1; i <= max; i++) {
            data[i-1] = i;
        }
        return data;
    }


    private int getMax(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            builder.append("9");
        }
        if(builder.toString().equals("")){
            return 0;
        }
        return Integer.parseInt(builder.toString());
    }


    public int[] printNumbers1(int n) {
        int m= (int)Math.pow(10,n);
        int[] a = new int[m-1];
        for(int i=0;i<m-1;i++){
            a[i] = i+1;
        }
        return a;
    }
}
