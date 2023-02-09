package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.utils.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class CountCompleteBinaryTreeTest {

    /**
     *todo: 2023/2/9 22:09 九师兄
     * 【算法】求完全二叉树的节点个数、不使用遍历
     *  https://blog.csdn.net/qq_21383435/article/details/128944938
     *
     *                                           v8v
     *                         v6v
     *                                          ^3^
     *        .1.
     *                                          v7v
     *                         ^4^
     *                                          ^9^
     * 树高3
     * 树高3
     * 树高3
     * 7
     *
     *
     **/
    @Test
    public void nodeNum() {
        TreeNode treeNodeA = new TreeNode(1);

        TreeNode  treeNodeB1 = new TreeNode(4);
        TreeNode  treeNodeB2 = new TreeNode(6);

        TreeNode  treeNodeC1 = new TreeNode(9);
        TreeNode  treeNodeC2 = new TreeNode(7);
        TreeNode  treeNodeC3 = new TreeNode(3);
        TreeNode  treeNodeC4 = new TreeNode(8);

        treeNodeA.leftChild = treeNodeB1;
        treeNodeA.rightChild = treeNodeB2;

        treeNodeB1.leftChild = treeNodeC1;
        treeNodeB1.rightChild = treeNodeC2;

        treeNodeB2.leftChild = treeNodeC3;
        treeNodeB2.rightChild = treeNodeC4;

        TreeUtils.printPrettyTree(treeNodeA);

        int i = CountCompleteBinaryTree.nodeNum(treeNodeA);
        System.out.println(i);

    }

    /**
     *todo: 2023/2/9 22:09 九师兄
     * 【算法】求完全二叉树的节点个数、不使用遍历
     *  https://blog.csdn.net/qq_21383435/article/details/128944938
     *
     *   The binary tree is:
     *                         v6v
     *                                          ^3^
     *        .1.
     *                                          v7v
     *                         ^4^
     *                                          ^9^
     * 树高3
     * 树高3
     * 树高2
     * 6
     *
     **/
    @Test
    public void nodeNum1() {
        TreeNode treeNodeA = new TreeNode(1);

        TreeNode  treeNodeB1 = new TreeNode(4);
        TreeNode  treeNodeB2 = new TreeNode(6);

        TreeNode  treeNodeC1 = new TreeNode(9);
        TreeNode  treeNodeC2 = new TreeNode(7);
        TreeNode  treeNodeC3 = new TreeNode(3);
//        TreeNode  treeNodeC4 = new TreeNode(8);

        treeNodeA.leftChild = treeNodeB1;
        treeNodeA.rightChild = treeNodeB2;

        treeNodeB1.leftChild = treeNodeC1;
        treeNodeB1.rightChild = treeNodeC2;

        treeNodeB2.leftChild = treeNodeC3;
//        treeNodeB2.rightChild = treeNodeC4;

        TreeUtils.printPrettyTree(treeNodeA);

        int i = CountCompleteBinaryTree.nodeNum(treeNodeA);
        System.out.println(i);

    }
}