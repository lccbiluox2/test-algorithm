package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

/**
 *todo: 2023/2/9 22:09 九师兄
 * 【算法】求完全二叉树的节点个数、不使用遍历
 *  https://blog.csdn.net/qq_21383435/article/details/128944938
 */
public class CountCompleteBinaryTree {

    //请保证head为头的数，是完全二叉树
    public static int nodeNum(TreeNode head) {
        if (head == null) {
            return 0;
        }
        // 求出树的最大高度 一直往左子树走
        int maxHight = mostLeftLevel(head, 1);
        return bs(head, 1, maxHight);
    }

    // node在第level层，h是总的深度（h永远不变，全局变量
    // 以node为头的完全二叉树，节点个数是多少
    private static int bs(TreeNode node, int level, int maxHight) {
        // 层高 等于 最大深度 只能说明只有一个节点
        if (level == maxHight) {
            return 1;
        }
        // 求出右边子树的最大高度
        int rightMax = mostLeftLevel(node.rightChild, level + 1);
        // 如果右边子树的高度等于树的高度 那么说明左子树是满的 有子树是不知道的
        if (rightMax == maxHight) {
            return (1 << (maxHight - level)) + bs(node.rightChild, level + 1, maxHight);
        } else {
            // 如果右边子树的高度不等于树的高度 那么说明左子树是不是满的 是不知道的，但是右子树是满的
            return (1 << (maxHight - level - 1)) + bs(node.leftChild, level + 1, maxHight);
        }
    }

    private static int mostLeftLevel(TreeNode head, int level) {
        TreeNode current = head;
        while (current != null) {
            level++;
            current = current.leftChild;
        }
        level =  level - 1;
        System.out.println("树高" + level);
        return level;
    }

}
