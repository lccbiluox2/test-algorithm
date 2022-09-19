package com.algorithm.offer_bible;


import org.junit.Assert;
import org.junit.Test;

public class Question06Test  {

    private Question06 question06 = new Question06();

    @Test
    public void testCompressString() {
        String aabcccccaaa = question06.compressString("aabcccccaaa");
        Assert.assertEquals("a2b1c5a3",aabcccccaaa);

        String abbccd = question06.compressString("abbccd");
        Assert.assertEquals("abbccd",abbccd);
    }


}