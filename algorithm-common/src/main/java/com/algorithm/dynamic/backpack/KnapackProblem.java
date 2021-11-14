package com.algorithm.dynamic.backpack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-13 17:03
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class KnapackProblem {

    /**
     * 背包问题
     * 打印如下
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 1500 1500 1500 1500
     * 0 1500 1500 1500 3000
     * 0 1500 1500 2000 3500
     * 这里只是显示出来最大值是多少，并没有显示先放什么 后方什么
     */
    public static void knapack() {
        // TODO Auto-generated method stub
        int[] w = {1, 4, 3};//物品的重量
        int[] val = {1500, 3000, 2000}; //物品的价值这里ya1[i]就是前面讲 的v[i]
        int m = 4;//背包的容量
        int n = val.length; //物品的个数

        //创建二维数组,
        //v[i][j]表示在前i 个物品中能够装入容量为j的背包中的最大价值
        int[][] v = new int[n + 1][m + 1];
        //初始化第一行和第一 列，这里在本程序中，可以不去处理，因为默认就是0
        for (int i = 0; i < v.length; i++) {
            v[i][0] = 0; //将第一 列设 置为0
        }
        for (int i = 0; i < v[0].length; i++) {
            v[0][i] = 0; //将第yi
        }

        //输出一下V看看目前的情况
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

        int[][] path = new int[n + 1][m + 1];
        //根据前面得到公式来动态规划处理
        for (int i = 1; i < v.length; i++) { //不处理第一行
            for (int j = 1; j < v[0].length; j++) {
                if (w[i - 1] > j) {
                    v[i][j] = v[i - 1][j];
                } else {
                    // 为了记录商品放入背包的情况 需要if else改写公式
                    int left = v[i - 1][j];
                    int right = val[i - 1] + v[i - 1][j - w[i - 1]];
                    if (left < right) {
                        v[i][j] = right;
                        path[i][j] = 1;
                    } else {
                        v[i][j] = left;
                    }
                }
            }
        }

        //输出一下V看看目前的情况
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }


    /**
     * 测试结果
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 0 0 0 0
     * 0 1500 1500 1500 1500
     * 0 1500 1500 1500 3000
     * 0 1500 1500 2000 3500
     * 第3个商品放入到背包
     * 第1个商品放入到背包
     *
     */
    public static void knapack1() {
        // TODO Auto-generated method stub
        int[] w = {1, 4, 3};//物品的重量
        int[] val = {1500, 3000, 2000}; //物品的价值这里ya1[i]就是前面讲 的v[i]
        int m = 4;//背包的容量
        int n = val.length; //物品的个数

        //创建二维数组,
        //v[i][j]表示在前i 个物品中能够装入容量为j的背包中的最大价值
        int[][] v = new int[n + 1][m + 1];
        //初始化第一行和第一 列，这里在本程序中，可以不去处理，因为默认就是0
        for (int i = 0; i < v.length; i++) {
            v[i][0] = 0; //将第一 列设 置为0
        }
        for (int i = 0; i < v[0].length; i++) {
            v[0][i] = 0; //将第yi
        }

        //输出一下V看看目前的情况
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

        int[][] path = new int[n + 1][m + 1];
        //根据前面得到公式来动态规划处理
        for (int i = 1; i < v.length; i++) { //不处理第一行
            for (int j = 1; j < v[0].length; j++) {
                if (w[i - 1] > j) {
                    v[i][j] = v[i - 1][j];
                } else {
                    // 为了记录商品放入背包的情况 需要if else改写公式
                    int left = v[i - 1][j];
                    int right = val[i - 1] + v[i - 1][j - w[i - 1]];
                    if (left < right) {
                        v[i][j] = right;
                        path[i][j] = 1;
                    } else {
                        v[i][j] = left;
                    }
                }
            }
        }

        //输出一下V看看目前的情况
        for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }

        //动脑筋
        int i = path.length - 1; //行的最大下标
        int j = path[0].length - 1; //列的最大下标
        while (i > 0 && j > 0) {//从path的最后开始找
            if (path[i][j] == 1) {
                System.out.printf("第%d个商品放入到背包\n", i);
                j -= w[i - 1]; //w[i-1]
            }
            i--;
        }
    }

}
