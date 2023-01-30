package com.algorithm.entity.link;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(Integer x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}