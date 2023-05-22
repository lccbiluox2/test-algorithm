package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.utils.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeMaxSearchTreeTest {

    /***
     * todo: 12_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_12  2023/2/26 11:07 12 九师兄
     *
     *  The binary tree is:
     *                                         v12v
     *                        v10v
     *                                          ^3^
     *        .5.
     *                                          v4v
     *                         ^3^
     *                                          ^6^
     * 5
     */
    @Test
    public void bstTopoSize2() {

        TreeNode treeNodeA = new TreeNode(5);

        TreeNode  treeNodeB1 = new TreeNode(3);
        TreeNode  treeNodeB2 = new TreeNode(10);

        TreeNode  treeNodeC1 = new TreeNode(6);
        TreeNode  treeNodeC2 = new TreeNode(4);
        TreeNode  treeNodeC3 = new TreeNode(3);
        TreeNode  treeNodeC4 = new TreeNode(12);

        treeNodeA.leftChild = treeNodeB1;
        treeNodeA.rightChild = treeNodeB2;

        treeNodeB1.leftChild = treeNodeC1;
        treeNodeB1.rightChild = treeNodeC2;

        treeNodeB2.leftChild = treeNodeC3;
        treeNodeB2.rightChild = treeNodeC4;

        TreeUtils.printPrettyTree(treeNodeA);


        int i = BinaryTreeMaxSearchTree.bstTopoSize2(treeNodeA);
        System.out.println(i);
    }
}