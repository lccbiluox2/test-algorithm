package com.algorithm.graph.common;

public class GraphGenerator {

    // matrix 所有的边
    // N*3
    // [weight， from节点上面的值，to节点上面的值〕
    public static Graph createGraph(Integer[][] matrix) {
        Graph graph = new Graph();
        for (int i = 0; i < matrix.length; i++) {
            Integer from = matrix[i][0];
            Integer to = matrix[i][1];
            Integer weight = matrix[i][2];
            //  第一次遇到这个城市
            if (!graph.nodes.containsKey(from)) {
                graph.nodes.put(from, new Node(from));
            }
            // 第一次遇到目标城市
            if (!graph.nodes.containsKey(to)) {
                graph.nodes.put(to, new Node(to));
            }
            Node fromNode = graph.nodes.get(from);
            Node toNode = graph.nodes.get(to);

            // 建立边信息
            Edge newEdge = new Edge(weight, fromNode, toNode);

            // 边是从from -> to
            fromNode.nexts.add(toNode);
            // from 节点的出度 加1
            fromNode.out++;
            toNode.in++;// to 节点的入度 加1

            // from 边集合 加入新的边
            fromNode.edges.add(newEdge);
            graph.edges.add(newEdge);

        }
        return graph;
    }
}