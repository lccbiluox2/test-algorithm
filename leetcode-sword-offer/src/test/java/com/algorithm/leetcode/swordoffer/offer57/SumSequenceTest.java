package com.algorithm.leetcode.swordoffer.offer57;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumSequenceTest {

    SumSequence sumSequence = new SumSequence();

    @Test
    public void findContinuousSequence() {
        sumSequence.findContinuousSequence(10);
        sumSequence.findContinuousSequence(9);
        sumSequence.findContinuousSequence(15);
    }

    @Test
    public void findContinuousSequencev2() {
        sumSequence.findContinuousSequenceV2(9);
    }

    @Test
    public void findContinuousSequencev3() {
        sumSequence.findContinuousSequencev3(9);
    }




}