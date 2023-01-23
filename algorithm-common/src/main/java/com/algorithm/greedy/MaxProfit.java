package com.algorithm.greedy;

import java.util.Comparator;
import java.util.PriorityQueue;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/23 上午10:05 4 九师兄
 *     【算法】最优项目、规划项目赚钱、最大利润
 *     https://blog.csdn.net/qq_21383435/article/details/128751512
 */
public class MaxProfit {

    private class Node {
        private int c;// 花费
        private int p;// 利润

        public Node(int c, int p) {
            this.c = c;
            this.p = p;
        }
    }

    private class MinCostComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o1.c - o2.c;
        }
    }

    private class MaxProfitComparator implements Comparator<Node> {

        @Override
        public int compare(Node o1, Node o2) {
            return o1.p - o2.p;
        }
    }

    public int findMaximizedCapital(int k, int W, int[] Profits, int[] Capital) {
        PriorityQueue<Node> minCostQ = new PriorityQueue<>(new MinCostComparator());
        PriorityQueue<Node> maxProfitQ = new PriorityQueue<>(new MaxProfitComparator());
        for (int i = 0; i < Profits.length; i++) {
            minCostQ.add(new Node(Profits[i], Capital[i]));
        }
        for (int i = 0; i < k; i++) {//进行K轮
            //能力所及的项目，全解锁
            while (!minCostQ.isEmpty() && minCostQ.peek().c <= W) {
                maxProfitQ.add(minCostQ.poll());
            }
            if (maxProfitQ.isEmpty()) {
                return W;
            }
            W += maxProfitQ.poll().p;
        }
        return W;
    }

}
