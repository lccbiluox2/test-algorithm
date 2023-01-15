package com.algorithm.graph.common;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import static org.junit.Assert.*;

public class TopologySortTest {

    @Test
    public void sortedTopology() {
        Graph graph = new Graph();

        Map<Integer, Node> nodes = new HashMap<>();
        nodes.put(1, new Node(1));
        nodes.put(2, new Node(2));
        nodes.put(3, new Node(3));
        nodes.put(4, new Node(4));
        Queue<Edge> edges = new ArrayDeque<>();

        graph.edges = edges;
        graph.nodes = nodes;
    }
}