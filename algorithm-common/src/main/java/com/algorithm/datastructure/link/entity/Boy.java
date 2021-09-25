package com.algorithm.datastructure.link.entity;

import lombok.Data;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-23 21:51
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
@Data
public class Boy {
    public int no;
    public Boy next;

    public Boy() {
    }

    public Boy(int i) {
        this.no = i;
    }
}
