package com.algorithm.offer_bible;

import com.algorithm.offer_bible.entity.ListNode;

import java.util.Stack;

public class Question02_03 {

    /**
     *todo: 9/25/22 3:41 PM 九师兄
     * 1        3           5           7           9
     * head                node         node.next   node.next.next
     **/
    public void deleteNode(ListNode node) {
        node.val=node.next.val;
        node.next=node.next.next;
    }

}
