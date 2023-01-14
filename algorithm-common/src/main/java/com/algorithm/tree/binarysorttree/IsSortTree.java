package com.algorithm.tree.binarysorttree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.avl.IsAvlTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class IsSortTree {


    // 记录上次处理值的大小
    private static Integer preValue = Integer.MIN_VALUE;

    /**
     * 二叉树中序遍历
     *
     * @param node 二叉树节点
     */
    public static boolean isBst(TreeNode node) {
        if (node == null) {
            return true;
        }
        // 判断左边树是不是搜索二叉树 左边如果不是 那么整个树就不是搜素二叉树
        boolean isLeftBst = isBst(node.leftChild);
        if (!isLeftBst) {
            return false;
        }
        // 如果左树是搜索二叉树
        if (node.data <= preValue) {
            // 如果当前值小于上一次的值 那么就不是搜索二叉树
            return false;
        } else {
            // 否则就是当前值比上次还大 那么就替换元素
            preValue = node.data;
        }

        // 返回右边树是不是
        return isBst(node.rightChild);
    }


    public static boolean isBstV2(TreeNode head) {
        System.out.println("中序遍历");
        if (head != null) {
            Integer preValue = Integer.MIN_VALUE;
            Stack<TreeNode> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.leftChild;
                } else {
                    head = stack.pop();

                    if (head.data <= preValue) {
                        // 如果当前值小于上一次的值 那么就不是搜索二叉树
                        return false;
                    } else {
                        // 否则就是当前值比上次还大 那么就替换元素
                        preValue = head.data;
                    }

                    head = head.rightChild;
                }
            }
        }
        System.out.println();
        return true;
    }


    /**
     * todo:  72_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_72  2023/1/14 下午12:09 九师兄
     * 测试点: 【算法】判断一棵树是不是搜索二叉树
     * https://blog.csdn.net/qq_21383435/article/details/128679435
     * <p>
     * 1. 左树是搜索二叉树 右树是搜索二叉树
     * 2. 左树的最大值 <= 当前值
     * 2. 右树的最小值 >= 当前值
     */
    public static boolean isBstV3(TreeNode head) {
        return process(head).isSort;
    }

    private static ReturnType process(TreeNode head) {
        // 空树的默认是搜索树
        if (head == null) {
            return new ReturnType(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
        }
        // 左右孩子是否是搜索树 以及最大值和最小值
        ReturnType leftData = process(head.leftChild);
        ReturnType rightData = process(head.rightChild);

        // 根据左树最大值
        int max = Math.max(leftData.max, head.data);
        // 右树最小值
        int min = Math.min(rightData.min, head.data);
        // 左树的最大值 <= 当前值  && 右树的最小值 >= 当前值
        if (max <= head.data && head.data <= min) {
            return new ReturnType(true, max, min);
        }
        return new ReturnType(false, max, min);
    }


    private static class ReturnType {
        // 树是搜索的吗
        public boolean isSort;
        public int max;
        public int min;

        public ReturnType(boolean isSort, int max, int min) {
            this.isSort = isSort;
            this.max = max;
            this.min = min;
        }
    }
}
