package com.algorithm.tree.complete;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.binarysorttree.IsSortTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/13 下午10:32 4 九师兄
 * 判断一棵树是不是完全二叉树
 */
public class IsCompleteTree {

    /**
     * todo:  10_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_10  2023/1/14 上午9:03 九师兄
     * 测试点: 测试判断一个二叉树是不是完全二叉树
     * 【算法】判断一棵树是不是完全二叉树
     * https://blog.csdn.net/qq_21383435/article/details/128680555
     * 1. 节点有右边孩子 没有左边 孩子 那么证明有个洞 肯定不是完全二叉树
     * 2. 在第一个条件不违规的情况下，如果遇到第一个左右孩子不全的情况下，所有节点
     * 必须是叶子节点
     *
     * @return
     */
    public static boolean kuandu(TreeNode head) {
        if (head == null) {
            return false;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        // 这个表示是否遇到过左右孩子不双全的节点
        boolean leaf = false;
        TreeNode l = null;
        TreeNode r = null;
        while (!queue.isEmpty()) {
            head = queue.poll();
            System.out.print(head.data + " ");
            l = head.leftChild;
            r = head.rightChild;
            if (
                // 遇到过左右孩子为空的情况下，而且当前节点左边或者右边孩子不为空返回空
                // 因为我只要遇到一次叶子节点，那么后续节点都应该是叶子节点，左右孩子为空
                    (leaf && (l != null || r != null))
                            // 有右边节点无 左边节点
                            || (l == null && r != null)
            ) {

                return false;
            }
            if (l != null) {
                queue.add(l);
            }
            if (r != null) {
                queue.add(r);
            }
            // 第一次遇到叶子节点以后都是true
            if (l == null || r == null) {
                leaf = true;
            }

        }
        return true;
    }


    /**
     * todo:  72_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_72  2023/1/14 下午12:09 九师兄
     * 测试点: 【算法】判断一棵树是不是完全二叉树
     * https://blog.csdn.net/qq_21383435/article/details/128680555
     * <p>
     */
    public static boolean isComplete(TreeNode head) {
        ReturnType process = process(head);
        // 关键是这个 2的高度次方 - 1 个节点
        return process.nodes == (1 << process.hight - 1);
    }

    private static ReturnType process(TreeNode head) {
        // 空树的默认是搜索树
        if (head == null) {
            return new ReturnType(0, 0);
        }
        // 左右孩子是否是搜索树 以及最大值和最小值
        ReturnType leftData = process(head.leftChild);
        ReturnType rightData = process(head.rightChild);

        int hight = Math.max(leftData.hight, rightData.hight) + 1;
        int nodes = leftData.nodes + rightData.nodes + 1;

        return new ReturnType(hight, nodes);
    }


    private static class ReturnType {
        public int hight;
        public int nodes;

        public ReturnType(int hight, int nodes) {
            this.hight = hight;
            this.nodes = nodes;
        }
    }
}
