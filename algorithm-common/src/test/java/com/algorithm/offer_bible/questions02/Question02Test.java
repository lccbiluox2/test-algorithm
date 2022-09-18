package com.algorithm.offer_bible.questions02;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Question02Test {

    private Question02 question02 = new Question02();

    @Test
    public void checkPermutation() {
        boolean b = question02.CheckPermutation("abb", "aab");
        Assert.assertEquals(b,false);
    }

    @Test
    public void checkPermutationv2() {
        boolean b = question02.CheckPermutationv2("abb", "aab");
        Assert.assertEquals(b,false);
    }
}