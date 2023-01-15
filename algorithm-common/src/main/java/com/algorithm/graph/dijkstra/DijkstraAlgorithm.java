package com.algorithm.graph.dijkstra;

import java.util.Arrays;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-21 15:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * 【算法】迪杰斯特拉算法 最短路径算法
 * https://blog.csdn.net/qq_21383435/article/details/121453260
 */
public class DijkstraAlgorithm {


    //迪杰斯特拉算法实现


}

class Graph {
    private char[] vertex; //IF Al3H
    private int[][] matrix; // 邻接矩阵
    // 已经访问的定点的集合
    private VisitedVertex vv;

    //构造器
    public Graph(char[] vertex, int[][] matrix) {
        this.vertex = vertex;
        this.matrix = matrix;
    }

    //显示图
    public void showGraph() {
        for (int[] link : matrix) {
            System.out.println(Arrays.toString(link));
        }
    }

    /**
     * @param index 表示出发顶点对应的下标
     */
    public void dsj(int index) {
        vv = new VisitedVertex(vertex.length, index);
        update(index);//更新index顶点到周围顶点的距离和前驱顶点
        for (int j = 1; j < vertex.length; j++) {
            index = vv.updateArr();//选择并返回新的访问项点
            update(index); //更新index顶点到周围顶点的距离和前驱顶点
        }
    }

    //更新index下标顶点到周围顶点的距离和周围顶点的前驱顶点，
    private void update(int index) {
        int len = 0;
        //根据遍历我们的邻接矩阵的matrix[index]行
        for (int j = 0; j < matrix[index].length; j++) {
            // len含义是:出发顶点到index顶点的距离+从index顶 点到j顶点的距离的和
            len = vv.getDis(index) + matrix[index][j];
            //如果j顶点没有被访问过，并且len小于出发顶点到j项点的距离，就需要更新
            if (!vv.in(j) && len < vv.getDis(j)) {
                vv.updatePre(j, index);
                vv.updateDis(j, len);
            }
        }
    }

    public void showDijkstra() {
        vv.show();
    }

}

//已访问顶点集合
class VisitedVertex {
    //记录各个顶点是否访问过1表示访问过, 0未访问,会动态更新
    public int[] alreadyarr;
    //每个下标对应的值为前一个顶点下标，会动态更新
    public int[] pre_visited;
    //记录出发顶点到其他所有顶点的距离,比如G为出发顶点,就会记录G到其它项点的距离，会动态更新，求的最短距离就会存放到dis
    public int[] dis;


    /**
     * @param length :表示顶 点的个数
     * @param index: 出发顶点对应的下标，比如G顶点，下标就是6
     */
    public VisitedVertex(int length, int index) {
        this.alreadyarr = new int[length];
        this.pre_visited = new int[length];
        this.dis = new int[length];
        //初始化dis数组
        Arrays.fill(dis, 65535);
        alreadyarr[index] = 1;
        this.dis[index] = 0;//设 置出发顶点的访问距离为0
    }

    /**
     * 功能:判断index顶点是否被访问过
     * ※@param index
     *
     * @return 如果访问过，就返回
     */
    public boolean in(int index) {
        return alreadyarr[index] == 1;
    }


    /**
     * 功能:更新出发顶点到index顶点的距离
     *
     * @param index
     * @param len
     */
    public void updateDis(int index, int len) {
        dis[index] = len;
    }

    /**
     * 功能:更新pre这个顶点的前驱顶点为index顶点
     *
     * @param pre
     * @param index
     */
    public void updatePre(int pre, int index) {
        pre_visited[pre] = index;
    }

    /**
     * 返回出发顶点到Index顶点的距离
     *
     * @param index
     */
    public int getDis(int index) {
        return dis[index];
    }

    /**
     * 继续选择并返回新的访问顶点，比如这里的G完后，就是点作为新的访问顶点(注意不是出发顶点)
     *
     * @return
     */
    public int updateArr() {
        int min = 65535, index = 0;
        for (int i = 0; i < alreadyarr.length; i++) {
            if (alreadyarr[i] == 0 && dis[i] < min) {
                min = dis[i];
                index = i;
            }

        }
        //更新index顶点被访问过
        alreadyarr[index] = 1;
        return index;
    }

    //即将三个数组的情况输出
    public void show() {
        System.out.println("=ssz=");
        //Walready_ arr
        for (int i : alreadyarr) {
            System.out.print(i + " ");
        }
        System.out.println();
        //îWpre_ visited
        for (int i : pre_visited) {
            System.out.print(i + " ");
        }
        System.out.println();
        //dis
        for (int i : dis) {
            System.out.print(i + " ");
        }

        System.out.println();

        //为了好看最后的最短距离，我们处理
        char[] vertex = {'A', 'B', 'C', 'D', 'E', 'F', 'G'};
        int count = 0;
        for (int i : dis) {
            if (i != 65535) {
                System.out.print(vertex[count] + "(" + i + ")");
            } else {
                System.out.println("N ");
            }
            count++;
        }
        System.out.println();
    }


}