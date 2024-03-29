package com.algorithm.leetcode.swordoffer.offer12;

import com.algorithm.swordoffer.offer12.Leetcode1;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-24 22:11
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Leetcode1Test {

    private Leetcode1 method = new Leetcode1();

    /**
     * 运行结果
     *
     * A当前状态
     * 访问地址（x=0 y=0)
     * [A, B, C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=0 对应的字符：A
     *
     * B当前状态
     * 访问地址（x=0 y=0)
     * [ , B, C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=0 对应的字符：A
     *
     * A当前状态
     * 访问地址（x=0 y=1)
     * [ , B, C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=1 对应的字符：B
     *
     * B当前状态
     * 访问地址（x=0 y=1)
     * [ ,  , C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=1 对应的字符：B
     *
     * A当前状态
     * 访问地址（x=0 y=2)
     * [ ,  , C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=2 对应的字符：C
     *
     * B当前状态
     * 访问地址（x=0 y=2)
     * [ ,  ,  , E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=2 对应的字符：C
     *
     * A当前状态
     * 访问地址（x=0 y=3)
     * [ ,  ,  , E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=3 对应的字符：C
     *
     * A当前状态
     * 访问地址（x=1 y=2)
     * [ ,  ,  , E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=3 对应的字符：C
     *
     * B当前状态
     * 访问地址（x=1 y=2)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=3 对应的字符：C
     *
     * A当前状态
     * 访问地址（x=1 y=3)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=4 对应的字符：E
     *
     * A当前状态
     * 访问地址（x=2 y=2)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=4 对应的字符：E
     *
     * B当前状态
     * 访问地址（x=2 y=2)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D,  , E]
     * 当前要访问的字符串 k=4 对应的字符：E
     *
     * A当前状态
     * 访问地址（x=2 y=3)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D,  , E]
     * 当前要访问的字符串 k=5 对应的字符：D
     *
     * A当前状态
     * 访问地址（x=3 y=2)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D,  , E]
     * 当前要访问的字符串 k=5 对应的字符：D
     *
     * A当前状态
     * 访问地址（x=1 y=2)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D,  , E]
     * 当前要访问的字符串 k=5 对应的字符：D
     *
     * A当前状态
     * 访问地址（x=2 y=1)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D,  , E]
     * 当前要访问的字符串 k=5 对应的字符：D
     *
     * C当前状态
     * 访问地址（x=2 y=2)
     * [ ,  ,  , E]
     * [S, F,  , S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=4 对应的字符：E
     *
     * C当前状态
     * 访问地址（x=1 y=2)
     * [ ,  ,  , E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=3 对应的字符：C
     *
     * C当前状态
     * 访问地址（x=0 y=2)
     * [ ,  , C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=2 对应的字符：C
     *
     * C当前状态
     * 访问地址（x=0 y=1)
     * [ , B, C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=1 对应的字符：B
     *
     * C当前状态
     * 访问地址（x=0 y=0)
     * [A, B, C, E]
     * [S, F, C, S]
     * [A, D, E, E]
     * 当前要访问的字符串 k=0 对应的字符：A
     */
    @Test
    public void exist1() {
        //创建祺盘
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        //测试一下耗时
        long start = System.currentTimeMillis();
        boolean abcced = method.exist(board, "ABCCED");
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
        boolean abcced = method.exist(board, "ABCCED");
        System.out.println(abcced);

    }

    @Test
    public void exist3() {
        //创建祺盘
        char[][] board = {{'A','B'},{'C','D'}};

        //测试一下耗时
        long start = System.currentTimeMillis();
        boolean abcced = method.exist(board, "ABCD");
        System.out.println(abcced);

    }


    @Test
    public void exist4() {
        //创建祺盘
        char[][] board = {
                {'A','B','C','E'},
                {'S','F','C','S'},
                {'A','D','E','E'}};

        //测试一下耗时
        long start = System.currentTimeMillis();
        boolean abcced = method.exist(board, "ABCCED");
        System.out.println(abcced);
    }



}