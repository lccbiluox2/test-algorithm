package com.algorithm.hot.code_021;

import com.algorithm.swordoffer.entity.ListNode;

public class MergeSortedLink {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode head = new ListNode(-1);
        ListNode currentHead = head;
        while (list1 != null) {
            if (list1.val < list2.val) {
                currentHead.next = list1;
                currentHead = currentHead.next;
                list1 = list1.next;
            } else if (list1.val > list2.val) {
                currentHead.next = list2;
                currentHead = currentHead.next;
                list2 = list2.next;
            } else {
                currentHead.next = list1;
                currentHead = currentHead.next;

                currentHead.next = list2;
                currentHead = currentHead.next;

                ListNode next = list1.next;
                System.out.println(next.val);
                ListNode next2 = list2.next;
                list1 = next;
                list2 = next2;
            }
        }
        if (list2 != null) {
            currentHead.next = list2;
        }
        return head;
    }

}
