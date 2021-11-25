package com.algorithm.leetcode.swordoffer;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-15 19:42
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class TheFrogTheSteps {

    /**
     * 一只青蛙一次可以跳上1级台阶，也可以跳上2级台阶。求该青蛙跳上一个 n 级的台阶总共有多少种跳法。
     *
     * @param n
     * @return
     */
    public static int numWays(int n) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        if (n==2)
            return 2;
        int n1=1;
        int n2=2;
        int count=2;
        while (count++<=n){
            int tmp=n1;
            n1=n2;
            n2=tmp+n2;
        }
        return n2;

    }

}
