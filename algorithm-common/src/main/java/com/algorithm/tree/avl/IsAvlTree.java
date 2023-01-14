package com.algorithm.tree.avl;

import com.algorithm.entity.tree.TreeNode;

public class IsAvlTree {

    /**
     * todo:  6_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_6  2023/1/14 上午9:37 九师兄
     * 测试点: 【算法】判断一棵树是不是平衡二叉树
     * https://blog.csdn.net/qq_21383435/article/details/128683788
     * <p>
     * 判断一棵树是不是平衡二叉树的方式如下
     * 1. 左右子树都是平衡二叉树
     * 2. 左右子树的层高 <= 1
     */
    public static boolean isBalance(TreeNode head) {
        return process(head).isBalanced;
    }

    private static ReturnType process(TreeNode head) {
        // 空树的默认是平衡树 高度是0
        if (head == null) {
            return new ReturnType(true, 0);
        }
        // 左右孩子是否是平衡树 以及树高
        ReturnType leftData = process(head.leftChild);
        ReturnType rightData = process(head.rightChild);

        // 根据左边孩子 右边孩子 取最大值，然后+1 就是当前自己的高度
        int hight = Math.max(leftData.hight, rightData.hight) + 1;
        // 当前节点的左右孩子都是平衡树的前提下，两个孩子的高度相差 小于等于1 才可以
        boolean isBalanced = leftData.isBalanced && rightData.isBalanced
                && Math.abs(leftData.hight - rightData.hight) < 2;
        return new ReturnType(isBalanced,hight);
    }


    private static class ReturnType {
        // 树是平衡的吗
        public boolean isBalanced;
        // 树的高度
        public int hight;

        public ReturnType(boolean isBalanced, int hight) {
            this.isBalanced = isBalanced;
            this.hight = hight;
        }
    }
}
