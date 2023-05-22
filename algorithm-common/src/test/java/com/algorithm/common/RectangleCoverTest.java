package com.algorithm.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleCoverTest {

    private RectangleCover rectangleCover = new RectangleCover();

    @Test
    public void rectangleCover() {
        int i = rectangleCover.rectangleCover(20);
        System.out.println(i);
    }

    @Test
    public void rectCover() {
        int i = rectangleCover.rectCover(20);
        System.out.println(i);
    }
}