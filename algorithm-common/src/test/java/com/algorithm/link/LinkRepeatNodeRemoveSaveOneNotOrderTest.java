package com.algorithm.link;

import com.algorithm.entity.link.ListNode;
import com.algorithm.utils.LinkListUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkRepeatNodeRemoveSaveOneNotOrderTest {

    private LinkRepeatNodeRemoveSaveOneNotOrder listNotOrder = new LinkRepeatNodeRemoveSaveOneNotOrder();

    /***
     * todo: 九师兄  2023/6/4 18:13
     * 测试点：测试无序链表中去除重复元素
     * 1->2->4->3->5->
     */
    @Test
    public void deleteDuplicationV1() {
        int[] nums = new int[]{1,1,2,4,3,1,5};
        ListNode listNode1 = LinkListUtils.constructListNode(nums);

        ListNode listNode = listNotOrder.deleteDuplicationV1(listNode1);
        LinkListUtils.printLinkList(listNode);

    }
}