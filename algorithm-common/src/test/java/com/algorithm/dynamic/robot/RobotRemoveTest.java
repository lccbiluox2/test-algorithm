package com.algorithm.dynamic.robot;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RobotRemoveTest {

    private RobotRemove robotRemove = new RobotRemove();

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void uniquePaths(){
        int i = robotRemove.uniquePaths(3, 7);
        Assert.assertEquals(i,28);
    }
}