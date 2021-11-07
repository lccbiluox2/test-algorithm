package com.algorithm.tree.hoffmantree;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-07 11:18
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 *
 * todo; 赫夫曼编码解码
 *    参考：https://blog.csdn.net/qq_21383435/article/details/121067429
 */
public class HoffmanCodeTest {


    /**
     * 测试点：测试哈夫曼加密
     *
     * /code结果：1010100010111111110010001011111111001000101111111100100101001101110001110000011011101000111100101000101111111100110001001010011011100
     * 生成的哈夫曼结果：[-88, -65, -56, -65, -56, -65, -55, 77, -57, 6, -24, -14, -117, -4, -60, -90, 28]
     */
    @Test
    public void hufumanZip(){
        String content = "i like like like java do you like a java";
        byte[] bytes = HoffmanCode.huffmanZip(content);
        System.out.println("生成的哈夫曼结果：" + Arrays.toString(bytes));
    }


    /**
     * 测试点：测试赫夫曼解码
     *
     * /code结果：1010100010111111110010001011111111001000101111111100100101001101110001110000011011101000111100101000101111111100110001001010011011100
     * 当前翻译的赫夫曼=1010100010111111110010001011111111001000101111111100100101001101110001110000011011101000111100101000101111111100110001001010011011100
     * 生成的哈夫曼结果：[105, 32, 108, 105, 107, 101, 32, 108, 105, 107, 101, 32, 108, 105, 107, 101, 32, 106, 97, 118, 97, 32, 100, 111, 32, 121, 111, 117, 32, 108, 105, 107, 101, 32, 97, 32, 106, 97, 118, 97]
     * i like like like java do you like a java
     *
     */
    @Test
    public void hunffmanUnzip(){
        String content = "i like like like java do you like a java";
        byte[] bytes = HoffmanCode.huffmanZip(content);

        byte[] bytess = HoffmanCode.decode(HoffmanCode.huffmanCodes,bytes);
        System.out.println("生成的哈夫曼结果：" + Arrays.toString(bytess));
        System.out.println(new String(bytess));
    }

}