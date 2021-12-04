package com.algorithm.leetcode.swordoffer.entity;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-04 18:14
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Node {

    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }

}
