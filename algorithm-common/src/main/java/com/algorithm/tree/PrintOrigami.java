package com.algorithm.tree;

public class PrintOrigami {

    /***
     * todo: 6_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_6  2023/1/14 下午9:09 6 九师兄
     *
     *  打印折纸的凹凸
     */
    public static void printAllFolds(int N) {
        printProcess(1, N, true);
    }

    private static Integer level = 0;
    private static void printProcess(int i, int N, boolean down) {
        if (i > N) {
            return;
        }
        level++;
        printProcess(i + 1, N, true);
        System.out.print(down ? level+"凹 " : level+"凸 ");
        printProcess(i + 1, N, false);
        level--;
    }
}
