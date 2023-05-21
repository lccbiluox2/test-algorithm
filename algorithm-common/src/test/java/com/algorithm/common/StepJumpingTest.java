package com.algorithm.common;

import org.junit.Test;

import static org.junit.Assert.*;

public class StepJumpingTest {

    private StepJumping stepJumping = new StepJumping();

    @Test
    public void stepJumping() {
        int i = stepJumping.stepJumping(10);
        System.out.println(i);
    }

    @Test
    public void jumpFloor() {
        int i = stepJumping.jumpFloor(10);
        System.out.println(i);
    }


}