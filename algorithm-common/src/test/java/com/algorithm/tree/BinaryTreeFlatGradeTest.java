package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.utils.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryTreeFlatGradeTest {

    /***
     * todo: 2023/1/10 下午10:51 lcc 九师兄
     *       参考文章：https://www.bilibili.com/video/BV13g41157hK/?p=7&spm_id_from=pageDriver&vd_source=44c491a7c7c735ef8081cb60288bb47e
     */
    @Test
    public void inOrderUnRecur() {
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

        BinaryTreeFlatGrade.kuandu(treeNodeA);
    }
}