package com.algorithm.tree;


import com.algorithm.entity.tree.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BinaryTreeFlatGrade {

    /**
     * todo: 2023/1/11 下午10:41 九师兄
     * 测试点: 【算法】二叉树的平级遍历、宽度遍历
     * https://blog.csdn.net/qq_21383435/article/details/128652092
     */
    public static void kuandu(TreeNode head) {
        if (head == null) {
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            System.out.print(cur.data + " ");
            if (cur.leftChild != null) {
                queue.add(cur.leftChild);
            }
            if (cur.rightChild != null) {
                queue.add(cur.rightChild);
            }
        }
    }


    /***
     * todo: 37_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_37  2023/1/12 下午10:59 37 九师兄
     *       【算法】求二叉树的最大宽度 5Lmd5biI5YWE5paH56ug77yM56aB5q2i6L2s6L29
     *       https://blog.csdn.net/qq_21383435/article/details/128666843
     */
    public static int maxKuandu(TreeNode head) {
        if (head == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        Map<TreeNode, Integer> levelMap = new HashMap<>();
        queue.add(head);
        // 头结点在第一层
        levelMap.put(head, 1);
        // 当前在那一层
        int currLevel = 0;
        // 当前层发现了几个节点
        int currLevelNodes = 0;
        int max = Integer.MIN_VALUE; //【标记A】开始情况
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();  //【标记B】取出数据
            // 拿到当前节点的层数
            Integer level = levelMap.get(cur); //【标记C】获取层级
            // 你想要 一个节点先下去到子节点 然后在返回回来到自己的节点 证明当前层全遍历完了
            if (level == currLevel) {
                currLevelNodes++; //【标记D】获取层级
            } else {
                // 结算
                max = Math.max(max, currLevelNodes); //【标记E】获取层级
                currLevel++;
                currLevelNodes = 1;
            }

            System.out.print(cur.data + " ");
            if (cur.leftChild != null) {
                levelMap.put(cur.leftChild,currLevel+1); //【标记F】获取层级
                queue.add(cur.leftChild);  //【标记G】获取层级
            }
            if (cur.rightChild != null) {
                levelMap.put(cur.rightChild,currLevel+1); //【标记H】获取层级
                queue.add(cur.rightChild); //【标记I】获取层级
            }
        }
        // 最后一层遍历完 再次计算一下 当前最大值和最后一层的个数比较
        max = Math.max(max, currLevelNodes);
        return max;
    }
}
