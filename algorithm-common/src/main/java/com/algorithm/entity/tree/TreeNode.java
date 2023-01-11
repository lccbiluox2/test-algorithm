package com.algorithm.entity.tree;

import com.algorithm.tree.BinaryTreeDemo;
import lombok.Data;

/**
 * 二叉树节点
 */
@Data
public class TreeNode {
    public int data;
    public TreeNode leftChild;
    public TreeNode rightChild;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }

}