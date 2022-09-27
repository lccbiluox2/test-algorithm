package com.algorithm.offer_bible;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question02_01Test {

    private Question02_01 question02_01 = new Question02_01();

    @Test
    public void removeDuplicateNodes() {
        Question02_01.ListNode head = new Question02_01.ListNode(1);
        Question02_01.ListNode A = new Question02_01.ListNode(2);
        Question02_01.ListNode B = new Question02_01.ListNode(3);
        Question02_01.ListNode C = new Question02_01.ListNode(3);
        Question02_01.ListNode D = new Question02_01.ListNode(2);
        Question02_01.ListNode E = new Question02_01.ListNode(1);

        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;

        Question02_01.ListNode listNode = question02_01.removeDuplicateNodes(head);
        System.out.println(listNode);
    }
}