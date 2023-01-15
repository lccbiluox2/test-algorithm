package com.algorithm.graph.dijkstra;

import com.algorithm.graph.common.Edge;
import com.algorithm.graph.common.Node;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class DijkstraAlgorithmV2 {

    public static HashMap<Node, Integer> dijkstra1(Node head) {
        //从head出发到所有点的最小距离
        // key：从head出发到达key
        // value： 从head出发到达key的最小距离
        // 如果在表中，没有下的记录，含义是从head出发到T这个点的距离为正无穷
        HashMap<Node, Integer> distanceMap = new HashMap<>();
        distanceMap.put(head, 0);
        HashSet<Node> selectedNodes = new HashSet<>();
        Node minNode = getMinDistanceAndUnselectedNode(distanceMap, selectedNodes);
        while (minNode != null) {
            int distance = distanceMap.get(minNode);
            for (Edge edge : minNode.edges) {
                Node toNode = edge.to;
                // 节点没选过的
                if (!distanceMap.containsKey(toNode)) {
                    // 更新距离值
                    distanceMap.put(toNode, distance + edge.weight);
                }
                // 求出最小值
                distanceMap.put(edge.to, Math.min(distanceMap.get(toNode),
                        distance + edge.weight));
            }
            selectedNodes.add(minNode);
            minNode = getMinDistanceAndUnselectedNode(distanceMap, selectedNodes);
        }
        return distanceMap;
    }


    public static Node getMinDistanceAndUnselectedNode(
            HashMap<Node, Integer> distanceMap,
            HashSet<Node> touchedNodes) {
        Node minNode = null;
        int minDistance = Integer.MAX_VALUE;
        for (Map.Entry<Node, Integer> entry : distanceMap.entrySet()) {
            Node node = entry.getKey();
            int distance = entry.getValue();
            if (!touchedNodes.contains(node) && distance < minDistance) {
                minNode = node;
                minDistance = distance;
            }
        }
        return minNode;
    }

}