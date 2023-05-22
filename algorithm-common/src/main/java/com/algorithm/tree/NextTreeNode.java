package com.algorithm.tree;

import com.algorithm.entity.tree.TreeLinkNode;

public class NextTreeNode {

    /***
     * todo: 九师兄  2023/5/20 19:03
     *
     * 【算法】二叉树的下一个结点
     * https://blog.csdn.net/qq_21383435/article/details/130784648
     */
    public TreeLinkNode getNext(TreeLinkNode pNode) {
        // 如果二叉树有有右节点 那么 下一个节点 一定是 右边子树的最左边街道
        if (pNode.getRight() != null) {
            TreeLinkNode node = pNode.getRight();
            while (node.getLeft() != null)
                node = node.getLeft();
            // 可能没有子树的左边节点 那么就是当前的顶节点
            return node;
        } else {
            // 否则，向上找第一个左链接指向的树包含该节点的祖先节点。
            while (pNode.getNext() != null) {
                TreeLinkNode parent = pNode.getNext();
                if (parent.getLeft() == pNode)
                    return parent;
                pNode = pNode.getNext();
            }
        }
        return null;
    }

}
