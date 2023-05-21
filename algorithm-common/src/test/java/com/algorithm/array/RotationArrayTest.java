package com.algorithm.array;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.Test;

import java.util.Arrays;

import static org.apache.commons.lang3.ArrayUtils.reverse;
import static org.junit.Assert.*;


/***
 * todo: 九师兄  2023/5/21 21:48
 *
 * 【算法】旋转数组
 * https://blog.csdn.net/qq_21383435/article/details/130794182
 */
public class RotationArrayTest {

    private RotationArray rotationArray = new RotationArray();

    @Test
    public void rotate() {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotationArray.rotate(arr,3);
        System.out.println(ArrayUtils.toString(arr));
    }

    @Test
    public void rotateV2() {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        rotationArray.rotateV2(arr,3);
        System.out.println(ArrayUtils.toString(arr));
    }

}