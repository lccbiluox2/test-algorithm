package com.algorithm.stack;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DoubleStackComputerV3Test {

    @Test
    public void computing1() {
        DoubleStackComputerV3 doubleStackComputer = new DoubleStackComputerV3();
        int computing = doubleStackComputer.computing("30*2/6-2".toCharArray());
        Assert.assertEquals(8,computing);
    }
}