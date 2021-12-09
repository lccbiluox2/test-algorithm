package com.algorithm.leetcode.swordoffer.offer61;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-09 17:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class PlayingCardsTest {

    private PlayingCards client = new PlayingCards();

    @Test
    public void isStraight() {
        int[] data = new int[]{1,2,3,4,5};
        boolean straight = client.isStraight(data);
        System.out.println(straight);
    }

    @Test
    public void isStraight1() {
        int[] data = new int[]{0,0,1,2,5};
        boolean straight = client.isStraight(data);
        System.out.println(straight);
    }

    /**
     * 1 1 1 1 = 4
     */
    @Test
    public void isStraight2_1() {
        int[] data = new int[]{1,2,3,4,5};
        boolean straight = client.isStraight2(data);
        System.out.println(straight);
    }

    /**
     * 0 1 1 3 = 5
     */
    @Test
    public void isStraight2_2() {
        int[] data = new int[]{0,0,1,2,5};
        boolean straight = client.isStraight2(data);
        System.out.println(straight);
    }

    /**
     * 1,1,1,2 = 5
     */
    @Test
    public void isStraight2_3() {
        int[] data = new int[]{0,1,2,3,5};
        boolean straight = client.isStraight2(data);
        System.out.println(straight);
    }

    /**
     * -4 1 1 -3 = -5
     * 4  1 1  3 = 5
     *
     * 5,4,3,1,0
     * -1 -1 -2 -1
     */
    @Test
    public void isStraight2_4() {
        int[] data = new int[]{5,1,2,3,0};
        boolean straight = client.isStraight2(data);
        System.out.println(straight);
    }

    /**
     * 0 2 0 3
     */
    @Test
    public void isStraight2_5() {
        int[] data = new int[]{0,0,2,2,5};
        boolean straight = client.isStraight2(data);
        System.out.println(straight);
    }

    /**
     * -3 5 -6 9 = 5'/
     */
    @Test
    public void isStraight2_6() {
        int[] data = new int[]{4,1,6,0,9};
        boolean straight = client.isStraight2(data);
        System.out.println(straight);
    }

    @Test
    public void isStraight3_1() {
        int[] data = new int[]{0,0,1,2,6};
        boolean straight = client.isStraight3(data);
        System.out.println(straight);
    }
}