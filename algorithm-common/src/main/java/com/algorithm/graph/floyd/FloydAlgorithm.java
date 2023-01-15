package com.algorithm.graph.floyd;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-21 19:36
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 弗洛伊德算法
 *
 * https://blog.csdn.net/qq_21383435/article/details/121457424
 */
public class FloydAlgorithm {
}

//创建图.
class Graph {
    private char[] vertex; //存 放顶点的数组
    private int[][] dis; //保存，从各个顶点出发到其它项点的距离，最后的结果，也是保留在该数组
    private int[][] pre;// 保存到达目标顶点的前驱顶点


    //构造器

    /**
     * @param length 大小
     * @param matrix 邻接矩阵
     * @param vertex 顶点数组
     */
    public Graph(int length, int[][] matrix, char[] vertex) {
        this.vertex = vertex;
        this.dis = matrix;
        this.pre = new int[length][length];

        //对pre数组初始化，注意存放的是前驱项点的下标
        for (int i = 0; i < length; i++) {
            Arrays.fill(pre[i], i);
        }
    }


    //显示pre数组和dis数组
    public void show() {
        for (int k = 0; k < dis.length; k++) {
            //先将pre数组输出的一-行
            for (int i = 0; i < dis.length; i++) {
                System.out.print(pre[k][i] + " ");
            }
            System.out.println();
            //输出dis数组的一行数据
            for (int i = 0; i < dis.length; i++) {
                System.out.print(dis[k][i] + "");
            }
            System.out.println();
        }
    }

    //显示pre数组和dis数组
    public void showBeautiful() {
        //为了显示便于阅读，我们优化一下输出
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        for (int k = 0; k < dis.length; k++) {
            //先将pre数组输出的一-行
            for (int i = 0; i < dis.length; i++) {
                System.out.print(vertex[pre[k][i]] + " ");
            }
            System.out.println();
            //输出dis数组的一-行数据
            for (int i = 0; i < dis.length; i++) {
                System.out.print("(" + vertex[k] + "到" + vertex[i] + "最短路口" + dis[k][i] + ") ");
            }
            System.out.println();
        }
    }


    //弗洛伊德算法
    public void floyd() {
        int len = 0; //变量保存距离
        //对中间顶点遍历，k就是中间顶点的下标[A, B, C, D, E, F, G]
        for(int k = 0; k < dis.length; k++) { //
            //从i顶点开始出发[A, B, C, D, E, F, G]
            for(int i = 0; i < dis.length; i++) {
                //到达j顶点// [A, Bp C, D, E, F, G]
                for(int j = 0; j < dis.length; j++) {
                    len = dis[i][k] + dis[k][j];// =>求出从i顶点出发,经过k中间顶点,到达j顶点距离
                    if(len < dis[i][j]) {//如果1en小于dis[i][j]
                        dis[i][j] = len;//更新距离
                        pre[i][j] = pre[k][j];//更新前驱项点
                    }
                }
            }
        }
    }

}