package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.utils.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class SameFatherTreeTest {

    @Test
    public void lca() {

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

        TreeNode lca = SameFatherTree.lca(treeNodeA, treeNodeC4, treeNodeC2);
        System.out.println(lca);

    }
}