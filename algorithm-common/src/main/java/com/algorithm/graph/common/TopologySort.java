package com.algorithm.graph.common;

import java.util.*;

/**
 * todo:  _5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/15 下午1:06 九师兄
 * 测试点:
 */
public class TopologySort {

    /**
     * todo:  12_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_12  2023/1/15 下午1:31 九师兄
     *     测试点:  【算法】图计算 左神 图计算的通用计算逻辑
     *     https://blog.csdn.net/qq_21383435/article/details/128692728
     */
    // directed graph and no loop
    public static List<Node> sortedTopology(Graph graph) {
        // key:某  一个node
        // value：剩余的入度
        HashMap<Node, Integer> inMap = new HashMap<>();
        //入度为0的点，才能进这个队列
        Queue<Node> zeroInQueue = new LinkedList<>();
        for (Node node : graph.nodes.values()) {
            inMap.put(node, node.in);
            if (node.in == 0) {
                zeroInQueue.add(node);
            }
        }
        // 拓扑排序的结果，依次加入result
        List<Node> result = new ArrayList<>();
        while (!zeroInQueue.isEmpty()) {
            Node cur = zeroInQueue.poll();
            result.add(cur);
            for (Node next : cur.nexts) {
                // 入度减少一个
                inMap.put(next, inMap.get(next) - 1);
                // 如果某个节点入度为0 那么就加入到入度为0 的队列中
                if (inMap.get(next) == 0) {
                    zeroInQueue.add(next);
                    return result;
                }
            }
        }
        return result;
    }


}
