package com.algorithm.graph.dijkstra;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-21 15:09
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class DijkstraAlgorithmTest {


    /**
     * 测试点：测试图的构造
     *
     * [65535, 5, 7, 65535, 65535, 65535, 2]
     * [5, 65535, 65535, 9, 65535, 65535, 3]
     * [7, 65535, 65535, 65535, 8, 65535, 65535]
     * [65535, 9, 65535, 65535, 65535, 4, 65535]
     * [65535, 65535, 8, 65535, 65535, 5, 4]
     * [65535, 65535, 65535, 4, 5, 65535, 6]
     * [2, 3, 65535, 65535, 4, 6, 65535]
     */
    @Test
    public void createGraph(){
        char[] vertex = { 'A', 'B', 'C', 'D', 'E', 'F','G' };
        //郤接矩降
        int[][] matrix = new int[vertex. length] [vertex.length];
        final int N = 65535;//表示不可以達接
        matrix[0]=new int[]{N,5,7,N,N,N,2};
        matrix[1]=new int[]{5,N,N,9,N,N,3};
        matrix[2]=new int[]{7,N,N,N,8,N,N};
        matrix[3]=new int[]{N,9,N,N,N,4,N};
        matrix[4]=new int[]{N,N,8,N,N,5,4};
        matrix[5]=new int[]{N,N,N,4,5,N,6};
        matrix[6]=new int[]{2,3,N,N,4,6,N};
        //創建Graph対象
        Graph graph = new Graph(vertex, matrix);
        //測試,
        graph.showGraph();
    }


    @Test
    public void dsjTest(){
        char[] vertex = { 'A', 'B', 'C', 'D', 'E', 'F','G' };
        //郤接矩降
        int[][] matrix = new int[vertex. length] [vertex.length];
        final int N = 65535;//表示不可以達接
        matrix[0]=new int[]{N,5,7,N,N,N,2};
        matrix[1]=new int[]{5,N,N,9,N,N,3};
        matrix[2]=new int[]{7,N,N,N,8,N,N};
        matrix[3]=new int[]{N,9,N,N,N,4,N};
        matrix[4]=new int[]{N,N,8,N,N,5,4};
        matrix[5]=new int[]{N,N,N,4,5,N,6};
        matrix[6]=new int[]{2,3,N,N,4,6,N};
        //創建Graph対象
        Graph graph = new Graph(vertex, matrix);
        //測試,
        graph.dsj(6);
        graph.showDijkstra();
    }

}