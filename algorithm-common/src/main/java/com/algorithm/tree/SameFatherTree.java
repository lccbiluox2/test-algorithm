package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SameFatherTree {


    /**
     * todo:  14_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_14  2023/1/14 下午5:01 九师兄
     * 测试点: 【算法】求二叉树的最低公共祖先
     * https://blog.csdn.net/qq_21383435/article/details/128685315
     */
    public static TreeNode lca(TreeNode head, TreeNode o1, TreeNode o2) {
        Map<TreeNode, TreeNode> map = new HashMap<>();
        map.put(head, head);
        process(head, map);
        Set<TreeNode> set = new HashSet<>();
        set.add(o1);

        TreeNode curr = o1;
        while (curr != map.get(curr)) {
            set.add(curr);
            curr = map.get(curr);
        }
        set.add(head);

        TreeNode curr1 = o2;
        while (true) {
            TreeNode father = map.get(curr1);
            // 如果父在链表中找到了这个节点 那么就是相交的节点
            if (set.contains(father)) {
                curr1 = father;
                break;
            } else {
                curr1 = map.get(father);
            }
        }
        return curr1;
    }

    private static void process(TreeNode head, Map<TreeNode, TreeNode> map) {
        if (head == null) {
            return;
        }
        map.put(head.leftChild, head);
        map.put(head.rightChild, head);

        process(head.leftChild, map);
        process(head.rightChild, map);
    }


    /**
     * todo:  59_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_59  2023/1/14 下午5:05 九师兄
     * 测试点:  这个代码相比上面那个代码要难很多
     *
     * 【算法】求二叉树的最低公共祖先
     * https://blog.csdn.net/qq_21383435/article/details/128685315
     */
    public static TreeNode lowestAncestor(TreeNode head, TreeNode o1, TreeNode o2) {
        if (head == null || head == o1 || head == o2) {
            return head;
        }
        TreeNode left = lowestAncestor(head.leftChild, o1, o2);
        TreeNode right = lowestAncestor(head.rightChild, o1, o2);
        // 左右孩子 不为空
        if (left != null && right != null) {
            return head;
        }
        return left != null ? left : right;
    }
}
