package com.algorithm.tree;

/**
 * todo:  4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/14 下午5:52 九师兄
 * 测试点: 求一个节点的后继节点
 */
public class SuccessorTreeNode {


    /***
     * todo: 11_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_11  2023/1/14 下午8:39 11 九师兄
     *  【算法】在二叉树中找到一个节点的后继节点
     *  https://blog.csdn.net/qq_21383435/article/details/128687476
     */
    public static Node getSuccessorNode(Node node) {
        if (node == null) {
            return node;
        }
        // 如果有右树 那么一直找到右边树的最左边节点
        if (node.right != null) {
            return getLeftMost(node.right);
        } else { // 无右子树
            Node parent = node.parent;
            while (parent == null && parent.left != node) { // 当前节点是其父亲节点右孩子
                node = parent;
                parent = node.parent;
            }
            return parent;
        }
    }

    // 获取整个树上的最左边节点
    private static Node getLeftMost(Node node) {
        if (node == null) {
            return node;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }


    private class Node {
        public int value;
        public Node left;
        public Node right;
        public Node parent;

        public Node(int value) {
            this.value = value;
        }
    }
}