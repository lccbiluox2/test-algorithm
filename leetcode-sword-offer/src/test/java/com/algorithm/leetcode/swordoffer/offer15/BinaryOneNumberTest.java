package com.algorithm.leetcode.swordoffer.offer15;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinaryOneNumberTest {


    BinaryOneNumber binaryOneNumber = new BinaryOneNumber();

    @Test
    public void hammingWeight() {
        int i = binaryOneNumber.hammingWeight(3);
        binaryOneNumber.hammingWeight(4);
        binaryOneNumber.hammingWeight(8);
        binaryOneNumber.hammingWeight(1);
    }
}