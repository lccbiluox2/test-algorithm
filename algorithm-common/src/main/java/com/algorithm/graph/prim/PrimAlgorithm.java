package com.algorithm.graph.prim;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-15 22:29
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PrimAlgorithm {


}

class MinTree {

    /**
     * @param graph  图対象
     * @param verxs  图対立的頂点个数
     * @param data   图的各个頂点的値
     * @param weight 图的郤接矩降
     */
    public void createGraph(MGraph graph, int verxs, char data[], int[][] weight) {
        int i, j;
        for (i = 0; i < verxs; i++) {//頂点
            graph.data[i] = data[i];
            for (j = 0; j < verxs; j++) {
                graph.weight[i][j] = weight[i][j];
            }
        }
    }

    //显示图的邻接矩阵
    public void showGraph(MGraph graph) {
        for (int[] link : graph.weight) {
            System.out.println(Arrays.toString(link));
        }
    }


    public void prim(MGraph graph, int v) {
        //visited[]标记结点(顶点)是否被访问过
        int visited[] = new int[graph.verxs];
        //visited[]默认元素的值都是0,表示没有访问过
        //
//        for(int i =0; i <graph.verxs; i++) {
///
//            visited[i] = 0;
//
        //把当前这个结点标记为已访问
        visited[v] = 1;
        //h1和h2记录两个顶点的下标
        int h1 = -1;
        int h2 = -1;
        int minWeight = 10000; //将 minWeight初始成-一个大数，后面在遍历过程中，会被替换
        for (int k = 1; k < graph.verxs; k++) {//因为有 graph. verxs顶点，普利姆算法结束后，有graph.verxs-1边
            for (int i = 0; i < graph.verxs; i++) {
                for (int j = 0; j < graph.verxs; j++) {
                    if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
                        //替换minWeight
                        minWeight = graph.weight[i][j];
                        h1=i;
                        h2=j;
                    }
                }
            }
            //找到一条边是最小
            System.out.println("边<" + graph.data[h1] + "," + graph.data[h2] + ">权值:" + minWeight);
            //将当前这个结点标记为已经访问
            visited[h2] = 1;
            minWeight = 10000;
        }

    }

    public void prim2(MGraph graph, int v) {
        //visited[]标记结点(顶点)是否被访问过
        int visited[] = new int[graph.verxs];
        //visited[]默认元素的值都是0,表示没有访问过
        //
//        for(int i =0; i <graph.verxs; i++) {
///
//            visited[i] = 0;
//
        //把当前这个结点标记为已访问
        visited[v] = 1;
        //h1和h2记录两个顶点的下标
        int h1 = -1;
        int h2 = -1;
        int minWeight = 10000; //将 minWeight初始成-一个大数，后面在遍历过程中，会被替换
        for (int k = 1; k < graph.verxs; k++) {//因为有 graph. verxs顶点，普利姆算法结束后，有graph.verxs-1边
            for (int i = 0; i < graph.verxs; i++) {
                for (int j = 0; j < graph.verxs; j++) {
                    if (visited[i] == 1 && visited[j] == 0 && graph.weight[i][j] < minWeight) {
                        //替换minWeight
                        minWeight = graph.weight[i][j];
                        h1=i;
                        h2=j;
                    }
                }
            }
            //找到一条边是最小
            System.out.println("边<" + graph.data[h1] + "," + graph.data[h2] + ">权值:" + minWeight);
            //将当前这个结点标记为已经访问
            visited[h2] = 1;
            minWeight = 10000;
        }

    }
}

class MGraph {
    int verxs; //表示图的节点个数
    char[] data;//存 放结点数据
    int[][] weight; //存放边，就是我们的邻接矩阵

    public MGraph(int verxs) {
        this.verxs = verxs;
        data = new char[verxs];
        weight = new int[verxs][verxs];
    }
}