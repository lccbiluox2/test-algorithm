package com.algorithm.leetcode.swordoffer.offer63;

import com.algorithm.leetcode.swordoffer.offer24.Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-12 10:07
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 63. 股票的最大利润
 */
public class StockMaxValue {

    /**
     * 7,1,5,3,6,4
     * 4的最小值是 1
     * 6的最小值是1
     * 3
     * 5
     * 7
     * <p>
     * 7,1,5,3,6,4
     * min 1 1 1 1
     * max 5 5 6 6
     * <p>
     * 7,1,5,3,6,4
     * min 1 1 3 3 4 4
     * max   6 6 6 6 4
     * <p>
     * 7,6,4,3,1
     * min   6 4 3 1
     * max   6 6 6
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 1) {
            return 0;
        }
        // 只有一个元素的时候
        if (prices.length == 1) {
            return 0;
        }
        List<Integer> interval = new ArrayList<>();
        int length = prices.length - 1;
        for (int i = length; 0 < i; i--) {
            int currentData = prices[i];
            int preMin = getThisDataPreMin(i, currentData, prices);
            if (preMin < 0) {
                // 没找到比自己小的，那么说明买入的高卖出的低
                interval.add(0);
            } else {
                // 否则就是有小的
                int profits = currentData - preMin;
                interval.add(profits);
            }
        }
        Collections.sort(interval);
        return interval.get(interval.size() - 1);
    }

    private int getThisDataPreMin(int endIndex, int currentData, int[] prices) {
        int preMin = currentData;
        for (int i = 0; i < endIndex; i++) {
            if (prices[i] < preMin) {
                preMin = prices[i];
            }
        }
        if (preMin == currentData) {
            return -1;
        }
        return preMin;
    }


    public int maxProfit1(int prices[]) {
        int maxprofit = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > maxprofit) {
                    maxprofit = profit;
                }
            }
        }
        return maxprofit;
    }


    public int maxProfit2(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) {
                minprice = prices[i];
            } else if (prices[i] - minprice > maxprofit) {
                // 当前值 - 当前最小值（动态变化） 是否大于当前最大值（动态变化）
                maxprofit = prices[i] - minprice;
            }
        }
        return maxprofit;
    }

    /**
     * 动态规划
     */
    public int maxProfit3(int[] prices) {
        if (prices.length < 2) return 0; // 没有卖出的可能性
        // 定义状态，第i天卖出的最大收益
        int[] dp = new int[prices.length];
        dp[0] = 0;  // 初始边界
        int cost = prices[0]; // 成本
        for (int i = 1; i < prices.length; i++) {
            dp[i] = Math.max(dp[i - 1], prices[i] - cost);
            // 选择较小的成本买入
            cost = Math.min(cost, prices[i]);
        }

        return dp[prices.length - 1];
    }

    public int maxProfit4(int[] prices) {
        int n = prices.length;
        Stack<Integer> qp = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            // 将每个数据的最大值倒序压入站
            if (qp.empty() || prices[i] >= qp.peek()) {
                qp.push(prices[i]);
            }
        }
        int m = 0;
        for (int i = 0; i < n; i++) {
            // 如果栈顶的最大值 - 当前价值 取最大值
            m = Math.max(qp.peek() - prices[i], m);
            // 如果价格的最大值 == 栈顶 那么去掉栈顶
            if (prices[i] == qp.peek()) {
                qp.pop();
            }
        }
        return m;
    }


}
