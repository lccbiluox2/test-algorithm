package com.algorithm.tree.binarysorttree;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-07 13:14
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class BinarySortTreeDemoTest {

    BinarySortTreeDemo binarySortTreeDemo = new BinarySortTreeDemo();

    /**
     * 测试点：二叉排序树的中序遍历巧合是一个有序的数据
     *
     * 中序遍历二叉排序树~间
     * Node{value=1}
     * Node{value=3}
     * Node{value=5}
     * Node{value=7}
     * Node{value=9}
     * Node{value=10}
     * Node{value=12}
     */
     @Test
    public void makeTree() {
        binarySortTreeDemo.makeTree();
    }

    /**
     * 测试点：测试删除叶子节点
     *
     * 中序遍历二叉排序树~间
     * Node{value=1}
     * Node{value=3}
     * Node{value=5}
     * Node{value=7}
     * Node{value=9}
     * Node{value=10}
     * Node{value=12}
     * 中序遍历二叉排序树~间
     * Node{value=3}
     * Node{value=5}
     * Node{value=7}
     * Node{value=9}
     * Node{value=10}
     * Node{value=12}
     *
     * 可以看到果然叶子节点被删除了
     */
    @Test
    public void deleteLeavesNode() {
        binarySortTreeDemo.deleteLeavesNode();
    }

    /**
     * 测试点：测试删除带有子节点的节点
     *
     * 中序遍历二叉排序树~间
     * Node{value=1}
     * Node{value=3}
     * Node{value=5}
     * Node{value=7}
     * Node{value=9}
     * Node{value=10}
     * Node{value=12}
     * 中序遍历二叉排序树~间
     * Node{value=1}
     * Node{value=3}
     * Node{value=5}
     * Node{value=7}
     * Node{value=10}
     * Node{value=12}
     */
    @Test
    public void deleteHaveSonNode() {
        binarySortTreeDemo.deleteHaveSonNode();
    }
}