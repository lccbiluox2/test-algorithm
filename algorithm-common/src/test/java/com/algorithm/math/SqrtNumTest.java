package com.algorithm.math;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqrtNumTest {

    private SqrtNum sqrtNum = new SqrtNum();

    @Test
    public void mySqrt() {
        int i = sqrtNum.mySqrt(8);
        Assert.assertEquals(2,i);
    }
}