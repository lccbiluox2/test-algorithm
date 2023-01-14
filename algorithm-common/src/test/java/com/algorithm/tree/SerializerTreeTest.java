package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.utils.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerializerTreeTest {

    @Test
    public void serialByPre() {
        TreeNode treeNodeA = new TreeNode(1);

        TreeNode treeNodeB1 = new TreeNode(4);
        TreeNode treeNodeB2 = new TreeNode(6);

        TreeNode treeNodeC1 = new TreeNode(9);
        TreeNode treeNodeC2 = new TreeNode(7);
        TreeNode treeNodeC3 = new TreeNode(3);
        TreeNode treeNodeC4 = new TreeNode(8);

        treeNodeA.leftChild = treeNodeB1;
        treeNodeA.rightChild = treeNodeB2;

        treeNodeB1.leftChild = treeNodeC1;
        treeNodeB1.rightChild = treeNodeC2;

        treeNodeB2.leftChild = treeNodeC3;
        treeNodeB2.rightChild = treeNodeC4;

        TreeUtils.printPrettyTree(treeNodeA);

        String s = SerializerTree.serialByPre(treeNodeA);
        System.out.println(s);

    }

    /***
     * todo: 40_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_40  2023/1/14 下午8:49 40 九师兄
     *                                          v8v
     *                         v6v
     *                                          ^3^
     *        .1.
     *                                          v7v
     *                         ^4^
     *                                          ^9^
     */
    @Test
    public void reconByPreString() {
        TreeNode s = SerializerTree.reconByPreString("1_4_9_#_#_7_#_#_6_3_#_#_8_#_#_");
        TreeUtils.printPrettyTree(s);
    }
}