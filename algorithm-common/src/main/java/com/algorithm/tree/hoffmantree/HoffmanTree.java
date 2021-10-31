package com.algorithm.tree.hoffmantree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-31 16:32
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo: 【算法】赫夫曼树
 *       https://blog.csdn.net/qq_21383435/article/details/121063994
 */
public class HoffmanTree {


    //创建赫夫曼树的方法
    public static Node createHuffmanTree(int[] arr) {
        //第一步为了操作方便
        //1.遍历arr数组
        //2.将arr的每个元素构成成一个Node
        //3.将Node 放入到ArrayList中
        List<Node> nodes = new ArrayList<>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }

        // 从小到大排序
        Collections.sort(nodes);

        while (nodes.size() > 1) {

            //取出根节点权值最小的两颗二叉树
            //(1)取出权值最小的结点(二叉树)
            Node left = nodes.get(0);
            //(2)取出权值第二_小的结点(二叉树)
            Node right = nodes.get(1);

            //(3)构建一颗新的二叉树
            Node parent = new Node(left.value + right.value);
            parent.left = left;
            parent.right = right;

            //(4)从ArrayList删除处理过的二叉树
            nodes.remove(left);
            nodes.remove(right);
            //  将parent加入到Nodes中
            nodes.add(parent);

        }

        //返回哈夫曼树的rootint index
        return nodes.get(0);
    }


    //编写一个前序遍历的方法
    public static void preOrder(Node root) {
        if (root != null) {
            root.preOrder();
        } else {
            System.out.println("是空树，不能遍历~~") ;
        }
    }

    static class Node implements Comparable<Node> {
        int value; //结点权值
        Node left; //指向左子结点
        Node right; //指向右子结点

        public Node(int value) {
            this.value = value;
        }

        //写一个前序遍历
        public void preOrder() {
            System.out.println(this);
            if (this.left != null) {
                this.left.preOrder();
            }
            if (this.right != null) {
                this.right.preOrder();
            }
        }

        @Override
        public String toString() {
            return "Node [value=" + value + "] ";
        }

        @Override
        public int compareTo(Node o) {
            return this.value - o.value;
        }
    }
}
