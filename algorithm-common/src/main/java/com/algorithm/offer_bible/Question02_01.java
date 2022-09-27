package com.algorithm.offer_bible;

import java.util.HashSet;
import java.util.Set;

public class Question02_01 {

    /**
     *todo: 9/24/22 6:49 PM 九师兄
     * 面试题 02.01. 移除重复节点
     *  https://leetcode.cn/problems/remove-duplicate-node-lcci/
     *
     * 自己也是一次搞定
     **/
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        Set<Integer> set = new HashSet<>();
        set.add(current.val);

        while (current.next != null){
            ListNode next = current.next;
            boolean add = set.add(next.val);
            if(!add){
                // 证明是有重复的 current  next  next
                current.next = next.next;
            }else {
                current = next;
            }
        }
        return head;
    }


    public ListNode removeDuplicateNodesv2(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> occurred = new HashSet<Integer>();
        occurred.add(head.val);
        ListNode pos = head;
        // 枚举前驱节点
        while (pos.next != null) {
            // 当前待删除节点
            ListNode cur = pos.next;
            if (occurred.add(cur.val)) {
                pos = pos.next;
            } else {
                pos.next = pos.next.next;
            }
        }
        pos.next = null;
        return head;
    }


    protected static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
