package com.algorithm.tree.binarysorttree;

import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.BinaryTreeFlatGrade;
import com.algorithm.tree.utils.TreeUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsSortTreeTest {

    @Test
    public void isBst() {
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

        boolean bst = IsSortTree.isBst(treeNodeA);
        System.out.println(bst);
    }

    /**
     * todo:  40_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_40  2023/1/13 下午10:17 九师兄
     *     测试点: 测试一个树 是不是 搜索二叉树
     *
     *     【算法】判断一棵树是不是搜索二叉树
     *      https://blog.csdn.net/qq_21383435/article/details/128679435
     *
     *     运行结果
     *     The binary tree is:
     *                                         v10v
     *                         v9v
     *                                          ^8^
     *        .7.
     *                                          v6v
     *                         ^5^
     *                                          ^3^
     *      true
     *
     */
    @Test
    public void isBst2() {
        TreeNode treeNodeA = new TreeNode(7);

        TreeNode  treeNodeB1 = new TreeNode(5);
        TreeNode  treeNodeB2 = new TreeNode(9);

        TreeNode  treeNodeC1 = new TreeNode(3);
        TreeNode  treeNodeC2 = new TreeNode(6);
        TreeNode  treeNodeC3 = new TreeNode(8);
        TreeNode  treeNodeC4 = new TreeNode(10);

        treeNodeA.leftChild = treeNodeB1;
        treeNodeA.rightChild = treeNodeB2;

        treeNodeB1.leftChild = treeNodeC1;
        treeNodeB1.rightChild = treeNodeC2;

        treeNodeB2.leftChild = treeNodeC3;
        treeNodeB2.rightChild = treeNodeC4;

        TreeUtils.printPrettyTree(treeNodeA);

        boolean bst = IsSortTree.isBst(treeNodeA);
        System.out.println(bst);
    }

    /***
     * todo: 86_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_86  2023/1/13 下午10:27 86 九师兄
     *     测试点: 测试一个树 是不是 搜索二叉树  非递归模式
     *
     *     【算法】判断一棵树是不是搜索二叉树
     *      https://blog.csdn.net/qq_21383435/article/details/128679435
     */
    @Test
    public void isBstV2() {
        TreeNode treeNodeA = new TreeNode(7);

        TreeNode  treeNodeB1 = new TreeNode(5);
        TreeNode  treeNodeB2 = new TreeNode(9);

        TreeNode  treeNodeC1 = new TreeNode(3);
        TreeNode  treeNodeC2 = new TreeNode(6);
        TreeNode  treeNodeC3 = new TreeNode(8);
        TreeNode  treeNodeC4 = new TreeNode(10);

        treeNodeA.leftChild = treeNodeB1;
        treeNodeA.rightChild = treeNodeB2;

        treeNodeB1.leftChild = treeNodeC1;
        treeNodeB1.rightChild = treeNodeC2;

        treeNodeB2.leftChild = treeNodeC3;
        treeNodeB2.rightChild = treeNodeC4;

        TreeUtils.printPrettyTree(treeNodeA);

        boolean bst = IsSortTree.isBstV2(treeNodeA);
        System.out.println(bst);
    }


    @Test
    public void isBstV3() {
        TreeNode treeNodeA = new TreeNode(7);

        TreeNode  treeNodeB1 = new TreeNode(5);
        TreeNode  treeNodeB2 = new TreeNode(9);

        TreeNode  treeNodeC1 = new TreeNode(3);
        TreeNode  treeNodeC2 = new TreeNode(6);
        TreeNode  treeNodeC3 = new TreeNode(8);
        TreeNode  treeNodeC4 = new TreeNode(10);

        treeNodeA.leftChild = treeNodeB1;
        treeNodeA.rightChild = treeNodeB2;

        treeNodeB1.leftChild = treeNodeC1;
        treeNodeB1.rightChild = treeNodeC2;

        treeNodeB2.leftChild = treeNodeC3;
        treeNodeB2.rightChild = treeNodeC4;

        TreeUtils.printPrettyTree(treeNodeA);

        boolean bst = IsSortTree.isBstV3(treeNodeA);
        System.out.println(bst);
    }
}