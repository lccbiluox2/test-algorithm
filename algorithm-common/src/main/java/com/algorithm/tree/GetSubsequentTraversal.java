package com.algorithm.tree;

/**
 *todo: 2023/2/8 21:50 九师兄
 * 【算法】二叉树根据先序遍历、中序遍历获取后续遍历
 *  https://blog.csdn.net/qq_21383435/article/details/128943515
 **/
public class GetSubsequentTraversal {

    public static int[] getPostArray(int[] pre, int[] in) {
        if (pre == null) {
            return null;
        }
        int N = pre.length;
        int[] pos = new int[N];
        set(pre, in, pos, 0, N - 1, 0, N - 1, 0, N - 1);
        return pos;
    }


    // 利用pre[prei...prej] 结合 in[ini. ..inj]
    // 填写好pos[posi. . .posj]
    public static void set(int[] pre, int[] in, int[] pos,
                           int prei, int prej,
                           int ini, int inj,
                           int posi, int posj) {
        if (prei > prei) {
            return;
        }
        if (prei == prej) {//只剩下一个数了，直接填
            pos[posi] = pre[prei];
        }
        // 先序遍历的第一个位置 一定是 后续遍历的最后一个位置
        pos[posj] = pre[prei];
        // 这一点是找a的位置
        int find = ini;
        for (; find <= inj; find++) {
            if (in[find] == pre[prei]) {
                break;
            }
        }
        // in ini..find-1 find+1...ini
        // 左子树
        set(pre, in, pos,
                // prei 是先序遍历的第一个位置   prei + 1 就是 【标记A】 的位置
                // find 是a的位置，find - ini 是【标记B】数组的长度  prei + find - ini 是 【标记A】 数组的结束位置
                prei + 1, prei + find - ini,
                // 对于中序遍历 ini 是【标记B】数组起始位置，find - 1 是【标记B】数组结束位置
                ini, find - 1,
                // 要填写的数据是后续遍历 从 posi 往后推的一小段数组的大小
                posi, posi + find - ini - 1);
        // 右子树
        set(pre, in, pos, prei + find - ini + 1,
                prej, find + 1, inj, posi + find - ini,
                posj - 1);
    }
}
