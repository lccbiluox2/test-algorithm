package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

/***
 * todo: 6_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_6  2023/1/28 19:31 6 九师兄
 *      【算法】二叉树的Morris遍历、线索二叉树
 *      https://blog.csdn.net/qq_21383435/article/details/128780756
 */
public class MorrisTree {

    public static void morris(TreeNode head) {
        if (head == null) {
            return;
        }
        TreeNode cur = head;
        TreeNode mostRight = null;
        while (cur != null) {//过流程 cur不为空，那么就一直遍历下去
            mostRight = cur.leftChild; // mostRight是cur左孩子
            // 如果没有左孩子，那么这块代码直接跳过
            if (mostRight != null) {//有左子树
                // 找到左树节点的最右边节点，mostRight.rightChild != cur 这个可能是人为改过
                // 所以要加入这个判断条件
                while (mostRight.rightChild != null && mostRight.rightChild != cur) {
                    mostRight = mostRight.rightChild;
                }
                // mostRight变成了cur左子树上，最右的节点
                if (mostRight.rightChild == null) {
                    // 这是第一次来到cur
                    mostRight.rightChild = cur; // 右指针执行当然节点
                    cur = cur.leftChild;
                    continue;
                } else { // mostRight.right == cur
                    // 第二次来到当前节点
                    mostRight.rightChild = null;
                }
            }
            // 节点向右边移动
            cur = cur.rightChild;
        }
    }
}
