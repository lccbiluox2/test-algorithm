package com.algorithm.tree.binarysorttree;

import com.algorithm.entity.tree.TreeNode;

public class IsSortTree {


    // 记录上次处理值的大小
    private static Integer preValue = Integer.MIN_VALUE;
    /**
     * 二叉树中序遍历
     *
     * @param node 二叉树节点
     */
    public static boolean isBst(TreeNode node) {
        if (node == null) {
            return true;
        }
        // 判断左边树是不是搜索二叉树 左边如果不是 那么整个树就不是搜素二叉树
        boolean isLeftBst = isBst(node.leftChild);
        if(!isLeftBst){
            return false;
        }
        // 如果左树是搜索二叉树
        if(node.data <= preValue){
            // 如果当前值小于上一次的值 那么就不是搜索二叉树
            return false;
        }else {
            // 否则就是当前值比上次还大 那么就替换元素
            preValue = node.data;
        }

        // 返回右边树是不是
        return isBst(node.rightChild);
    }
}
