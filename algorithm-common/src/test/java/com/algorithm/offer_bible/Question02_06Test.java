package com.algorithm.offer_bible;

import cn.hutool.core.lang.Assert;
import com.algorithm.offer_bible.entity.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question02_06Test {

    private Question02_06 question02_06 = new Question02_06();

    @Test
    public void isPalindrome() {
        ListNode head = new ListNode(0);
        ListNode A = new ListNode(0);

        head.next = A;

        boolean palindrome = question02_06.isPalindrome(head);
        Assert.isTrue(true);
    }

    @Test
    public void isPalindrome1() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(0);
        ListNode B = new ListNode(1);

        head.next = A;
        A.next = B;

        boolean palindrome = question02_06.isPalindrome(head);
        Assert.isTrue(palindrome);
    }

    @Test
    public void isPalindrome2() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(0);
        ListNode B = new ListNode(0);

        head.next = A;
        A.next = B;

        boolean palindrome = question02_06.isPalindrome(head);
        Assert.isFalse(palindrome);
    }


    @Test
    public void isPalindromev2_1() {
        ListNode head = new ListNode(-129);
        ListNode A = new ListNode(-129);

        head.next = A;

        boolean palindrome = question02_06.isPalindromeV2(head);
        Assert.isTrue(palindrome);
    }

    @Test
    public void isPalindromev2_2() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(0);
        ListNode B = new ListNode(1);

        head.next = A;
        A.next = B;

        boolean palindrome = question02_06.isPalindromeV2(head);
        Assert.isTrue(palindrome);
    }

    @Test
    public void isPalindromev2_3() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(0);
        ListNode B = new ListNode(0);

        head.next = A;
        A.next = B;

        boolean palindrome = question02_06.isPalindromeV2(head);
        Assert.isFalse(palindrome);
    }

    @Test
    public void isPalindromev2_4() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(3);
        ListNode B = new ListNode(4);
        ListNode C = new ListNode(4);
        ListNode D = new ListNode(1);

        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;

        boolean palindrome = question02_06.isPalindromeV2(head);
        Assert.isFalse(palindrome);
    }

    @Test
    public void isPalindromev3_1() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(3);
        ListNode B = new ListNode(4);
        ListNode C = new ListNode(4);
        ListNode D = new ListNode(1);

        head.next = A;
        A.next = B;
        B.next = C;
        C.next = D;

        boolean palindrome = question02_06.isPalindromeV3(head);
        Assert.isFalse(palindrome);
    }

    @Test
    public void isPalindromev3_2() {
        ListNode head = new ListNode(-129);
        ListNode A = new ListNode(-129);

        head.next = A;

        boolean palindrome = question02_06.isPalindromeV3(head);
        Assert.isTrue(palindrome);
    }

    @Test
    public void isPalindromev4_1() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(2);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(1);

        head.next = A;
        A.next = B;
        B.next = C;

        boolean palindrome = question02_06.isPalindromev4(head);
        Assert.isTrue(palindrome);
    }

    @Test
    public void isPalindromev5_1() {
        ListNode head = new ListNode(1);
        ListNode A = new ListNode(2);
        ListNode B = new ListNode(2);
        ListNode C = new ListNode(1);

        head.next = A;
        A.next = B;
        B.next = C;

        boolean palindrome = question02_06.isPalindromev5(head);
        Assert.isTrue(palindrome);
    }
}