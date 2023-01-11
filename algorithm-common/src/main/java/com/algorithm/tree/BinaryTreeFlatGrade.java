package com.algorithm.tree;


import com.algorithm.entity.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeFlatGrade {

    /**
     * todo: 2023/1/11 下午10:41 九师兄
     *     测试点: 【算法】二叉树的平级遍历、宽度遍历
     *     https://blog.csdn.net/qq_21383435/article/details/128652092
     */
    public static void kuandu(TreeNode head){
        if(head == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()){
            TreeNode cur = queue.poll();
            System.out.print(cur.data+" ");
            if(cur.leftChild != null){
                queue.add(cur.leftChild);
            }
            if(cur.rightChild != null){
                queue.add(cur.rightChild);
            }
        }
    }
}
