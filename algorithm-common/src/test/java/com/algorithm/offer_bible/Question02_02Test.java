package com.algorithm.offer_bible;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question02_02Test {

    private Question02_02 question02 = new Question02_02();

    @Test
    public void kthToLast() {

        Question02_02.ListNode head = new Question02_02.ListNode(1);
        Question02_02.ListNode A = new Question02_02.ListNode(2);
        Question02_02.ListNode B = new Question02_02.ListNode(3);
        Question02_02.ListNode C = new Question02_02.ListNode(4);
        Question02_02.ListNode D = new Question02_02.ListNode(5);
//        Question02_02.ListNode E = new Question02_02.ListNode(6);

        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;
//        D.next = E;

        int i = question02.kthToLast(head, 2);
        System.out.println(i);
    }

    @Test
    public void kthToLast1() {

        Question02_02.ListNode head = new Question02_02.ListNode(1);
        Question02_02.ListNode A = new Question02_02.ListNode(2);

        head.next = A;

        int i = question02.kthToLast(head, 1);
        System.out.println(i);
    }


    @Test
    public void kthToLastv2() {


        Question02_02.ListNode head = new Question02_02.ListNode(9);
        Question02_02.ListNode A = new Question02_02.ListNode(0);
        Question02_02.ListNode B = new Question02_02.ListNode(3);
        Question02_02.ListNode C = new Question02_02.ListNode(8);
        Question02_02.ListNode D = new Question02_02.ListNode(7);
        Question02_02.ListNode E = new Question02_02.ListNode(3);
        Question02_02.ListNode F = new Question02_02.ListNode(8);
        Question02_02.ListNode G = new Question02_02.ListNode(6);
        Question02_02.ListNode H = new Question02_02.ListNode(3);
        Question02_02.ListNode J = new Question02_02.ListNode(1);

        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;
        D.next = E;
        E.next = F;
        F.next = G;
        G.next = H;
        H.next = J;


        int i = question02.kthToLast(head, 10);
        System.out.println(i);
    }


    @Test
    public void kthToLast02() {


        Question02_02.ListNode head = new Question02_02.ListNode(9);
        Question02_02.ListNode A = new Question02_02.ListNode(0);
        Question02_02.ListNode B = new Question02_02.ListNode(3);
        Question02_02.ListNode C = new Question02_02.ListNode(8);
        Question02_02.ListNode D = new Question02_02.ListNode(7);
        Question02_02.ListNode E = new Question02_02.ListNode(3);
        Question02_02.ListNode F = new Question02_02.ListNode(8);
        Question02_02.ListNode G = new Question02_02.ListNode(6);
        Question02_02.ListNode H = new Question02_02.ListNode(3);
        Question02_02.ListNode J = new Question02_02.ListNode(1);

        head.next = A; A.next = B;B.next = C; C.next = D;
        D.next = E;E.next = F; F.next = G;G.next = H;
        H.next = J;

        int i = question02.kthToLastv2(head, 10);
        System.out.println(i);
    }

    @Test
    public void kthToLastV3() {


        Question02_02.ListNode head = new Question02_02.ListNode(9);
        Question02_02.ListNode A = new Question02_02.ListNode(0);
        Question02_02.ListNode B = new Question02_02.ListNode(3);
        Question02_02.ListNode C = new Question02_02.ListNode(8);
        Question02_02.ListNode D = new Question02_02.ListNode(7);
        Question02_02.ListNode E = new Question02_02.ListNode(3);
        Question02_02.ListNode F = new Question02_02.ListNode(8);
        Question02_02.ListNode G = new Question02_02.ListNode(6);
        Question02_02.ListNode H = new Question02_02.ListNode(3);
        Question02_02.ListNode J = new Question02_02.ListNode(1);

        head.next = A; A.next = B;B.next = C; C.next = D;
        D.next = E;E.next = F; F.next = G;G.next = H;
        H.next = J;

        int i = question02.kthToLastV3(head, 10);
        System.out.println(i);
    }

}