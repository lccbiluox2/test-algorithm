package com.algorithm.leetcode.stack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-12 10:01
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class CQueueTest {


    /**
     * ["CQueue","deleteHead","appendTail","deleteHead","deleteHead","deleteHead","deleteHead","appendTail","deleteHead","appendTail","appendTail","deleteHead","deleteHead","deleteHead","appendTail","deleteHead","deleteHead","deleteHead","deleteHead","appendTail","appendTail","appendTail","appendTail","deleteHead","deleteHead","appendTail","appendTail","deleteHead","deleteHead","deleteHead","appendTail","appendTail","deleteHead","appendTail","deleteHead","appendTail","appendTail","appendTail","deleteHead","deleteHead","appendTail","appendTail","deleteHead","deleteHead","deleteHead","deleteHead","appendTail","appendTail","deleteHead","deleteHead","appendTail","deleteHead","appendTail","appendTail","appendTail","appendTail","deleteHead","appendTail","deleteHead","deleteHead","appendTail","appendTail","appendTail","deleteHead","deleteHead","appendTail","appendTail","appendTail","deleteHead","deleteHead","deleteHead","deleteHead","appendTail","appendTail","deleteHead","deleteHead","appendTail","deleteHead","appendTail","appendTail","deleteHead","deleteHead","appendTail","deleteHead","appendTail","appendTail","appendTail","deleteHead","appendTail","appendTail","appendTail","appendTail","deleteHead","deleteHead","deleteHead","appendTail","deleteHead","appendTail","deleteHead","appendTail","appendTail"]
     * [[],[],[97],[],[],[],[],[15],[],[1],[43],[],[],[],[18],[],[],[],[],[36],[69],[21],[91],[],[],[22],[40],[],[],[],[81],[65],[],[77],[],[63],[96],[5],[],[],[35],[90],[],[],[],[],[77],[83],[],[],[52],[],[2],[66],[87],[90],[],[2],[],[],[33],[16],[72],[],[],[14],[78],[8],[],[],[],[],[3],[83],[],[],[13],[],[79],[44],[],[],[33],[],[55],[76],[12],[],[91],[24],[49],[47],[],[],[],[85],[],[69],[],[94],[52]]
     * <p>
     * [null,-1,null,97,-1,-1,-1,null,15,null,null,1,43,-1,null,18,-1,-1,-1,null,null,null,null,36,69,null,null,22,40,21,null,null,81,null,77,null,null,null,63,96,null,null,35,90,5,65,null,null,77,83,null,52,null,null,null,null,2,null,2,66,null,null,null,33,16,null,null,null,14,78,8,72,null,null,3,83,null,13,null,null,79,44,null,33,null,null,null,55,null,null,null,null,91,24,49,null,85,null,69,null,null]
     * [null,-1,null,97,-1,-1,-1,null,15,null,null,1,43,-1,null,18,-1,-1,-1,null,null,null,null,36,69,null,null,21,91,22,null,null,40,null,81,null,null,null,65,77,null,null,63,96,5,35,null,null,90,77,null,83,null,null,null,null,52,null,2,66,null,null,null,87,90,null,null,null,2,33,16,72,null,null,14,78,null,8,null,null,3,83,null,13,null,null,null,79,null,null,null,null,44,33,55,null,76,null,12,null,null]
     */
    @Test
    public void appendTail0() {
        CQueue obj = new CQueue();
        int aa = obj.deleteHead();
        System.out.println("null" + aa);
        obj.appendTail(5);
        obj.appendTail(2);

        int aa1 = obj.deleteHead();
        int aa2 = obj.deleteHead();
        System.out.println("null" + aa1);
        System.out.println("null" + aa2);
    }


    @Test
    public void appendTail() {
        CQueue obj = new CQueue();
        Random random = new Random();
        while (true) {
            int data = random.nextInt(10);
            if (data % 2 == 0) {
                obj.appendTail(data);
            } else {
                int aa = obj.deleteHead();
            }
        }
    }


    /**
     * 测试点：测试题库
     * <p>
     * [null,-1,null,97,-1,-1,-1,null,15,null,null,1,43,-1,null,18,-1,-1,-1,null,null,null,null,36,69,null,null,22,21,91,null,null,81,null,77,null,null,null,5,63,null,null,35,65,-1,-1,null,null,77,83,null,52,null,null,null,null,2,null,2,66,null,null,null,72,33,null,null,null,8,14,87,90,null,null,3,83,null,13,null,null,79,44,null,33,null,null,null,55,null,null,null,null,49,91,76,null,85,null,69,null,null]
     * [null,-1,null,97,-1,-1,-1,null,15,null,null,1,43,-1,null,18,-1,-1,-1,null,null,null,null,36,69,null,null,21,91,22,null,null,40,null,81,null,null,null,65,77,null,null,63,96,5,35,null,null,90,77,null,83,null,null,null,null,52,null,2,66,null,null,null,87,90,null,null,null,2,33,16,72,null,null,14,78,null,8,null,null,3,83,null,13,null,null,null,79,null,null,null,null,44,33,55,null,76,null,12,null,null]
     */
    @Test
    public void appendTail1() {
        CQueue obj = new CQueue();
        String action = "\"CQueue\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"appendTail\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"appendTail\",\"appendTail\",\"appendTail\",\"appendTail\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"appendTail\",\"appendTail\",\"appendTail\",\"deleteHead\",\"appendTail\",\"appendTail\",\"appendTail\",\"appendTail\",\"deleteHead\",\"deleteHead\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"appendTail\",\"deleteHead\",\"appendTail\",\"appendTail\"";
        String values = "[],[],[97],[],[],[],[],[15],[],[1],[43],[],[],[],[18],[],[],[],[],[36],[69],[21],[91],[],[],[22],[40],[],[],[],[81],[65],[],[77],[],[63],[96],[5],[],[],[35],[90],[],[],[],[],[77],[83],[],[],[52],[],[2],[66],[87],[90],[],[2],[],[],[33],[16],[72],[],[],[14],[78],[8],[],[],[],[],[3],[83],[],[],[13],[],[79],[44],[],[],[33],[],[55],[76],[12],[],[91],[24],[49],[47],[],[],[],[85],[],[69],[],[94],[52]";
        String qiwang = "null,-1,null,97,-1,-1,-1,null,15,null,null,1,43,-1,null,18,-1,-1,-1,null,null,null,null,36,69,null,null,21,91,22,null,null,40,null,81,null,null,null,65,77,null,null,63,96,5,35,null,null,90,77,null,83,null,null,null,null,52,null,2,66,null,null,null,87,90,null,null,null,2,33,16,72,null,null,14,78,null,8,null,null,3,83,null,13,null,null,null,79,null,null,null,null,44,33,55,null,76,null,12,null,null";
        List<String> actionList = getActionList(action);
        List<Integer> valuesList = getValueList(values);
        List<String> qiwangList = getQiwangList(qiwang);

        for (int i = 0; i < actionList.size(); i++) {
            if(i == 25){
                System.out.println("xx");
            }
            String item = actionList.get(i);
            if(item.contains("CQueue")) {
                System.out.println(qiwangList.get(i));
                continue;
            }
            if(item.contains("deleteHead")) {
                int data = obj.deleteHead();
                String qiwangValue = qiwangList.get(i);
                System.out.println("输出值："+data +" 期望值："+qiwangValue);
                if(!qiwangValue.equals(data+"")){
                    System.out.println("不一致");
                }
            }
            if(item.contains("appendTail")) {
                Integer integer = valuesList.get(i);
                obj.appendTail(integer);
            }
        }
    }

    private List<String> getQiwangList(String qiwang) {
        String[] actions = qiwang.split(",");
        return Arrays.asList(actions);
    }

    private List<Integer> getValueList(String values) {

        String[] split = values.split(",");
        List<Integer> valueInt = new ArrayList<>(split.length);
        for (String item : split) {
            if (item.equals("[]")) {
                valueInt.add(null);
            } else {
                String replace = item.replace("[", "");
                replace = replace.replace("]", "");
                valueInt.add(Integer.parseInt(replace));
            }
        }
        return valueInt;
    }

    private List<String> getActionList(String action) {
        String[] actions = action.split(",");
        return Arrays.asList(actions);
    }
}


