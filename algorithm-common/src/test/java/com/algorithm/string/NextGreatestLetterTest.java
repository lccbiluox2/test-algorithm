package com.algorithm.string;

import org.junit.Test;

import static org.junit.Assert.*;

public class NextGreatestLetterTest {

    private NextGreatestLetter nextGreatestLetter = new NextGreatestLetter();

    @Test
    public void nextGreatestLetterV1() {
        char[] letters = "xxyy".toCharArray();

        char z = nextGreatestLetter.nextGreatestLetterV1(letters, 'z');
        System.out.println(z);
    }


    @Test
    public void nextGreatestLetterV2() {
        char[] letters = "cfj".toCharArray();

        char z = nextGreatestLetter.nextGreatestLetterV2(letters, 'z');
        System.out.println(z);
    }
}