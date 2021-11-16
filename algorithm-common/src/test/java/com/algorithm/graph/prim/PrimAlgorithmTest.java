package com.algorithm.graph.prim;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-15 22:47
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PrimAlgorithmTest {

    /**
     * 测试点：测试普利姆算法
     *
     * 算法运行结果如下
     *
     * [10000, 5, 7, 10000, 10000, 10000, 2]
     * [5, 10000, 10000, 9, 10000, 10000, 3]
     * [7, 10000, 10000, 10000, 8, 10000, 10000]
     * [10000, 9, 10000, 10000, 10000, 4, 10000]
     * [10000, 10000, 8, 10000, 10000, 5, 4]
     * [1000, 10000, 10000, 4, 5, 10000, 6]
     * [2, 3, 10000, 10000, 4, 6, 10000]
     * 边<A,G>权值:2
     * 边<G,B>权值:3
     * 边<G,E>权值:4
     * 边<E,F>权值:5
     * 边<F,D>权值:4
     * 边<A,C>权值:7
     */
    @Test
    public void createGraph() {
        //测试看看图是否创建ok
        char[] data = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int verxs = data.length;
        //邻接矩阵的关系使用二维数组表示
        int[][] weight = new int[][]{
                {10000, 5, 7, 10000, 10000, 10000, 2},
                {5, 10000, 10000, 9, 10000, 10000, 3},
                {7, 10000, 10000, 10000, 8, 10000, 10000},
                {10000, 9, 10000, 10000, 10000, 4, 10000},
                {10000, 10000, 8, 10000, 10000, 5, 4},
                {1000, 10000, 10000, 4, 5, 10000, 6},
                {2, 3, 10000, 10000, 4, 6, 10000}
        };
        MGraph mGraph = new MGraph(verxs);

        MinTree minTree = new MinTree();
        minTree.createGraph(mGraph, verxs, data, weight);
        minTree.showGraph(mGraph);

        minTree.prim(mGraph,0);
    }

}