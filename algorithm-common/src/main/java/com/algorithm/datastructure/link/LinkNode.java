package com.algorithm.datastructure.link;

import lombok.Data;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 14:58
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
@Data
public class LinkNode {
    private int no;
    private String name;
    private LinkNode preNode;
    private LinkNode nextNode;
}
