package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.utils.TreeUtils;
import junit.framework.TestCase;
import org.junit.Test;

public class TreeNodeMaxDistanceTest  {

    /***
     * todo: 11_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_11  2023/1/28 16:40 11 九师兄
     *   【算法】二叉树节点间的最大距离问题
     *   https://blog.csdn.net/qq_21383435/article/details/128779578
     */
    @Test
    public void testMaxDistance() {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(3);
        TreeNode c = new TreeNode(5);
        TreeNode d = new TreeNode(7);
        TreeNode e = new TreeNode(6);
        TreeNode f = new TreeNode(61);

        a.leftChild = b;
        a.rightChild = c;

        b.leftChild = d;
        c.leftChild=e;

        d.rightChild = f;

        int i = TreeNodeMaxDistance.maxDistance(a);
        System.out.println(i);
    }
}