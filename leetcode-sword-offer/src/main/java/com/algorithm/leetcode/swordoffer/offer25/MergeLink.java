package com.algorithm.leetcode.swordoffer.offer25;

import com.algorithm.leetcode.swordoffer.entity.ListNode;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-28 11:17
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:  剑指 Offer 25. 合并两个排序的链表
 */
public class MergeLink {

    /**
     * 输入：1->2->4, 1->3->4
     * 输出：1->1->2->3->4->4
     *
     * 输入：1->2->4->5->6, 3->4
     * 输出：1->2->3->4->4->5->6
     *
     * 输入：1->2, 2->4->5->6
     * 输出：1->2->2->4->5->6
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode temp = head;
        while (l1 != null || l2 != null) {
            // 这里为了防止l2的链表在比较完毕l1之后，还有剩余，剩余的部分，要直接放到结果的尾部
            if(l1 == null){
                temp.next = l2;
                break;
            }
            // 这里为了防止l1的链表在比较完毕l2之后，还有剩余，剩余的部分，要直接放到结果的尾部
            if(l2 == null){
                temp.next = l1;
                break;
            }

            // 如果l1的值小于l2的值，那么证明l1的小，要取这个值
            if(l1.val < l2.val){
                temp.next = l1;
                // l1 往下走 l2 不动
                l1 = l1.next;
            }else {
                // 如果l2的值小于等于l1的值，那么证明l2的小，要取这个值
                temp.next = l2;
                // l1 不动  l2 往下走
                l2 = l2.next;
            }
            // 临时指针往下走
            temp =  temp.next;
        }
        return head.next;
    }


    public ListNode mergeTwoLists1(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        if (l1.val <= l2.val) {
            l1.next = mergeTwoLists1(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists1(l1, l2.next);
            return l2;
        }
    }



}
