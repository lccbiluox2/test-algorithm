package com.algorithm.book.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class YueSeFuRingTest {

    private YueSeFuRing yueSeFuRing = new YueSeFuRing();

    @Test
    public void josephus() {
        yueSeFuRing.josephus(2);
    }
}