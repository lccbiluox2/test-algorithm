package com.algorithm.offer_bible;

import com.algorithm.offer_bible.entity.ListNode;

import java.util.*;

public class Question02_06 {


    /**
     *todo: 9/25/22 7:03 PM 九师兄
     * 想使用set去重 先一直往里面加入，如果遇到重复的 证明可能开始循环了
     * 最后比较重复的和不重复的就行了
     * 但是后来测试发现不可以
     **/
    public boolean isPalindrome(ListNode head) {
        if(head == null){
            return true;
        }
        if(head.next == null){
            return true;
        }

        Set<Integer> union = new HashSet<>();
        ListNode lastNode = head;
        int unionCount = 0;
        int repeatCount = 0;
        while (lastNode != null){
            boolean add = union.add(lastNode.val);
            if(add){
                // 正在一直加入的时候，重复的应该为0
                if(repeatCount != 0){
                    return false;
                }
                unionCount++;
            }else {
                if(unionCount < 1){
                    return false;
                }
                repeatCount++;
            }
            lastNode = lastNode.next;
        }
        int count = unionCount + repeatCount;
        if(count % 2 !=0 && (unionCount==repeatCount+1)){
            return true;
        }
        // 如果能回文  那么一定是一样的数据量
        return unionCount == repeatCount;
    }


    /**
     *todo: 9/25/22 7:04 PM 九师兄
     * 因为上面不可以，所以我想试试链表 包含的时候去除 但是发现也不行
     **/
    public boolean isPalindromeV2(ListNode head) {
        if(head == null){
            return true;
        }
        if(head.next == null){
            return true;
        }

        List<Integer> union = new ArrayList<>();
        ListNode lastNode = head;
        while (lastNode != null){

            if(union.isEmpty()){
                union.add(lastNode.val);
            }else {
                if(union.contains(lastNode.val)){
                    union.remove((Object)lastNode.val);
                }else {
                    union.add(lastNode.val);
                }
            }
            lastNode = lastNode.next;
        }
       if(union.isEmpty()){
           return true;
       }
        if(union.size() == 1 ){
            return true;
        }
       return false;
    }

    /**
     *todo: 9/25/22 7:12 PM 九师兄
     * 数组的双指针 参考 https://leetcode.cn/problems/palindrome-linked-list-lcci/solution/hui-wen-lian-biao-by-leetcode-solution-6cp3/
     **/
    public boolean isPalindromeV3(ListNode head) {
        if(head == null){
            return true;
        }
        if(head.next == null){
            return true;
        }

        List<Integer> list = new ArrayList<>();
        ListNode lastNode = head;
        while (lastNode != null){
            list.add(lastNode.val);
            lastNode = lastNode.next;
        }
        int last = list.size() -1;
        int start = 0;
        while (start < last){
            Integer beforeValue = list.get(start);
            Integer lastValue = list.get(last);
            if(beforeValue.intValue() == lastValue.intValue()){
                start++;
                last--;
            }else {
                return false;
            }

        }
        return true;
    }

    private ListNode frontPointer;

    private boolean recursivelyCheck(ListNode currentNode) {
        if (currentNode != null) {
            if (!recursivelyCheck(currentNode.next)) {
                return false;
            }
            if (currentNode.val != frontPointer.val) {
                return false;
            }
            frontPointer = frontPointer.next;
        }
        return true;
    }

    public boolean isPalindromev4(ListNode head) {
        frontPointer = head;
        return recursivelyCheck(head);
    }



    /**
     *todo: 9/25/22 8:37 PM 九师兄
     * 快慢指针
     **/
    public boolean isPalindromev5(ListNode head) {
        if (head == null) {
            return true;
        }

        // 找到前半部分链表的尾节点并反转后半部分链表
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        // 判断是否回文
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 还原链表并返回结果
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}
