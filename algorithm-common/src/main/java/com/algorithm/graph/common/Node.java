package com.algorithm.graph.common;

import java.util.ArrayList;

public class Node {
    // 当前节点值
    public int value;
    // 节点的入度
    public int in;
    // 节点的出度
    public int out;
    // 该节点指向的节点
    public ArrayList<Node> nexts;
    // 该节点关联的边
    public ArrayList<Edge> edges;

    public Node(int value) {
        this.value = value;
        in = 0;
        out =  0;
        nexts =   new ArrayList<>();
        edges = new ArrayList<>();
    }

}
