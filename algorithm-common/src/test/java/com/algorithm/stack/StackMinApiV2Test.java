package com.algorithm.stack;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackMinApiV2Test {

    public StackMinApiV2 stackMinApi = new StackMinApiV2();

    /**
     * todo: 2023/6/29 22:45 九师兄
     *
     * ["PSH2","PSH3","PSH6","PSH2","PSH4","PSH5","POP","POP","POP","MIN"]
     **/
    @Test
    public void push() {
        stackMinApi.push(2);
        stackMinApi.push(3);
        stackMinApi.push(6);
        stackMinApi.push(2);
        stackMinApi.push(4);
        stackMinApi.push(5);
         stackMinApi.pop();
        stackMinApi.pop();
        stackMinApi.pop();
       stackMinApi.min();

    }
}