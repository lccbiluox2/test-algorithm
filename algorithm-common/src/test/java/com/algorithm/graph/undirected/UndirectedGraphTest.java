package com.algorithm.graph.undirected;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-17 23:04
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class UndirectedGraphTest {

    /**
     * 测试点：测试邻接矩阵的打印
     * 测试点：测试构建一个图
     * <p>
     * [0, 1, 1, 0, 0]
     * [1, 0, 1, 1, 1]
     * [1, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     *
     */
    @Test
    public void main() {
        // TODO Auto-generated method stub
        int n = 5;
        String Vertexs[] = {"A", "B", "C", "D", "E"};
        UndirectedGraph undirectedGraph = new UndirectedGraph(n);
        for (String vertex : Vertexs) {
            undirectedGraph.insertVertex(vertex);
        }

        undirectedGraph.insertEdge(0, 1, 1);
        undirectedGraph.insertEdge(0, 2, 1);
        undirectedGraph.insertEdge(1, 2, 1);
        undirectedGraph.insertEdge(1, 3, 1);
        undirectedGraph.insertEdge(1, 4, 1);

        undirectedGraph.showGraph();
    }


    /**
     * 测试点：测试图的深度遍历
     *
     * [0, 1, 1, 0, 0]
     * [1, 0, 1, 1, 1]
     * [1, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     *
     * 运行结果 A->B->C->D->E->
     */
    @Test
    public void dfsTest() {
        // TODO Auto-generated method stub
        int n = 5;
        String Vertexs[] = {"A", "B", "C", "D", "E"};
        UndirectedGraph undirectedGraph = new UndirectedGraph(n);
        for (String vertex : Vertexs) {
            undirectedGraph.insertVertex(vertex);
        }

        undirectedGraph.insertEdge(0, 1, 1);
        undirectedGraph.insertEdge(0, 2, 1);
        undirectedGraph.insertEdge(1, 2, 1);
        undirectedGraph.insertEdge(1, 3, 1);
        undirectedGraph.insertEdge(1, 4, 1);

        undirectedGraph.showGraph();
        undirectedGraph.dfs();
    }

    /**
     * 测试点：测试图的广度遍历
     *
     * [0, 1, 1, 0, 0]
     * [1, 0, 1, 1, 1]
     * [1, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     * [0, 1, 0, 0, 0]
     * A=>B=>C=>D=>E=>
     *
     * @throws InterruptedException
     */
    @Test
    public void bfsTest () throws InterruptedException {
        // TODO Auto-generated method stub
        int n = 5;
        String Vertexs[] = {"A", "B", "C", "D", "E"};
        UndirectedGraph undirectedGraph = new UndirectedGraph(n);
        for (String vertex : Vertexs) {
            undirectedGraph.insertVertex(vertex);
        }

        undirectedGraph.insertEdge(0, 1, 1);
        undirectedGraph.insertEdge(0, 2, 1);
        undirectedGraph.insertEdge(1, 2, 1);
        undirectedGraph.insertEdge(1, 3, 1);
        undirectedGraph.insertEdge(1, 4, 1);

        undirectedGraph.showGraph();
        Thread.sleep(10);
        undirectedGraph.bfs();
    }


    /**
     * 深度优先遍历
     *
     * 1->2->4->8->5->3->6->7->
     *
     * @throws InterruptedException
     */
    @Test
    public void dfsTest1 () throws InterruptedException {
        // TODO Auto-generated method stub
        int n = 8;
        String Vertexs[] = {"1", "2", "3", "4", "5","6","7","8"};
        UndirectedGraph undirectedGraph = new UndirectedGraph(n);
        for (String vertex : Vertexs) {
            undirectedGraph.insertVertex(vertex);
        }

        undirectedGraph.insertEdge(0, 1, 1);
        undirectedGraph.insertEdge(0, 2, 1);
        undirectedGraph.insertEdge(1, 3, 1);
        undirectedGraph.insertEdge(1, 4, 1);
        undirectedGraph.insertEdge(3, 7, 1);
        undirectedGraph.insertEdge(4, 7, 1);
        undirectedGraph.insertEdge(2, 5, 1);
        undirectedGraph.insertEdge(2, 6, 1);
        undirectedGraph.insertEdge(5, 6, 1);

        undirectedGraph.showGraph();
        Thread.sleep(10);
        undirectedGraph.dfs();
    }

    /**
     * 广度优先遍历
     *
     * 1=>2=>3=>4=>5=>6=>7=>8=>
     *
     * @throws InterruptedException
     */
    @Test
    public void bfsTest1 () throws InterruptedException {
        // TODO Auto-generated method stub
        int n = 8;
        String Vertexs[] = {"1", "2", "3", "4", "5","6","7","8"};
        UndirectedGraph undirectedGraph = new UndirectedGraph(n);
        for (String vertex : Vertexs) {
            undirectedGraph.insertVertex(vertex);
        }

        undirectedGraph.insertEdge(0, 1, 1);
        undirectedGraph.insertEdge(0, 2, 1);
        undirectedGraph.insertEdge(1, 3, 1);
        undirectedGraph.insertEdge(1, 4, 1);
        undirectedGraph.insertEdge(3, 7, 1);
        undirectedGraph.insertEdge(4, 7, 1);
        undirectedGraph.insertEdge(2, 5, 1);
        undirectedGraph.insertEdge(2, 6, 1);
        undirectedGraph.insertEdge(5, 6, 1);

        undirectedGraph.showGraph();
        Thread.sleep(10);
        undirectedGraph.bfs();
    }
}