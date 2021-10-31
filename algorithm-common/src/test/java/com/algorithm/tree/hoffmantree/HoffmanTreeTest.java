package com.algorithm.tree.hoffmantree;

import com.algorithm.sort.HeapSort;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-31 16:53
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class HoffmanTreeTest {

    /**
     * 测试点: 测试赫夫曼树的创建以及打印
     * 测试结果如下
     *
     * Node [value=67]
     * Node [value=33]
     * Node [value=29]
     * Node [value=4]
     * Node [value=1]
     * Node [value=3]
     * Node [value=34]
     * Node [value=13]
     * Node [value=6]
     * Node [value=7]
     * Node [value=21]
     * Node [value=8]
     * Node [value=13]
     */
    @Test
    public void createHuffmanTree() {
        int[] aa = new int[]{13,7,8, 3,29, 6, 1};
        HoffmanTree.Node huffmanTree = HoffmanTree.createHuffmanTree(aa);
        HoffmanTree.preOrder(huffmanTree);
    }
}