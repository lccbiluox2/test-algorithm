package com.algorithm.link;

import com.algorithm.entity.link.ListNode;

/***
 * todo: 九师兄  2023/6/4 16:30
 *
 * 【算法】删除有序链表中的重复元素、保留重复节点的一个
 * https://blog.csdn.net/qq_21383435/article/details/131033201
 */
public class LinkRepeatNodeRemoveSaveOne {

    /***
     * todo: 九师兄  2023/6/4 13:46
     *
     * 存在一个按升序排列的链表，给你这个链表的头节点 head，请你删除所有重复的元素，`使每个元素 只出现一次`。
     *
     * 我这种是去重，但是保留重复的节点
     */
    public ListNode deleteDuplicationV1(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode current = pHead;
        while (current != null) {
            ListNode next = current.next;
            if (next == null) break; // 如果没有后续 不需要对比了
            //  原本是 A -> B1 -> B2 -> C
            // 现在要 A -> B2 -> C 然后 current 调到B2
            if (next.val == current.val) {
                current.next = next.next;
                current = next.next;
            } else {
                current = next;
            }
        }
        return pHead;
    }

    /***
     * todo: 九师兄  2023/6/4 15:55
     *
     * 存在一个按升序排列的链表，给你这个链表的头节点 head，请你删除所有重复的元素，`使每个元素 只出现一次`。
     *
     */
    public ListNode deleteDuplicationV1_2(ListNode pHead) {
        if (pHead == null || pHead.next == null) {
            return pHead;
        }
        ListNode current = pHead;
        while (current != null) {
            ListNode next = current.next;
            if (next == null) break; // 如果没有后续 不需要对比了
            //  原本是 A -> B1 -> B2  -> B3 -> C
            // 现在要 A  -> C 然后 current 调到B3
            if (next.val == current.val) {
                ListNode same = current;
                while (true) {
                    ListNode sameNext = same.next;
                    // same的下一个节点为空
                    if (sameNext == null) {
                        current.next = sameNext;
                        current = same;
                        break;
                    }
                    if (sameNext.val != same.val) {
                        current.next = sameNext;
                        current = same;
                        break;
                    } else {
                        same = same.next;
                    }
                }
            } else {
                current = next;
            }
        }
        return pHead;
    }

    /***
     * todo: 九师兄  2023/6/4 16:07
     *
     * 设计思路
     * 假设数据是 A1 A2 A3 A4 B1 B2 C
     * 当前 currentNode = A1 currentNode.next = A2
     * 然后判断这个前后节点的数据是否相等，如果相同，那么跳过或者删除这个节点
     * 否则当前节点往后移动一个节点继续判断
     */
    public ListNode deleteDuplicationV2_1(ListNode pHead) {
        ListNode currentNode = pHead;
        while (currentNode != null) {
            //  1   1  1  2  3  5
            if (currentNode.next != null && currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            }
            currentNode = currentNode.next;
        }
        return pHead;
    }

    public ListNode deleteDuplicationV2_2(ListNode pHead) {
        ListNode currentNode = pHead;
        while (currentNode != null) {
            //  1   1  1  2  3  5
            if (currentNode.next != null && currentNode.val == currentNode.next.val) {
                currentNode.next = currentNode.next.next;
            }else {
                // 以前是相等我们就跳，现在改成只要不相等才跳，那么上面的代码在循环中的表现
                // 就是如果发现重复数据，就一直在删除数据
                currentNode = currentNode.next;
            }
        }
        return pHead;
    }


}
