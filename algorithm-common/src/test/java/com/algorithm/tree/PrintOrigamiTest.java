package com.algorithm.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class PrintOrigamiTest {

    /**
     * todo:  10_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_10  2023/1/14 下午9:14 九师兄
     *     测试点:
     *
     *    3凹 2凹 3凸 1凹 3凹 2凸 3凸
     *
     *    视频参考 https://www.bilibili.com/video/BV13g41157hK?p=8&vd_source=44c491a7c7c735ef8081cb60288bb47e
     *    最后10分钟 左神 算法
     */
    @Test
    public void printAllFolds() {
        PrintOrigami.printAllFolds(3);
    }
}