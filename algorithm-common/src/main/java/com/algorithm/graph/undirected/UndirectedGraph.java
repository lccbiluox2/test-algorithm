package com.algorithm.graph.undirected;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

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
    private boolean[] isVisited;


    //构造器
    public UndirectedGraph(int n) {
        //初始化矩阵和vertexList
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
        isVisited = new boolean[n];
    }

    //返回结点i(下标)对应的数据0->"A" 1->"B" 2->"C"
    public String getValueByIndex(int i) {
        return vertexList.get(i);
    }

    // 获取v1和v2的权重
    public int getWeight(int v1, int v2) {
        return edges[v1][v2];
    }

    //返回v1和v2的权值

    public void insertVertex(String vertex) {
        vertexList.add(vertex);
    }

    /**
     * @param v1     表示点的下标 A-B的关系
     * @param v2     表示点的下标
     * @param weight
     */
    public void insertEdge(int v1, int v2, int weight) {
        edges[v1][v2] = weight;
        // 因为是无向图，所以反着也要来一下
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

    //得到第-一个邻接结点的下标W

    /**
     * @param index k
     * @return如果存在就返回对应的下标，否则返回-1
     */
    public int getFirstNeighbor(int index) {
        for (int j = 0; j < vertexList.size(); j++) {
            // 因为默认值为0，所有如果后续有数据 证明这个节点是能直接联通的
            if (edges[index][j] > 0) {
                return j;
            }
        }
        return - -1;
    }

    /**
     * A  B  C  D  E
     * A [0, 1, 1, 0, 0]
     * B [1, 0, 1, 1, 1]
     * C [1, 1, 0, 0, 0]
     * D [0, 1, 0, 0, 0]
     * E [0, 1, 0, 0, 0]
     * <p>
     * 假设现在的节点v1=0 v2=1 代表 A-B直接连接
     * 那么 j=v2+1 = 2  现在直接是（0，2）A-C 直接连接了
     *
     * @param v1
     * @param v2
     * @return
     */
    //根据前一个邻接结点的下标来获取下一个邻接结点
    public int getNextNeighbor(int v1, int v2) {
        for (int j = v2 + 1; j < vertexList.size(); j++) {
            if (edges[v1][j] > 0) {
                return j;
            }
        }
        return -1;
    }

    //深度优先遍历算法
    //i第一次就是0
    public void dfs(boolean[] isVisited, int i) {
        //首先我们访问该结点，输出
        System.out.print(getValueByIndex(i) + "->");
        //将结点设置为已经访问
        isVisited[i] = true;
        //查找结点i的第一个邻接结点W
        int W = getFirstNeighbor(i);
        while (W != -1) {//说明有
            if (!isVisited[W]) {
                dfs(isVisited, W);
            }
            //如果w结点已经被访问过
            W = getNextNeighbor(i, W);
        }
    }

    //对dfs进行一个重载，遍历我们所有的结点，并进行dfs.
    public void dfs() {
        //遍历所有的结点，进行dfs[回溯]
        for (int i = 0; i < getNumOfVertex(); i++) {
            if (!isVisited[i]) {
                dfs(isVisited, i);
            }
        }
    }


    //对一个结点进行广度优先遍历的方法
    private void bfs(boolean[] isVisited, int i) {
        int u; //表示队列的头结点对应下标
        int w; //邻接结点w
        //队列，记录结点访问的顺序
        LinkedList queue = new LinkedList();
        //访问结点，输出结点信息
        System.out.print(getValueByIndex(i) + "=>");
        //标记为已访问
        isVisited[i] = true;
        //将结点加入队列
        queue.addLast(i);
        while (!queue.isEmpty()) {
            //取出队列的头结点下标
            u = (Integer) queue.removeFirst();
            w = getFirstNeighbor(u);
            while (w != -1) {
                // 是否被访问过
                if (!isVisited[w]) {
                    System.out.print(getValueByIndex(w) + "=>");
                    // 标记已经访问了
                    isVisited[w] = true;
                    // 加入队列
                    queue.addLast(w);
                }
                // 如果已经访问过了
                w = getNextNeighbor(u, w);
            }
        }
    }

    /**
     * 广度优先遍历
     */
    public void bfs() {
        for (int i = 0; i < getNumOfVertex(); i++) {
            if(!isVisited[i]){
                bfs(isVisited,i);
            }
        }
    }
}
