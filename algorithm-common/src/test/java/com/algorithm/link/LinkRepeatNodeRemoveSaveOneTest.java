package com.algorithm.link;

import com.algorithm.entity.link.ListNode;
import com.algorithm.utils.LinkListUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkRepeatNodeRemoveSaveOneTest {

    private LinkRepeatNodeRemoveSaveOne linkRepeatNodeRemoveSaveOne = new LinkRepeatNodeRemoveSaveOne();

    /***
     * todo: 九师兄  2023/6/4 16:00
     * 测试结果：删除并且保留一个元素
     * 1->2->3->5->
     */
    @Test
    public void deleteDuplication() {
        int[] nums = new int[]{1,1,2,3,5};
        ListNode listNode1 = LinkListUtils.constructListNode(nums);

        ListNode listNode = linkRepeatNodeRemoveSaveOne.deleteDuplicationV1(listNode1);
        LinkListUtils.printLinkList(listNode);
    }

    /***
     * todo: 九师兄  2023/6/4 16:01
     * 测试点：测试删除重复元素
     * 但是本次测试发现了这个代码是有bug的如下
     * 1->1->2->3->5->
     */
    @Test
    public void deleteDuplicationV1_1() {
        int[] nums = new int[]{1,1,1,2,3,5};
        ListNode listNode1 = LinkListUtils.constructListNode(nums);

        ListNode listNode = linkRepeatNodeRemoveSaveOne.deleteDuplicationV1(listNode1);
        LinkListUtils.printLinkList(listNode);
    }

    /***
     * todo: 九师兄  2023/6/4 16:03
     * 结果如下
     * 1->2->3->5->
     */
    @Test
    public void deleteDuplicationV1_2() {
        int[] nums = new int[]{1,1,1,2,3,5};
        ListNode listNode1 = LinkListUtils.constructListNode(nums);

        ListNode listNode = linkRepeatNodeRemoveSaveOne.deleteDuplicationV1_2(listNode1);
        LinkListUtils.printLinkList(listNode);
    }

    /***
     * todo: 九师兄  2023/6/4 16:06
     * 测试点：测试删除重复节点优化版本
     * 1->2->3->5->
     * 1->1->2->3->5->
     * 这个也是有相同的bug的
     *
     * 1   1  1  2  3  5
     */
    @Test
    public void deleteDuplicationV2_1() {
        int[] nums = new int[]{1,1,2,3,5};
        ListNode head = LinkListUtils.constructListNode(nums);
        ListNode listNode = linkRepeatNodeRemoveSaveOne.deleteDuplicationV2_1(head);
        LinkListUtils.printLinkList(listNode);

        nums = new int[]{1,1,1,2,3,5};
        head = LinkListUtils.constructListNode(nums);

        listNode = linkRepeatNodeRemoveSaveOne.deleteDuplicationV2_1(head);
        LinkListUtils.printLinkList(listNode);
    }

    /***
     * todo: 九师兄  2023/6/4 16:15
     *
     * 可以看到测试的结果是正确的
     * 1->2->3->5->
     * 1->2->3->5->
     */
    @Test
    public void deleteDuplicationV2_2() {
        int[] nums = new int[]{1,1,2,3,5};
        ListNode head = LinkListUtils.constructListNode(nums);
        ListNode listNode = linkRepeatNodeRemoveSaveOne.deleteDuplicationV2_2(head);
        LinkListUtils.printLinkList(listNode);

        nums = new int[]{1,1,1,2,3,5};
        head = LinkListUtils.constructListNode(nums);

        listNode = linkRepeatNodeRemoveSaveOne.deleteDuplicationV2_2(head);
        LinkListUtils.printLinkList(listNode);
    }
}