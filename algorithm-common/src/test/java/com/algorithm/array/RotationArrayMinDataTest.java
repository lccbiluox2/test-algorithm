package com.algorithm.array;

import org.junit.Test;

import static org.junit.Assert.*;

public class RotationArrayMinDataTest {

    private RotationArrayMinData rotationArrayMinData = new RotationArrayMinData();

    @Test
    public void minArray() {
        int[] arr = new int[]{4,5,6,7,1,2,3};
        int i = rotationArrayMinData.minArray(arr);
        System.out.println(i);
    }


    @Test
    public void minArrayV2() {
        int[] arr = new int[]{4,5,6,7,1,2,3};
        int i = rotationArrayMinData.minArrayV2(arr);
        System.out.println(i);
    }


}