package com.algorithm.type.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExpressionToCalculateTest {

    @Test
    public void getValue() {
        int value = ExpressionToCalculate.getValue("3*(4+2*(5-7)-34)+4");
        System.out.println(value);
    }
}