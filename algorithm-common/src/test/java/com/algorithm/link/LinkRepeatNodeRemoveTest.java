package com.algorithm.link;

import com.algorithm.entity.link.ListNode;
import com.algorithm.utils.LinkListUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkRepeatNodeRemoveTest {

    private LinkRepeatNodeRemove linkRepeatNodeRemove = new LinkRepeatNodeRemove();


    /***
     * todo: 九师兄  2023/6/4 16:33
     *
     * 【算法】删除有序链表中的重复元素、不保留重复节点
     * https://blog.csdn.net/qq_21383435/article/details/131034047
     * 1->2->5->
     * 1->2->
     */
    @Test
    public void deleteDuplicationV1_1() {
        int[] nums = new int[]{1,2,3,3,3,5};
        ListNode head = LinkListUtils.constructListNode(nums);

        ListNode listNode = linkRepeatNodeRemove.deleteDuplicationV1_1(head);
        LinkListUtils.printLinkList(listNode);

        nums = new int[]{1,2,3,3,3,3};
        head = LinkListUtils.constructListNode(nums);
        listNode = linkRepeatNodeRemove.deleteDuplicationV1_1(head);
        LinkListUtils.printLinkList(listNode);
    }


    /***
     * todo: 九师兄  2023/6/4 17:06
     *
     * 1->2->5->
     * 1->2->
     * 可以看到结果正确
     */
    @Test
    public void deleteDuplicationV2_1() {
        int[] nums = new int[]{1,2,3,3,3,5};
        ListNode head = LinkListUtils.constructListNode(nums);

        ListNode listNode = linkRepeatNodeRemove.deleteDuplicationV2_1(head);
        LinkListUtils.printLinkList(listNode);

        nums = new int[]{1,2,3,3,3,3};
        head = LinkListUtils.constructListNode(nums);
        listNode = linkRepeatNodeRemove.deleteDuplicationV2_1(head);
        LinkListUtils.printLinkList(listNode);
    }

}