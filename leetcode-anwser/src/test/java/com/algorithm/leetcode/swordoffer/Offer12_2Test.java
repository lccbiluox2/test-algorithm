package com.algorithm.leetcode.swordoffer;

import com.algorithm.swordoffer.offer12.Offer12;
import com.algorithm.swordoffer.offer12.Offer12_2;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-23 22:56
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Offer12_2Test {

    @Test
    public void exist1() {
        //创建祺盘
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        //测试一下耗时
        long start = System.currentTimeMillis();
        boolean abcced = Offer12.exist(board, "ABCCED");
        System.out.println(abcced);

    }

    /**
     * 测试点：测试找到2个结果
     * 最终结果：[[java.awt.Point[x=0,y=0], java.awt.Point[x=0,y=1], java.awt.Point[x=0,y=2], java.awt.Point[x=1,y=2], java.awt.Point[x=1,y=3], java.awt.Point[x=0,y=3]], [java.awt.Point[x=2,y=0], java.awt.Point[x=2,y=1], java.awt.Point[x=2,y=2], java.awt.Point[x=2,y=3], java.awt.Point[x=1,y=3], java.awt.Point[x=0,y=3]]]
     */
    @Test
    public void exist2() {
        //创建祺盘
        char[][] board = {
                {'A','B','C','D'},
                {'S','F','C','E'},
                {'A','B','C','C'}};

        //测试一下耗时
        long start = System.currentTimeMillis();
        boolean abcced = Offer12.exist(board, "ABCCED");
        System.out.println(abcced);

    }

    @Test
    public void exist3() {
        //创建祺盘
        char[][] board = {{'A','B'},{'C','D'}};

        //测试一下耗时
        long start = System.currentTimeMillis();
        boolean abcced = Offer12.exist(board, "ABCD");
        System.out.println(abcced);

    }


    @Test
    public void exist4() {
        Offer12_2 offer12_1 = new Offer12_2();
        //创建祺盘
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        //测试一下耗时
        long start = System.currentTimeMillis();
        boolean abcced = offer12_1.exist(board, "ABCCED");
        System.out.println(abcced);
    }







}