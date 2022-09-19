package com.algorithm.offer_bible;

import org.junit.Test;

import static org.junit.Assert.*;

public class Question04Test {

    private Question04 question04 = new Question04();

    @Test
    public void canPermutePalindrome() {
        boolean tactcoa = question04.canPermutePalindrome("tactcoa");
        System.out.println(tactcoa);
        tactcoa = question04.canPermutePalindrome("taat");
        System.out.println(tactcoa);
        tactcoa = question04.canPermutePalindrome("taBat");
        System.out.println(tactcoa);
        tactcoa = question04.canPermutePalindrome("taaat");
        System.out.println(tactcoa);
    }

    @Test
    public void canPermutePalindrome1() {
        boolean tactcoa = question04.canPermutePalindrome("aabbccc");
        System.out.println(tactcoa);
    }

    @Test
    public void canPermutePalindromev3() {
        boolean tactcoa = question04.canPermutePalindromev3("aabbccc");
        System.out.println(tactcoa);
    }

    @Test
    public void canPermutePalindromev4() {
        boolean tactcoa = question04.canPermutePalindromev4("aabbccc");
        System.out.println(tactcoa);
    }

}