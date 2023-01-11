package com.algorithm.tree.utils;


import com.algorithm.entity.tree.TreeNode;
import com.algorithm.tree.BinaryTreeDemo;

public class TreeUtils {


    public static void printPrettyTree(TreeNode root) {
        System.out.println("The binary tree is:");
        printInOrder(root, 0, ".", 17);
    }

    private static void printInOrder(TreeNode root, int height, String to, int len) {
        if (root == null) {
            return;
        }
        printInOrder(root.rightChild, height + 1, "v", len);
        String val = to + root.data + to;
        int lenM = val.length();
        int lenL = (len - lenM) / 2;
        int lenR = len - lenM - lenL;
        val = getSpace(lenL) + val + getSpace(lenR);
        System.out.println(getSpace(height * len) + val);
        printInOrder(root.leftChild, height + 1, "^", len);
    }

    private static String getSpace(int num) {
        String space = " ";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < num; i++) {
            stringBuilder.append(space);
        }
        return stringBuilder.toString();
    }


    private static int getTreeHigth(TreeNode head) {
        TreeNode current = head;
        int count = 1;
        while (current.leftChild != null) {
            current = current.leftChild;
            count++;
        }
        System.out.println("树的高度：" + count);
        return count;
    }
}
