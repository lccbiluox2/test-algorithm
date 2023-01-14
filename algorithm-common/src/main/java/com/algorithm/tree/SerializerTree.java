package com.algorithm.tree;


import com.algorithm.entity.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * todo:  4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/14 下午8:40 九师兄
 * 测试点: 序列化与反序列化树
 */
public class SerializerTree {


    /**
     * todo:  17_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_17  2023/1/14 下午9:05 九师兄
     *     测试点:  【算法】 二叉树的序列化和反序列化
     *     https://blog.csdn.net/qq_21383435/article/details/128688920
     */
    public static String serialByPre(TreeNode head) {
        if (head == null) {
            return "#_";
        }
        String res = head.data + "_";
        res += serialByPre(head.leftChild);
        res += serialByPre(head.rightChild);
        return res;
    }

    public static TreeNode reconByPreString(String preStr) {
        String[] values = preStr.split("_");
        Queue<String> queue = new LinkedList<String>();
        for (int i = 0; i != values.length; i++) {
            queue.add(values[i]);
        }
        return reconPreOrder(queue);
    }

    public static TreeNode reconPreOrder(Queue<String> queue) {
        String value = queue.poll();
        if (value.equals("#")){
            return null;
        }
        TreeNode head = new TreeNode(Integer.valueOf(value).intValue());
        head.leftChild = reconPreOrder(queue);
        head.rightChild = reconPreOrder(queue);
        return head;
    }

}
