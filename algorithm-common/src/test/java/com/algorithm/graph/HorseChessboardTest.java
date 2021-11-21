package com.algorithm.graph;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-21 21:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class HorseChessboardTest {


    /**
     * 测试点：马踏棋盘
     * 测试结果如下：
     * 一共耗时: 50353 毫秒
     * 1	8	11	16	3	18	13	64
     * 10	27	2	7	12	15	4	19
     * 53	24	9	28	17	6	63	14
     * 26	39	52	23	62	29	20	5
     * 43	54	25	38	51	22	33	30
     * 40	57	42	61	32	35	48	21
     * 55	44	59	50	37	46	31	34
     * 58	41	56	45	60	49	36	47
     *
     * 经过验证是正常的
     */
    @Test
    public void traversalChessboard() {
        int X = 8;
        int Y = 8;
        int row = 1; //马儿初始位置的行，从1开始编号
        int column = 1; //马儿初始位置的列，从1开始编号
        //创建祺盘
        int[][] chessboard = new int[X][Y];

        //测试一下耗时
        long start = System.currentTimeMillis();
        HorseChessboard.init(X, Y);
        HorseChessboard.traversalChessboard(chessboard, row - 1, column - 1, 1);

        long end = System.currentTimeMillis();
        System.out.println("一共耗时: " + (end - start) + " 毫秒");
        //输出棋盘的最后情况
        for (int[] rows : chessboard) {
            for (int step : rows) {
                System.out.print(step + "\t");
            }
            System.out.println();
        }
    }


    /**
     * 测试点：使用贪心算法对其进行优化
     *
     * 一共耗时: 247 毫秒
     * 1	16	37	32	3	18	47	22
     * 38	31	2	17	48	21	4	19
     * 15	36	49	54	33	64	23	46
     * 30	39	60	35	50	53	20	5
     * 61	14	55	52	63	34	45	24
     * 40	29	62	59	56	51	6	9
     * 13	58	27	42	11	8	25	44
     * 28	41	12	57	26	43	10	7
     *
     * 可以看到速度贼快了
     */
    @Test
    public void traversalChessboardGreedyTets() {
        int X = 8;
        int Y = 8;
        int row = 1; //马儿初始位置的行，从1开始编号
        int column = 1; //马儿初始位置的列，从1开始编号
        //创建祺盘
        int[][] chessboard = new int[X][Y];

        //测试一下耗时
        long start = System.currentTimeMillis();
        HorseChessboard.init(X, Y);
        HorseChessboard.traversalChessboardGreedy(chessboard, row - 1, column - 1, 1);

        long end = System.currentTimeMillis();
        System.out.println("一共耗时: " + (end - start) + " 毫秒");
        //输出棋盘的最后情况
        for (int[] rows : chessboard) {
            for (int step : rows) {
                System.out.print(step + "\t");
            }
            System.out.println();
        }
    }
}