package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

/***
 * todo: 11_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_11  2023/1/28 16:40 11 九师兄
 *   【算法】二叉树节点间的最大距离问题
 *   https://blog.csdn.net/qq_21383435/article/details/128779578
 */
public class TreeNodeMaxDistance {



    public static int maxDistance(TreeNode head) {
        return process(head).maxDistance;
    }

    public static class Info {
        public int maxDistance;
        public int height;

        public Info(int dis, int h) {
            maxDistance = dis;
            height = h;
        }
    }

    // 返回以x为头的整棵树，\
    // 二叉树的套路就是我能往我的左右子树要信息的情况下，然后做出一些判断
    public static Info process(TreeNode x) {
        if (x == null) {
            return new Info(0, 0);
        }
        // 要左边树的信息
        Info leftInfo = process(x.leftChild);
        // 要右边树的信息
        Info rightInfo = process(x.rightChild);
        // info 三种可能性
        int p1 = leftInfo.maxDistance;
        int p2 = rightInfo.maxDistance;
        int p3 = leftInfo.height + 1 + rightInfo.height;

        // 获取最大距离
        int maxDistance = Math.max(p3, Math.max(p1, p2));
        // 获取树的高度
        int height = Math.max(leftInfo.height, rightInfo.height) + 1;
        return new Info(maxDistance, height);
    }

}
