package com.algorithm.hash;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-10-30 17:00
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: todo: 测试hashTable的原理以及使用
 *
 * todo:【算法】 哈希表 自己模拟hashMap
 *    https://blog.csdn.net/qq_21383435/article/details/121052221
 *
 */
public class SimulationHashTableTest {

    /**
     * 测试点：测试hashTable的原理以及使用
     * <p>
     * 第0条链表 当前链表的信息为
     * => id=5 name=dff
     * 第1条链表 当前链表的信息为
     * => id=1 name=lcc
     * 第3条链表 当前链表的信息为
     * => id=3 name=xjj
     */
    @Test
    public void hashTableTest() {
        SimulationHashTable.hashTableTest();
    }

    /**
     * 测试点：测试测试hashTable的查找功能
     */
    @Test
    public void findEmployByIdTest() {
        Employees employById = SimulationHashTable.findEmployById(3);
        System.out.println(employById.name );

    }
}