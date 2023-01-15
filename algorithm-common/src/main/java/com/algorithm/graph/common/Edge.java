package com.algorithm.graph.common;

public class Edge {
    // 权重
    public int weight;
    // 起始点
    public Node from;
    public Node to;// 结束点

    public Edge(int weight, Node from, Node to) {
        this.weight = weight;
        this.from = from;
        this.to = to;
    }
}