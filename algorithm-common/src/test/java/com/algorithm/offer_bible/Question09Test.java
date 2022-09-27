package com.algorithm.offer_bible;


import org.junit.Test;

public class Question09Test  {

    private Question09 question09 = new Question09();

    /***
     * todo: 2022/9/22 下午10:16 lcc 九师兄
     * waterbottle
     *     erbottlewat
     */
    @Test
    public void testIsFlipedString() {
        question09.isFlipedString("waterbottle","erbottlewat");
    }

    @Test
    public void testIsFlipedStringv2() {
        //  babba
        boolean flipedStringv2 = question09.isFlipedStringv2("aba", "bab");
        System.out.println(flipedStringv2);
    }
}