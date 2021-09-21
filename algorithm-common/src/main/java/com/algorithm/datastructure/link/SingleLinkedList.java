package com.algorithm.datastructure.link;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 17:53
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class SingleLinkedList {


    private HeroNode head = new HeroNode(0, "", "");

    public void add(HeroNode newNode) {
        // 头节点不需要动
        HeroNode temp = head;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后
            if (temp.getNextNode() == null) {
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        // 当while结束的时候，temp就指向了最后的节点，将这个节点后面加上这个
        temp.nextNode = newNode;
    }

    public void list(){
        if(head.nextNode == null){
            System.out.println("链表为空");
            return;
        }

        HeroNode temp = head.nextNode;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp.toString());
            temp = temp.nextNode;
        }
    }
}
