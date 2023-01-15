package com.algorithm.graph.prim;

import com.algorithm.graph.common.Edge;
import com.algorithm.graph.common.Graph;
import com.algorithm.graph.common.Node;

import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/***
 * todo: 13_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_13  2023/1/15 下午5:00 13 九师兄
 * 【算法】普里姆算法 Prim算法解决修路问题
 * https://blog.csdn.net/qq_21383435/article/details/121315739
 */
public class PrimAlgorithmV2 {

    private static class EdgeComparator implements Comparator<Edge> {

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.weight - o2.weight;
        }
    }

    public static Set<Edge> primMST(Graph graph) {
        //解锁的边进入小根堆
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeComparator());
        HashSet<Node> set = new HashSet<>();
        Set<Edge> result = new HashSet<>();//依次挑选的的边在result里
        for (Node node : graph.nodes.values()) {//随便挑了一个点
            //1 node
            if (!set.contains(node)) {
                set.add(node);
                for (Edge edge : node.edges) {// 由一个点，解锁所有相连的边
                    priorityQueue.add(edge);
                }
                while (!priorityQueue.isEmpty()) {
                    Edge edge = priorityQueue.poll();//弹出解锁的边中，最小的边
                    Node toNode = edge.to;//可能的--个新的点
                    if (!set.contains(toNode)) { //不含有的时候，就是新的点
                        set.add(toNode);
                        result.add(edge);
                        for (Edge nextEdge : toNode.edges) {
                            priorityQueue.add(nextEdge);
                        }
                    }
                }
            }

        }
        return result;
    }

}
