package com.algorithm.matrix;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuperPowerSnakeTest {

    /**
     *todo: 2023/2/16 22:07 九师兄
     * 【算法】矩阵内的贪吃蛇，蛇最大长度
     *  https://blog.csdn.net/qq_21383435/article/details/129071814
     **/
    @Test
    public void snake() {
        int[][] arr = {
                {1, -4, 10},
                {3, -2, -1},
                {2, -1, 0},
                {0, 5, -2}
        };
        int snake = SuperPowerSnake.snake(arr);
        System.out.println(snake);
    }
}