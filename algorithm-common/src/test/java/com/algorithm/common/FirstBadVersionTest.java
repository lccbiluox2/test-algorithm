package com.algorithm.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class FirstBadVersionTest {

    private FirstBadVersion firstBadVersion = new FirstBadVersion();

    @Test
    public void firstBadVersion() {
        int i = firstBadVersion.firstBadVersion(5);
        System.out.println(i);
    }
}