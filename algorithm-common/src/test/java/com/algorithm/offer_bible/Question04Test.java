package com.algorithm.offer_bible;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question04Test {

    private Question04 question04 = new Question04();

    @Test
    public void canPermutePalindrome() {
        boolean tactcoa = question04.canPermutePalindrome("tactcoa");
        System.out.println(tactcoa);
    }
}