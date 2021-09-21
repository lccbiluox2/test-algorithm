package com.algorithm.datastructure.link;

import lombok.Data;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-09-21 18:09
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
@Data
public class HeroNode {
    private int no;
    private String name;
    private String nickname;
    public HeroNode preNode;
    public HeroNode nextNode;

    public HeroNode(int no, String name, String nickname) {
        this.no = no;
        this.name = name;
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
