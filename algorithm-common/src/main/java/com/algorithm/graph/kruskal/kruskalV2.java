package com.algorithm.graph.kruskal;


import com.algorithm.graph.common.Edge;
import com.algorithm.graph.common.Graph;
import com.algorithm.graph.common.Node;

import java.util.*;

/**
 * todo:  11_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_11  2023/1/15 下午4:40 九师兄
 *     测试点: 【算法】K 算法 && 克鲁斯卡尔算法
 *     https://blog.csdn.net/qq_21383435/article/details/128694039
 */
public class kruskalV2 {

    public static class MySets {

        public HashMap<Node, List<Node>> setMap;

        public MySets(List<Node> nodes) {
            for (Node cur : nodes) {
                List<Node> set = new ArrayList<Node>();
                set.add(cur);
                setMap.put(cur, set);
            }
        }

        public boolean isSameSet(Node from, Node to) {
            List<Node> fromSet = setMap.get(from);
            List<Node> toSet = setMap.get(to);
            return fromSet == toSet;
        }

        public void union(Node from, Node to) {
            List<Node> fromSet = setMap.get(from);
            List<Node> toSet = setMap.get(to);
            for (Node toNode : toSet) {
                fromSet.add(toNode);
                setMap.put(toNode, fromSet);
            }
        }
    }


    private static class UnionFind {

        public HashMap<Node, List<Node>> setMap;

        public void makeSets(Collection<Node> nodes) {
            for (Node cur : nodes) {
                List<Node> set = new ArrayList<Node>();
                set.add(cur);
                setMap.put(cur, set);
            }
        }

        public boolean isSameSet(Node from, Node to) {
            List<Node> fromSet = setMap.get(from);
            List<Node> toSet = setMap.get(to);
            return fromSet == toSet;
        }

        public void union(Node from, Node to) {
            List<Node> fromSet = setMap.get(from);
            List<Node> toSet = setMap.get(to);
            for (Node toNode : toSet) {
                fromSet.add(toNode);
                setMap.put(toNode, fromSet);
            }
        }
    }

    private static class EdgeComparator implements Comparator<Edge> {

        @Override
        public int compare(Edge o1, Edge o2) {
            return o1.weight - o2.weight;
        }
    }


    public static Set<Edge> kruskalMST(Graph graph) {
        // 生成并查集结构
        UnionFind unionFind = new UnionFind();
        unionFind.makeSets(graph.nodes.values());
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(new EdgeComparator());
        for (Edge edge : graph.edges) {//M 条边
            priorityQueue.add(edge);// 0(10gM)
        }
        Set<Edge> result = new HashSet<>();
        while (!priorityQueue.isEmpty()) { // M *i
            Edge edge = priorityQueue.poll(); // 0(10gM)
            if (!unionFind.isSameSet(edge.from, edge.to)) { // 0(1)
                result.add(edge);
                unionFind.union(edge.from, edge.to);
            }

        }
        return result;
    }
}
