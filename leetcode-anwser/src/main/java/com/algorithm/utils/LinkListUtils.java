package com.algorithm.utils;


import com.algorithm.swordoffer.entity.ListNode;

public class LinkListUtils {

    public static ListNode constructListNode(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        ListNode dummyNode = new ListNode(-1);
        ListNode preNode = dummyNode;
        for (int i = 0; i < numbers.length; i++) {
            ListNode currNode = new ListNode(numbers[i]);
            preNode.next = currNode;
            preNode = preNode.next;
        }

        return dummyNode.next;
    }

    public static void printList(ListNode list1) {
        if(list1 == null) return;
        ListNode head = list1;
        while (head != null ){
            System.out.print(head.val);
            head = head.next;
        }
        System.out.println();
    }
}
