package com.algorithm.book.wangTwo.title_007;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseNumTest {

    private  ReverseNum reverseNum = new ReverseNum();

    @Test
    public void reverseNumber() {
        Integer integer = reverseNum.reverse(10234);
        System.out.println(integer);
    }
}