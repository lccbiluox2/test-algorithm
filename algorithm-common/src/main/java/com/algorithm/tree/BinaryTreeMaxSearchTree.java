package com.algorithm.tree;

import com.algorithm.entity.tree.TreeNode;

import java.util.HashMap;
import java.util.Map;

/***
 * todo: 9_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_9  2023/2/26 11:11 9 九师兄
 *     【算法】拓扑贡献记录、求二叉树的搜索二叉树、最大拓扑结构
 *     https://blog.csdn.net/qq_21383435/article/details/129219406
 */
public class BinaryTreeMaxSearchTree {

    public static class Record {
        public int leftContribution;
        public int rightContribution;

        public Record(int left, int right) {
            this.leftContribution = left;
            this.rightContribution = right;
        }
    }

    public static int bstTopoSize2(TreeNode head) {
        Map<TreeNode, Record> map = new HashMap<TreeNode, Record>();
        return posOrder(head, map);
    }

    public static int posOrder(TreeNode h, Map<TreeNode, Record> map) {
        if (h == null) {
            return 0;
        }
        // 获取左边节点的贡献度
        int ls = posOrder(h.getLeftChild(), map);
        // 获取右边节点的贡献度
        int rs = posOrder(h.getRightChild(), map);
        // 修改左边节点的贡献度map
        modifyMap(h.getLeftChild(), h.data, map, true);
        // 修改右边节点的贡献度map
        modifyMap(h.getRightChild(), h.data, map, false);

        Record lr = map.get(h.getLeftChild());
        Record rr = map.get(h.getRightChild());

        // 如果左边贡献度等于null 那么结果是0 否则是 左边贡献度+右边贡献度+1
        int lbst = lr == null ? 0 : lr.leftContribution + lr.rightContribution + 1;
        int rbst = rr == null ? 0 : rr.leftContribution + rr.rightContribution + 1;

        map.put(h, new Record(lbst, rbst));
        // todo: 每个节点我们都求了最大值
        return Math.max(lbst + rbst + 1, Math.max(ls, rs));
    }

    public static int modifyMap(TreeNode n, int v, Map<TreeNode, Record> m, boolean s) {
        if (n == null || (!m.containsKey(n))) {
            return 0;
        }
        Record r = m.get(n);
        if ((s && n.data > v) || ((!s) && n.data < v)) {
            m.remove(n);
            return r.leftContribution + r.rightContribution + 1;
        } else {
            int minus = modifyMap(s ? n.getRightChild() : n.getLeftChild(), v, m, s);
            if (s) {
                r.rightContribution = r.rightContribution - minus;
            } else {
                r.leftContribution = r.leftContribution - minus;
            }
            m.put(n, r);
            return minus;
        }
    }

}
