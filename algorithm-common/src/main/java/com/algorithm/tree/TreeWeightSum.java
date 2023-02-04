package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

/**
 *todo: 2023/2/4 20:10 九师兄
 * 【算法】二叉树权重和最大值
 *  https://blog.csdn.net/qq_21383435/article/details/128884121
 **/
public class TreeWeightSum {

    // 全局变量，只在到达叶节点的时候，有可能更新
    public static int maxSum = Integer.MIN_VALUE;

    public static int maxPath(TreeNode head) {
        p(head, 0);
        return maxSum;
    }

    //从根节点，当
    public static void p(TreeNode x, int pre) {
        // 说明当前节点是叶子节点
        if (x.leftChild == null && x.rightChild == null) {
            // 更新最大值
            maxSum = Math.max(maxSum, pre + x.data);
        }
        // 左边孩子的所有路径和
        if (x.leftChild != null) {
            p(x.leftChild, pre + x.data);
        }
        // 右边孩子的路径和
        if (x.rightChild != null) {
            p(x.rightChild, pre + x.data);
        }
    }


    /**
     *todo: 2023/2/4 20:07 九师兄
     * 套路的解法
     **/
    public static int maxis(TreeNode head) {
        if (head == null) {
            return 0;
        }
        return process2(head);
    }

    //x为头的整棵树上，最大路径和是多少，返回。
    // 路径要求，  一定从x出发，到叶节点，算做一个路径
    public static int process2(TreeNode x) {
        if (x.leftChild == null && x.rightChild == null) {
            return x.data;
        }
        int next = Integer.MIN_VALUE;
        if (x.leftChild != null) {
            next = process2(x.leftChild);
        }
        if (x.rightChild != null) {
            next = Math.max(next, process2(x.rightChild));
        }
        return x.data + next;
    }
}
