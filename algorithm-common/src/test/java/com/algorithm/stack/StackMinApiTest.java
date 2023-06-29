package com.algorithm.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackMinApiTest {

    private StackMinApi stackMinApi = new StackMinApi();

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


    /**
     * todo: 2023/6/29 22:06 九师兄
     *
     * ["PSH1","PSH0","PSH-3","MIN","POP","TOP","MIN"]
     **/
    @Test
    public void push1() {
        stackMinApi.push(1);
        stackMinApi.push(0);
        stackMinApi.push(-3);
        int min = stackMinApi.min();
        stackMinApi.pop();
        stackMinApi.pop();
        min = stackMinApi.min();
    }
}