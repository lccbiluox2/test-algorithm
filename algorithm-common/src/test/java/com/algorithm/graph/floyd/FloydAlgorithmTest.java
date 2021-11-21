package com.algorithm.graph.floyd;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-21 19:41
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class FloydAlgorithmTest {

    /**
     * 测试点：测试图的打印
     *
     * A A A A A A A
     * (A到A最短路口0) (A到B最短路口5) (A到C最短路口7) (A到D最短路口65535) (A到E最短路口65535) (A到F最短路口65535) (A到G最短路口2)
     * B B B B B B B
     * (B到A最短路口5) (B到B最短路口0) (B到C最短路口65535) (B到D最短路口9) (B到E最短路口65535) (B到F最短路口65535) (B到G最短路口3)
     * C C C C C C C
     * (C到A最短路口7) (C到B最短路口65535) (C到C最短路口0) (C到D最短路口65535) (C到E最短路口8) (C到F最短路口65535) (C到G最短路口65535)
     * D D D D D D D
     * (D到A最短路口65535) (D到B最短路口9) (D到C最短路口65535) (D到D最短路口0) (D到E最短路口65535) (D到F最短路口4) (D到G最短路口65535)
     * E E E E E E E
     * (E到A最短路口65535) (E到B最短路口65535) (E到C最短路口8) (E到D最短路口65535) (E到E最短路口0) (E到F最短路口5) (E到G最短路口4)
     * F F F F F F F
     * (F到A最短路口65535) (F到B最短路口65535) (F到C最短路口65535) (F到D最短路口4) (F到E最短路口5) (F到F最短路口0) (F到G最短路口6)
     * G G G G G G G
     * (G到A最短路口2) (G到B最短路口3) (G到C最短路口65535) (G到D最短路口65535) (G到E最短路口4) (G到F最短路口6) (G到G最短路口0)
     *
     */
    @Test
    public void grapha() {
        //测试看看图是否创建成功
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //创建邻接矩阵
        int[][] matrix = new int[vertex.length][vertex.length];
        final int N = 65535;
        matrix[0] = new int[]{0, 5, 7, N, N, N, 2};
        matrix[1] = new int[]{5, 0, N, 9, N, N, 3};
        matrix[2] = new int[]{7, N, 0, N, 8, N, N};
        matrix[3] = new int[]{N, 9, N, 0, N, 4, N};
        matrix[4] = new int[]{N, N, 8, N, 0, 5, 4};
        matrix[5] = new int[]{N, N, N, 4, 5, 0, 6};
        matrix[6] = new int[]{2, 3, N, N, 4, 6, 0};

        Graph graph = new Graph(7,matrix,vertex);
        graph.showBeautiful();
    }

    /**
     * 测试点：测试佛洛依德算法
     *
     * A A A F G G A
     * (A到A最短路口0) (A到B最短路口5) (A到C最短路口7) (A到D最短路口12) (A到E最短路口6) (A到F最短路口8) (A到G最短路口2)
     * B B A B G G B
     * (B到A最短路口5) (B到B最短路口0) (B到C最短路口12) (B到D最短路口9) (B到E最短路口7) (B到F最短路口9) (B到G最短路口3)
     * C A C F C E A
     * (C到A最短路口7) (C到B最短路口12) (C到C最短路口0) (C到D最短路口17) (C到E最短路口8) (C到F最短路口13) (C到G最短路口9)
     * G D E D F D F
     * (D到A最短路口12) (D到B最短路口9) (D到C最短路口17) (D到D最短路口0) (D到E最短路口9) (D到F最短路口4) (D到G最短路口10)
     * G G E F E E E
     * (E到A最短路口6) (E到B最短路口7) (E到C最短路口8) (E到D最短路口9) (E到E最短路口0) (E到F最短路口5) (E到G最短路口4)
     * G G E F F F F
     * (F到A最短路口8) (F到B最短路口9) (F到C最短路口13) (F到D最短路口4) (F到E最短路口5) (F到F最短路口0) (F到G最短路口6)
     * G G A F G G G
     * (G到A最短路口2) (G到B最短路口3) (G到C最短路口9) (G到D最短路口10) (G到E最短路口4) (G到F最短路口6) (G到G最短路口0)
     *
     */
    @Test
    public void floydTest() {
        //测试看看图是否创建成功
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        //创建邻接矩阵
        int[][] matrix = new int[vertex.length][vertex.length];
        final int N = 65535;
        matrix[0] = new int[]{0, 5, 7, N, N, N, 2};
        matrix[1] = new int[]{5, 0, N, 9, N, N, 3};
        matrix[2] = new int[]{7, N, 0, N, 8, N, N};
        matrix[3] = new int[]{N, 9, N, 0, N, 4, N};
        matrix[4] = new int[]{N, N, 8, N, 0, 5, 4};
        matrix[5] = new int[]{N, N, N, 4, 5, 0, 6};
        matrix[6] = new int[]{2, 3, N, N, 4, 6, 0};

        Graph graph = new Graph(7,matrix,vertex);
        graph.showBeautiful();

        System.out.println("计算后");

        graph.floyd();

        graph.showBeautiful();
    }


}