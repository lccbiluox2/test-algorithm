package com.algorithm.swordoffer.entity;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 10:35
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}