package com.algorithm.graph.kruskal;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-21 11:52
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class KruskalTest {

    private static final int INF = Integer.MAX_VALUE;

    /**
     * 测试点：测试邻接矩阵的打印
     * 邻接矩阵为：
     *            0	          12	  2147483647	  2147483647	  2147483647	          16	          14
     *           12	           0	          10	  2147483647	  2147483647	           7	  2147483647
     *   2147483647	          10	           0	           3	           5	           6	  2147483647
     *   2147483647	  2147483647	           3	           0	           4	  2147483647	  2147483647
     *   2147483647	  2147483647	           5	           4	           0	           2	           8
     *           16	           7	           6	  2147483647	           2	           0	           9
     *           14	  2147483647	  2147483647	  2147483647	           8	           9	           0
     *
     */
    @Test
    public void showGraph() {
        char[] vertexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int matrix[][] = {
                //       'A', 'B', 'C',  'D', 'E', 'F', 'G'
                /*' A'*/ {0, 12, INF, INF, INF, 16, 14},
                /* 'B'*/ {12, 0, 10, INF, INF, 7, INF},
                /* 'C'*/ {INF, 10, 0, 3, 5, 6, INF},
                /* 'D'*/ {INF, INF, 3, 0, 4, INF, INF},
                /* 'E'*/ {INF, INF, 5, 4, 0, 2, 8},
                /* 'F'*/ {16, 7, 6, INF, 2, 0, 9},
                /* 'G'*/ {14, INF, INF, INF, 8, 9, 0}

        };


        Kruskal kruskal = new Kruskal(vertexs,matrix);
        kruskal.showGraph();
    }

    /**
     * 测试点：测试打印edges
     * [EData{start=A, end=B, weight=12}, EData{start=A, end=F, weight=16}, EData{start=A, end=G, weight=14}, EData{start=B, end=C, weight=10}, EData{start=B, end=F, weight=7}, EData{start=C, end=D, weight=3}, EData{start=C, end=E, weight=5}, EData{start=C, end=F, weight=6}, EData{start=D, end=E, weight=4}, EData{start=E, end=F, weight=2}, EData{start=E, end=G, weight=8}, EData{start=F, end=G, weight=9}, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]
     * 这里有很多空
     *
     * 修改后，结果如下
     * [EData{start=A, end=B, weight=12}, EData{start=A, end=F, weight=16}, EData{start=A, end=G, weight=14}, EData{start=B, end=C, weight=10}, EData{start=B, end=F, weight=7}, EData{start=C, end=D, weight=3}, EData{start=C, end=E, weight=5}, EData{start=C, end=F, weight=6}, EData{start=D, end=E, weight=4}, EData{start=E, end=F, weight=2}, EData{start=E, end=G, weight=8}, EData{start=F, end=G, weight=9}]
     */
    @Test
    public void getEdgesTest() {
        char[] vertexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int matrix[][] = {
                //       'A', 'B', 'C',  'D', 'E', 'F', 'G'
                /*' A'*/ {0, 12, INF, INF, INF, 16, 14},
                /* 'B'*/ {12, 0, 10, INF, INF, 7, INF},
                /* 'C'*/ {INF, 10, 0, 3, 5, 6, INF},
                /* 'D'*/ {INF, INF, 3, 0, 4, INF, INF},
                /* 'E'*/ {INF, INF, 5, 4, 0, 2, 8},
                /* 'F'*/ {16, 7, 6, INF, 2, 0, 9},
                /* 'G'*/ {14, INF, INF, INF, 8, 9, 0}

        };


        Kruskal kruskal = new Kruskal(vertexs,matrix);
        kruskal.showGraph();
        System.out.println(Arrays.toString(kruskal.getEdges()));;
    }


    /**
     * 测试点：测试排序
     *
     * 排序前：[EData{start=A, end=B, weight=12}, EData{start=A, end=F, weight=16}, EData{start=A, end=G, weight=14}, EData{start=B, end=C, weight=10}, EData{start=B, end=F, weight=7}, EData{start=C, end=D, weight=3}, EData{start=C, end=E, weight=5}, EData{start=C, end=F, weight=6}, EData{start=D, end=E, weight=4}, EData{start=E, end=F, weight=2}, EData{start=E, end=G, weight=8}, EData{start=F, end=G, weight=9}]
     * 排序后：[EData{start=E, end=F, weight=2}, EData{start=C, end=D, weight=3}, EData{start=D, end=E, weight=4}, EData{start=C, end=E, weight=5}, EData{start=C, end=F, weight=6}, EData{start=B, end=F, weight=7}, EData{start=E, end=G, weight=8}, EData{start=F, end=G, weight=9}, EData{start=B, end=C, weight=10}, EData{start=A, end=B, weight=12}, EData{start=A, end=G, weight=14}, EData{start=A, end=F, weight=16}]
     */
    @Test
    public void sortEdgesTest() {
        char[] vertexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int matrix[][] = {
                //       'A', 'B', 'C',  'D', 'E', 'F', 'G'
                /*' A'*/ {0, 12, INF, INF, INF, 16, 14},
                /* 'B'*/ {12, 0, 10, INF, INF, 7, INF},
                /* 'C'*/ {INF, 10, 0, 3, 5, 6, INF},
                /* 'D'*/ {INF, INF, 3, 0, 4, INF, INF},
                /* 'E'*/ {INF, INF, 5, 4, 0, 2, 8},
                /* 'F'*/ {16, 7, 6, INF, 2, 0, 9},
                /* 'G'*/ {14, INF, INF, INF, 8, 9, 0}

        };


        Kruskal kruskal = new Kruskal(vertexs,matrix);
        kruskal.showGraph();


        EData[] edges = kruskal.getEdges();
        System.out.println("排序前："+Arrays.toString(edges));;

        kruskal.sortEdges(edges);

        System.out.println("排序后："+Arrays.toString(edges));
    }


    /**
     * 测试点：最小生成树如下
     *
     * 最小生成树
     * EData{start=E, end=F, weight=2}
     * EData{start=C, end=D, weight=3}
     * EData{start=D, end=E, weight=4}
     * EData{start=B, end=F, weight=7}
     * EData{start=E, end=G, weight=8}
     * EData{start=A, end=B, weight=12}
     *
     */
    @Test
    public void kruskalTest() {
        char[] vertexs = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int matrix[][] = {
                //       'A', 'B', 'C',  'D', 'E', 'F', 'G'
                /*' A'*/ {0, 12, INF, INF, INF, 16, 14},
                /* 'B'*/ {12, 0, 10, INF, INF, 7, INF},
                /* 'C'*/ {INF, 10, 0, 3, 5, 6, INF},
                /* 'D'*/ {INF, INF, 3, 0, 4, INF, INF},
                /* 'E'*/ {INF, INF, 5, 4, 0, 2, 8},
                /* 'F'*/ {16, 7, 6, INF, 2, 0, 9},
                /* 'G'*/ {14, INF, INF, INF, 8, 9, 0}

        };


        Kruskal kruskal = new Kruskal(vertexs,matrix);
        kruskal.showGraph();


        EData[] edges = kruskal.getEdges();
        System.out.println("排序前："+Arrays.toString(edges));;

        kruskal.sortEdges(edges);

        System.out.println("排序后："+Arrays.toString(edges));

        kruskal.kruskal();
    }


}