package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.utils.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class RebuildTreeTest {

    private RebuildTree rebuildTree = new RebuildTree();

    /***
     * todo: 九师兄  2023/5/20 17:32
     *
     * 【算法】根据前序遍历、中序遍历、重建二叉树
     * https://blog.csdn.net/qq_21383435/article/details/130783005
     */
    @Test
    public void reConstructBinaryTree() {
        int[] pre = new int[]{3,9,20,15,7};
        int[] in= new int[]{9,3,15,20,7};
        TreeNode treeNode = rebuildTree.reConstructBinaryTree(pre, in);
        TreeUtils.printPrettyTree(treeNode);
    }
}