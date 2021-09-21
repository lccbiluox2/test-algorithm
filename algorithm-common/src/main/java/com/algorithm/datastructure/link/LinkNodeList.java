package com.algorithm.datastructure.link;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 14:59
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class LinkNodeList {
    private LinkNode header = new LinkNode();

    public LinkNodeList() {
        header.setName("header");
    }

    public void addNode(String name, int id) {
        LinkNode linkNode = new LinkNode();
        linkNode.setName(name);
        linkNode.setNo(id);

        LinkNode lastNode = getLastNode(header);
        lastNode.setNextNode(linkNode);
    }


    private LinkNode getLastNode(LinkNode next) {
        LinkNode nextItem = next.getNextNode();
        if (nextItem == null) {
            return next;
        }
        return getLastNode(nextItem);
    }

    public int get(String name) {
        LinkNode lastNode = getLastNodeByName(header, name);
        return lastNode.getNo();
    }

    private LinkNode getLastNodeByName(LinkNode next, String name) {
        LinkNode nextItem = next.getNextNode();
        if (nextItem == null) {
            return null;
        }
        String linkName = nextItem.getName();
        if (linkName.equals(name)) {
            return nextItem;
        }
        return getLastNodeByName(nextItem, name);
    }


    public void printDetail() {
        if (header.getNextNode() == null) {
            System.out.println("链表为空");
            return;
        }
        printNextNode(header.getNextNode());
    }

    private void printNextNode(LinkNode nextNode) {
        if (nextNode == null) {
            return;
        }
        System.out.print(nextNode.getName() + " -> ");
        nextNode = nextNode.getNextNode();
        printNextNode(nextNode);
    }
}
