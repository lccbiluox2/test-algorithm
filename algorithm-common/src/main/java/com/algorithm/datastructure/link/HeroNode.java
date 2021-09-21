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
public class HeroNode implements Cloneable {
    public int no;
    public String name;
    public String nickname;
    public HeroNode preNode;
    public HeroNode nextNode;

    public HeroNode() {
    }

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

    @Override
    protected HeroNode clone() {
        HeroNode heroNode = new HeroNode();
        heroNode.setNo(this.getNo());
        heroNode.setName(this.getName());
        heroNode.setNickname(this.getNickname());
        return heroNode;
    }
}
