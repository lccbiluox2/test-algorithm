package com.algorithm.graph.kruskal;

import com.sun.xml.internal.bind.v2.TODO;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-16 22:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 克鲁斯卡尔算法
 *
 * https://blog.csdn.net/qq_21383435/article/details/121366337
 */
public class Kruskal {

    private int edgeNum; //
    private char[] vertexs; //]5 5äH
    private int[][] matrix; //邻接矩阵
    //使用INF表示两个顶点不能连通
    private static final int INF = Integer.MAX_VALUE;

    //构造器
    public Kruskal(char[] vertexs, int[][] matrix) {
        //初始化顶点数和边的个数
        int vlen = vertexs.length;
        //初始化顶点
        this.vertexs = new char[vlen];
        for (int i = 0; i < vertexs.length; i++) {
            this.vertexs[i] = vertexs[i];
        }

        // 初始化边
        this.matrix = new int[vlen][vlen];
        for (int i = 0; i < vlen; i++) {
            for (int j = 0; j < vlen; j++) {
                this.matrix[i][j] = matrix[i][j];
            }
        }

        // 统计边
        //3iti
        for (int i = 0; i < vlen; i++) {
            // 这里 i+1 是自己不与自己连接
            for (int j = i + 1; j < vlen; j++) {
                if (this.matrix[i][j] != INF) {
                    edgeNum++;
                }
            }
        }
    }

    //显示图对应的矩阵
    public void showGraph() {
        System.out.println("邻接矩阵为：");
        for (int i = 0; i < vertexs.length; i++) {
            for (int j = 0; j < vertexs.length; j++) {
                System.out.printf("%12d\t", matrix[i][j]);
            }
            System.out.println();
        }

    }

    /**
     * 功能:对边进行排序处理，冒泡排序
     *
     * @param edges 边的集合
     */
    public void sortEdges(EData[] edges) {
        for (int i = 0; i < edges.length - 1; i++) {
            for (int j = 0; j < edges.length - 1 - i; j++) {
                if (edges[j].weight > edges[j + 1].weight) {//交换
                    EData tmp = edges[j];
                    edges[j] = edges[j + 1];
                    edges[j + 1] = tmp;
                }
            }
        }

    }

    /**
     * @param ch 顶点的值，比如'A','B'
     * @return 返回ch顶点对应的下标，如果找不到，返回-1
     */
    public int getPosition(char ch) {
        for (int i = 0; i < vertexs.length; i++) {
            if (vertexs[i] == ch) {//找到
                return i;
            }
        }
        //找不到,返回-1
        return -1;
    }


    /**
     * 功能:获取图中边，放到EData[]数组中， 后面我们需要遍历该数组
     * 是通过matrix邻接矩阵来获职
     * EData[] 形式[['A','B', 12], ['B','F',7], .....]
     *
     * @return
     */
    public EData[] getEdges() {
        int index = 0;
        EData[] edges = new EData[edgeNum];
        for (int i = 0; i < vertexs.length; i++) {
            for (int j = i + 1; j < vertexs.length; j++) {
                if (matrix[i][j] != INF) {
                    edges[index++] = new EData(vertexs[i], vertexs[j], matrix[i][j]);
                }
            }

        }
        return edges;
    }

    /**
     * 功能:获取下标为i的顶点的终点()，用于后面判断两个顶点的终点是否相同
     *
     * @param ends :数组就是记录了各个顶点对应的终点是哪个,ends数组是在遍历过程中，逐步形成
     * @param i    :表示传入的顶点对应的下标
     * @return返回的就是下标为i的这个顶点对应的终点的下标
     */
    private int getEnd(int[] ends, int i) {
        while (ends[i] != 0) {
            i = ends[i];
        }
        return i;
    }

    public void kruskal() {
        int index = 0;//表示最后结果数组的索引
        int[] ends = new int[edgeNum]; //用于 保存"已有最小生成树"中的每个顶点在最小生成树中的终点
        //创建结果数组，保存最后的最小生成树
        EData[] rets = new EData[edgeNum];
        //获取图中所有的边的集合，- 共有12边
        EData[] edges = getEdges();

        System.out.println("图的边的集合=" + Arrays.toString(edges) + "共" + edges.length); //12
        //按照边的权值大小进行排序(从小到大)
        sortEdges(edges);

        //遍历edges数组，将边添加到最小生成树中时，判断是准备加入的边否形成了回路，如果没有，就加入rets,否则不能加入
        for (int i = 0; i < edgeNum; i++) {
            //获取到第i条边的第一个顶点(起点)
            int p1 = getPosition(edges[i].start);
            //获取到第i条边的第2个顶点
            int p2 = getPosition(edges[i].end);
            //获取p1这个顶点在已有最小生成树中的终点
            int m = getEnd(ends, p1);
            //获取p2这个顶点在已有最小生成树中的终点
            int n = getEnd(ends, p2);
            //是否构成回路
            if (m != n) { //没有构成回路
                ends[m] = n; //设置m在"已有最小生成树"中的终点<E,F> [0,0,0,0,0,0,0,0,0,0,0,0]
                rets[index++] = edges[i];
            }
        }
        //统计并打印"最小生成树"，输出rets
        System.out.println("最小生成树");
        for (int i = 0; i < index; i++) {
            System.out.println(rets[i]);
        }

    }
}

//创建一个类EData,它的对象实例就表示一条边
class EData {
    char start; //边的一个点
    char end; //边的另外一个点
    int weight; //边的权值

    public EData(char start, char end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "EData{" +
                "start=" + start +
                ", end=" + end +
                ", weight=" + weight +
                '}';
    }
}