package com.algorithm.greedy.greed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-14 10:40
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 贪婪算法计算广播问题
 *
 * 【算法】贪心算法
 *  https://blog.csdn.net/qq_21383435/article/details/121314198
 */
public class GreedyAlgorithm {


    /**
     * 最终结果如下：[k1, k2, k3, k5]
     */
    public static void greedyAlgorithm() {

        String[] k1 = {"北京", "上海", "天津"};
        String[] k2 = {"广州", "北京", "深圳"};
        String[] k3 = {"成都", "上海", "杭州"};
        String[] k4 = {"上海", "天津"};
        String[] k5 = {"杭州", "大连"};

        Set<String> allArea = new HashSet<>();
        for (String item : k1) {
            allArea.add(item);
        }
        for (String item : k2) {
            allArea.add(item);
        }
        for (String item : k3) {
            allArea.add(item);
        }
        for (String item : k4) {
            allArea.add(item);
        }
        for (String item : k5) {
            allArea.add(item);
        }

        Map<String, Set<String>> broadcasts = new HashMap<>();
        broadcasts.put("k1", new HashSet<>(Arrays.asList(k1)));
        broadcasts.put("k2", new HashSet<>(Arrays.asList(k2)));
        broadcasts.put("k3", new HashSet<>(Arrays.asList(k3)));
        broadcasts.put("k4", new HashSet<>(Arrays.asList(k4)));
        broadcasts.put("k5", new HashSet<>(Arrays.asList(k5)));

        //创建ArrayList,存放选择的电台集合
        ArrayList<String> selects = new ArrayList<String>();
        //定义一个临时的集合，在遍历的过程中,存放遍历过程中的电台覆盖的地区和当前还没有覆盖的地区的交集
        HashSet<String> tempSet = new HashSet<String>();
        //定义给maxKey，保存在一次遍历过程中， 能够覆盖最大未覆盖的地区对应的电台的key
        //如果maxKey不为null，则会加入到selects
        String maxKey = null;
        while (allArea.size() != 0) { //如果allAreas不为0，则表示还没有覆盖到所有的地区
            maxKey = null;
            for (Map.Entry<String, Set<String>> item : broadcasts.entrySet()) {
                tempSet.clear();

                String key = item.getKey();
                Set<String> areas = item.getValue();
                tempSet.addAll(areas);
                tempSet.retainAll(allArea);
                //如果当前这个集合包含的未覆盖地区的数量，比maxKey指向的集合地区还多
                //就需要重置maxKey
                if (tempSet.size() > 0 &&
                        (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {
                    maxKey = key;
                }
            }
            //maxKey != nu1l, 就应该将maxKey加入selects
            if (maxKey != null) {
                selects.add(maxKey);
                //将maxKey指向的广播电台覆盖的地区，从allAreas去掉
                allArea.removeAll(broadcasts.get(maxKey));
            }
        }

        System.out.println("最终结果如下：" + selects);
    }


    /**
     * 简单代码
     *
     * 循环结果：key:k1 value:3
     * 循环结果：key:k2 value:3
     * 循环结果：key:k3 value:3
     * 循环结果：key:k4 value:2
     * 循环结果：key:k5 value:2
     * 本轮最大值为：key:k1 value:3
     * 移除当前最大key：k1 对应的覆盖范围（已经覆盖的）[上海, 天津, 北京]
     * 移除之后未覆盖范围：[成都, 广州, 大连, 杭州, 深圳]
     * 第1轮判断结束
     *
     *
     * 循环结果：key:k1 value:0
     * 循环结果：key:k2 value:2
     * 循环结果：key:k3 value:2
     * 循环结果：key:k4 value:0
     * 循环结果：key:k5 value:2
     * 本轮最大值为：key:k2 value:2
     * 移除当前最大key：k2 对应的覆盖范围（已经覆盖的）[广州, 北京, 深圳]
     * 移除之后未覆盖范围：[成都, 大连, 杭州]
     * 第2轮判断结束
     *
     *
     * 循环结果：key:k1 value:0
     * 循环结果：key:k2 value:0
     * 循环结果：key:k3 value:2
     * 循环结果：key:k4 value:0
     * 循环结果：key:k5 value:2
     * 本轮最大值为：key:k3 value:2
     * 移除当前最大key：k3 对应的覆盖范围（已经覆盖的）[成都, 上海, 杭州]
     * 移除之后未覆盖范围：[大连]
     * 第3轮判断结束
     *
     *
     * 循环结果：key:k1 value:0
     * 循环结果：key:k2 value:0
     * 循环结果：key:k3 value:0
     * 循环结果：key:k4 value:0
     * 循环结果：key:k5 value:1
     * 本轮最大值为：key:k5 value:1
     * 移除当前最大key：k5 对应的覆盖范围（已经覆盖的）[大连, 杭州]
     * 移除之后未覆盖范围：[]
     * 第4轮判断结束
     *
     *
     * 最终结果如下：[k1, k2, k3, k5]
     */
    public static void greedyAlgorithm1() {

        String[] k1 = {"北京", "上海", "天津"};
        String[] k2 = {"广州", "北京", "深圳"};
        String[] k3 = {"成都", "上海", "杭州"};
        String[] k4 = {"上海", "天津"};
        String[] k5 = {"杭州", "大连"};

        Set<String> allArea = new HashSet<>();
        for (String item : k1) {
            allArea.add(item);
        }
        for (String item : k2) {
            allArea.add(item);
        }
        for (String item : k3) {
            allArea.add(item);
        }
        for (String item : k4) {
            allArea.add(item);
        }
        for (String item : k5) {
            allArea.add(item);
        }

        Map<String, Set<String>> broadcasts = new HashMap<>();
        broadcasts.put("k1", new HashSet<>(Arrays.asList(k1)));
        broadcasts.put("k2", new HashSet<>(Arrays.asList(k2)));
        broadcasts.put("k3", new HashSet<>(Arrays.asList(k3)));
        broadcasts.put("k4", new HashSet<>(Arrays.asList(k4)));
        broadcasts.put("k5", new HashSet<>(Arrays.asList(k5)));

        //创建ArrayList,存放选择的电台集合
        ArrayList<String> selects = new ArrayList<String>();

        //定义给maxKey，保存在一次遍历过程中， 能够覆盖最大未覆盖的地区对应的电台的key
        //如果maxKey不为null，则会加入到selects
        int lun = 1;
        while (allArea.size() != 0) { //如果allAreas不为0，则表示还没有覆盖到所有的地区
            Map<String, Integer> eachSize = new HashMap<>();
            for (Map.Entry<String, Set<String>> item : broadcasts.entrySet()) {
                String key = item.getKey();
                Set<String> areas = item.getValue();
                int size = getContainSize(allArea, areas);
                eachSize.put(key, size);
                System.out.println("循环结果：key:" + key + " value:" + size);
            }

            String key = getMax(eachSize);
            selects.add(key);


            Set<String> strings = broadcasts.get(key);
            allArea.removeAll(strings);
            System.out.println("移除当前最大key："+key+" 对应的覆盖范围（已经覆盖的）"+strings);
            System.out.println("移除之后未覆盖范围："+ allArea);


            System.out.println("第"+lun+"轮判断结束");
            lun++;
            System.out.println();
            System.out.println();
        }

        System.out.println("最终结果如下：" + selects);
    }

    private static String getMax(Map<String, Integer> eachSize) {
        Integer max = eachSize.values().stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        }).get();

        for (Map.Entry<String, Integer> item : eachSize.entrySet()) {
            String key = item.getKey();
            Integer value = item.getValue();
            if (max == value) {
                System.out.println("本轮最大值为：key:" + key + " value:" + value);
                return key;
            }
        }
        return null;
    }

    private static int getContainSize(Set<String> allArea, Set<String> areas) {
        int count = 0;
        for (String item : areas) {
            if (allArea.contains(item)) {
                count++;
            }
        }
        return count;
    }
}
