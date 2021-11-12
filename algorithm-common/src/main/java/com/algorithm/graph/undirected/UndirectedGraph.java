package com.algorithm.graph.undirected;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-09 22:40
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class UndirectedGraph {

    private ArrayList<String> vertexList; //存储顶点集合
    private int[][] edges; //存 储图对应的邻结矩阵
    private int numOfEdges; //表示边 的数目

    /**
     * 测试点：测试构建一个图
     *
     * [0, 1, 1, 0, 0]
     * [1, 0, 1, 1, 1]
     * [1, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n =5;
        String Vertexs[] = {"A","B","C","D","E"};
        UndirectedGraph undirectedGraph = new UndirectedGraph(n);
        for (String vertex :Vertexs){
            undirectedGraph.insertVertex(vertex);
        }

        undirectedGraph.insertEdge(0,1,1);
        undirectedGraph.insertEdge(0,2,1);
        undirectedGraph.insertEdge(1,2,1);
        undirectedGraph.insertEdge(1,3,1);
        undirectedGraph.insertEdge(1,4,1);

        undirectedGraph.showGraph();
    }



    //构造器
    public UndirectedGraph(int n) {
        //初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
    }

    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    //i)↑i
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    //图中常用的方法
    //返回结点的个数
    public int getNumOfVertex() {
        return vertexList.size();
    }

    //显示图对应的矩阵
    public void showGraph() {
        for (int[] link : edges) {
            System.err.println(Arrays.toString(link));
        }
    }

    //得到边的数目
    public int getNumOfEdges() {
        return numOfEdges;
    }

}
