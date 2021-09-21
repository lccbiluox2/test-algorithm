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


    public void addByOrder(HeroNode newNode) {
        // 头节点不需要动
        HeroNode temp = head;
        boolean flag = false;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后
            if (temp.getNextNode() == null) {
                break;
            }
            if (temp.nextNode.no > newNode.no) {
                // 找到位置
                break;
            } else if (temp.nextNode.no == newNode.no) {
                // 变好存在
                flag = true;
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        if (flag) {
            System.out.println("数据已经存在当前序号的" + newNode.no);
        }else {
            // 当while结束的时候，temp就指向了最后的节点，将这个节点后面加上这个
            newNode.nextNode = temp.nextNode;
            temp.nextNode = newNode;
        }

    }

    public void update(HeroNode newHeroNode){
        if(head.nextNode == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.nextNode;
        // 表示是否找到这个节点
        boolean flag = false;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后，已经遍历完列表
            if (temp  == null) {
                break;
            }
            if (temp.no == newHeroNode.no) {
                // 找到位置
                flag = true;
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        if (flag) {
            System.out.println("数据已经存在当前序号的" + temp.no);
            temp.name = newHeroNode.name;
            temp.nickname = newHeroNode.nickname;
        }else {
            System.out.println("没有找到数据");
        }
    }


    public void delete(int  no){
        if(head.nextNode == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.nextNode;
        // 表示是否找到这个节点
        boolean flag = false;
        // 遍历链表找到最后
        while (true) {
            // 找到链表的最后，已经遍历完列表
            if (temp  == null) {
                break;
            }
            if (temp.nextNode.no == no) {
                // 找到位置
                flag = true;
                break;
            }
            // 如果没找到，将temp后移
            temp = temp.nextNode;
        }
        if (flag) {
            System.out.println("数据已经存在当前序号的" + temp.no);
            temp.nextNode = temp.nextNode.nextNode;
        }else {
            System.out.println("没有找到数据");
        }
    }

    public void list() {
        if (head.nextNode == null) {
            System.out.println("链表为空");
            return;
        }

        HeroNode temp = head.nextNode;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp.toString());
            temp = temp.nextNode;
        }
    }
}
