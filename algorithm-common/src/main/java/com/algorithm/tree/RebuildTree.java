package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class RebuildTree {

    // 缓存中序遍历数组每个值对应的索引
    private Map<Integer, Integer> indexForInOrders = new HashMap<>();

    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {
        for (int i = 0; i < in.length; i++)
            indexForInOrders.put(in[i], i);
        return reConstructBinaryTree(pre, 0, pre.length - 1, 0);
    }

    private TreeNode reConstructBinaryTree(int[] pre, int preL, int preR, int inL) {
        if (preL > preR)
            return null;
        TreeNode root = new TreeNode(pre[preL]);
        int inIndex = indexForInOrders.get(root.data);
        int leftTreeSize = inIndex - inL;
        root.leftChild = reConstructBinaryTree(pre, preL + 1, preL + leftTreeSize, inL);
        root.rightChild = reConstructBinaryTree(pre, preL + leftTreeSize + 1, preR, inL + leftTreeSize + 1);
        return root;
    }

}
