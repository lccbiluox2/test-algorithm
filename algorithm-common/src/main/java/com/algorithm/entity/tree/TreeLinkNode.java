package com.algorithm.entity.tree;

import lombok.Data;

@Data
public class TreeLinkNode {

    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null; // 指向父结点的指针

    TreeLinkNode(int val) {
        this.val = val;
    }
}
