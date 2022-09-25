package com.algorithm.offer_bible;

import com.algorithm.offer_bible.entity.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *todo: 9/25/22 10:36 PM 九师兄
 * 巧算：https://leetcode.cn/problems/intersection-of-two-linked-lists-lcci/submissions/
 * https://www.bilibili.com/video/BV1oZ4y1c73R/?spm_id_from=333.337.search-card.all.click&vd_source=44c491a7c7c735ef8081cb60288bb47e
 **/
public class Question02_07 {


    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode h1 = headA;
        ListNode h2 = headB;
        while (h1 != h2){
            h1 = (h1 == null) ? headB: h1.next;
            h2 = (h2 == null) ? headA: h2.next;
        }
        return h1;
    }
}
