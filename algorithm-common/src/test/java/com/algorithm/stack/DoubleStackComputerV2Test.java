package com.algorithm.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleStackComputerV2Test {

    @Test
    public void computing() {
        DoubleStackComputerV2 doubleStackComputer = new DoubleStackComputerV2();
        int computing = doubleStackComputer.computing("30+20*6-2".toCharArray());
        Assert.assertEquals(148,computing);
    }
}