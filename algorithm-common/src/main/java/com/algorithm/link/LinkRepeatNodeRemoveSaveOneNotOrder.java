package com.algorithm.link;

import com.algorithm.entity.link.ListNode;

import java.util.HashSet;
import java.util.Set;

/***
 * todo: 九师兄  2023/6/4 16:30
 *
 * 【算法】删除无序链表中的重复元素、保留重复节点的一个
 * https://blog.csdn.net/qq_21383435/article/details/131033201
 */
public class LinkRepeatNodeRemoveSaveOneNotOrder {

    /***
     * todo: 九师兄  2023/6/4 13:46
     *
     * 存在一个无序排列的链表，给你这个链表的头节点 head，请你删除所有重复的元素，
     * `使每个元素 只出现一次`。
     *
     */
    public ListNode deleteDuplicationV1(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        Set<Integer> values = new HashSet<>();
        values.add(pHead.val);
        ListNode current = pHead;
        while (current != null) {
            ListNode next = current.next;
            if (next == null) break; // 如果没有后续 不需要对比了
            if(!values.add(next.val)){
                current.next = next.next;
            }
            current = next;
        }
        return pHead;
    }

}
