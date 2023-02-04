package com.algorithm.bit;

/**
 *todo: 2023/2/4 08:25 九师兄
 *
 * 位运算的题目
 * 给定两个有符号32位整数a和b，返回a和b中较大的。
 * 【要求】
 * 不用做任何比较判断。
 **/
public class ComparetorData {

    //请保证参数n，不是1就是a的情况下
   // 1->0
   // 0->1
    public static int flip(int n) {
        return n ^ 1;
    }

    public static int sign(int n){
        // n是非负数，返回1
        // n是负数，返回0
        return flip(( n >> 31) & 1);
    }


    public static int getMax1(int a, int b) {
        int c = a - b;
        int scA = sign(c); // a-b为负，sca为0 ，否则是1
        int scB = flip(scA); // scA为0,scB为1， scA为1,scB为0
        // scA为0, scB为1，scA为1, scB为0
        return a * scA + b * scB;
    }

    public static int getMax2(int a, int b) {
        int c = a - b;
        int sa = sign(a);
        int sb = sign(b);
        int sc = sign(c);
        int difsab = sa ^ sb;//a和b的符号不一样，为1;
        int samesab = flip(difsab);//a和b的符号一样，为1;,不一样为0
        int returnA = difsab * sa + samesab * sc;
        int returnB = flip(returnA);
        return a * returnA + b * returnB;
    }

}
