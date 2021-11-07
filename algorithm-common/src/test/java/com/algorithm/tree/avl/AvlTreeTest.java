package com.algorithm.tree.avl;

import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-07 20:22
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class AvlTreeTest {

    /**
     * 测试点：测试未平衡的树的高度
     * 中序遍历二叉排序树~间
     * Node{value=3}
     * Node{value=4}
     * Node{value=5}
     * Node{value=6}
     * Node{value=7}
     * Node{value=8}
     * 未平衡之前的情况
     * 4
     * 左子树的高度：1
     * 右子树的高度：3
     */
    @Test
    public void treeHightTest() {
        int[] arr = {4, 3, 6, 5, 7, 8};
        AvlTree avlTree = new AvlTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            avlTree.add(new AvlTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        avlTree.infixOrder();
        System.out.println("未平衡之前的情况");
        System.out.println(avlTree.getRoot().height());

        System.out.println("左子树的高度：" + avlTree.getRoot().leftHeight());
        System.out.println("右子树的高度：" + avlTree.getRoot().rightHeight());
    }


    /**
     * 测试点：测试每次加入一个元素都判断是否需要左旋转
     * <p>
     * 树高度
     * 3
     * 左子树的高度：2
     * 右子树的高度：2
     * <p>
     * 可以看到左选择生效了
     */
    @Test
    public void leftRotateTets() {
        int[] arr = {4, 3, 6, 5, 7, 8};
        AvlTree avlTree = new AvlTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            avlTree.add(new AvlTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        avlTree.infixOrder();
        System.out.println("树高度");
        System.out.println(avlTree.getRoot().height());

        System.out.println("左子树的高度：" + avlTree.getRoot().leftHeight());
        System.out.println("右子树的高度：" + avlTree.getRoot().rightHeight());

        avlTree.infixOrder();

    }


    /**
     * 测试点：测试左子树高度大于右子树
     *
     * 中序遍历二叉排序树~间
     * Node{value=6}
     * Node{value=7}
     * Node{value=8}
     * Node{value=9}
     * Node{value=10}
     * Node{value=12}
     * 未平衡之前的情况
     * 4
     * 左子树的高度：3
     * 右子树的高度：1
     *
     * 可以看到右边子树高度小于左边高度
     */
    @Test
    public void treeHightTest1() {
        int[] arr = {10, 12, 8, 9, 7, 6};
        AvlTree avlTree = new AvlTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            avlTree.add(new AvlTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        avlTree.infixOrder();
        System.out.println("未平衡之前的情况");
        System.out.println(avlTree.getRoot().height());

        System.out.println("左子树的高度：" + avlTree.getRoot().leftHeight());
        System.out.println("右子树的高度：" + avlTree.getRoot().rightHeight());
    }

    /**
     * 测试点：测试平衡二叉树的右边旋转
     *
     * 中序遍历二叉排序树~间
     * Node{value=6}
     * Node{value=7}
     * Node{value=8}
     * Node{value=9}
     * Node{value=10}
     * Node{value=12}
     * 未平衡之前的情况
     * 3
     * 左子树的高度：2
     * 右子树的高度：2
     *
     */
    @Test
    public void rightRotateTets() {
        int[] arr = {10, 12, 8, 9, 7, 6};
        AvlTree avlTree = new AvlTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            avlTree.add(new AvlTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        avlTree.infixOrder();
        System.out.println("未平衡之前的情况");
        System.out.println(avlTree.getRoot().height());

        System.out.println("左子树的高度：" + avlTree.getRoot().leftHeight());
        System.out.println("右子树的高度：" + avlTree.getRoot().rightHeight());
    }

    /**
     * 测试点：测试下面这种数据，左右旋转都不靠谱了
     *
     * 中序遍历二叉排序树~间
     * Node{value=6}
     * Node{value=7}
     * Node{value=8}
     * Node{value=9}
     * Node{value=10}
     * Node{value=11}
     * 未平衡之前的情况
     * 4
     * 左子树的高度：1
     * 右子树的高度：3
     *
     */
    @Test
    public void doubleRotateBeforeTets() {
        int[] arr = {10, 11, 7, 6, 8, 9};
        AvlTree avlTree = new AvlTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            avlTree.add(new AvlTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        avlTree.infixOrder();
        System.out.println("未平衡之前的情况");
        System.out.println(avlTree.getRoot().height());

        System.out.println("左子树的高度：" + avlTree.getRoot().leftHeight());
        System.out.println("右子树的高度：" + avlTree.getRoot().rightHeight());
    }

    /**
     * 测试点：测试子树平衡
     *
     * 中序遍历二叉排序树~间
     * Node{value=6}
     * Node{value=7}
     * Node{value=8}
     * Node{value=9}
     * Node{value=10}
     * Node{value=11}
     * 3
     * 左子树的高度：2
     * 右子树的高度：2
     * 当前根节点：Node{value=8}
     *
     */
    @Test
    public void doubleRotateAfterTets() {
        int[] arr = {10, 11, 7, 6, 8, 9};
        AvlTree avlTree = new AvlTree();
        //循环的添加结点到二叉排序树
        for (int i = 0; i < arr.length; i++) {
            avlTree.add(new AvlTreeNode(arr[i]));
        }
        //中序遍历二叉排序树
        System.out.println("中序遍历二叉排序树~间");
        avlTree.infixOrder();
        System.out.println(avlTree.getRoot().height());

        System.out.println("左子树的高度：" + avlTree.getRoot().leftHeight());
        System.out.println("右子树的高度：" + avlTree.getRoot().rightHeight());

        System.out.println("当前根节点："+avlTree.getRoot().toString());
    }
}