package com.algorithm.hot.code_021;

import com.algorithm.swordoffer.entity.ListNode;
import com.algorithm.utils.LinkListUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedLinkTest {

    private  MergeSortedLink mergeSortedLink = new MergeSortedLink();

    @Test
    public void mergeTwoLists() {
        ListNode list1 =LinkListUtils.constructListNode(new int[]{1,2,4});
        ListNode list2 = LinkListUtils.constructListNode(new int[]{1,3,4});
        LinkListUtils.printList(list1);
        LinkListUtils.printList(list2);

        ListNode listNode = mergeSortedLink.mergeTwoLists(list1, list2);
        LinkListUtils.printList(listNode);
    }
}