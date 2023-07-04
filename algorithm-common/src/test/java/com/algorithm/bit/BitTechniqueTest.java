package com.algorithm.bit;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitTechniqueTest {

    private BitTechnique bitTechnique = new BitTechnique();

    @Test
    public void bitRule() {
        bitTechnique.bitRule();
    }

    /***
     * todo: 九师兄  2023/7/4 21:23
     * 0010
     * 0021
     */
    @Test
    public void hammingDistance() {
        int i = bitTechnique.hammingDistance(2, 3);
        System.out.println(i);
    }

    @Test
    public void hammingDistanceV1() {
        int i = bitTechnique.hammingDistanceV1(2, 3);
        System.out.println(i);
    }

    @Test
    public void hammingDistanceV2() {
        int i = bitTechnique.hammingDistanceV2(2, 3);
        System.out.println(i);
    }

    /***
     * todo: 九师兄  2023/7/4 21:31
     *
     * 数组中唯一一个不重复的元素
     *
     */
    @Test
    public void singleNumber() {
        int[] arr = new int[]{2,2,3};
        int i = bitTechnique.singleNumber(arr);
        System.out.println(i);
    }

}