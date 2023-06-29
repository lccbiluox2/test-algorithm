package com.algorithm.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackMinApiV1Test {

    private  StackMinApiV1 stackMinApi = new  StackMinApiV1();
    @Test
    public void push() {
        stackMinApi.push(1);
        stackMinApi.push(2);
        int min = stackMinApi.min();
        int top = stackMinApi.top();
        stackMinApi.pop();
        stackMinApi.push(1);
        top = stackMinApi.top();
        min = stackMinApi.min();
    }
}