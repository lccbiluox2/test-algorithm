package com.algorithm.link.entity;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-06-03 22:40
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class Node {

    private Object data;//数据域
    private Node next;//指针域

    public Node(Object data){
        this.data = data;
    }

    public Node(Object data,Node next){
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}