package com.algorithm.leetcode.swordoffer.offer59;

import com.algorithm.swordoffer.offer59.MaxQueue;
import org.junit.Test;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-12-04 20:34
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description:
 */
public class MaxQueueTest {

    private MaxQueue maxQueue = new MaxQueue();

    @Test
    public void max_value() {
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        int i = maxQueue.max_value();
        System.out.println("最大值：" + i);

        int front = maxQueue.pop_front();
        System.out.println("前一个值：" + front);

        int i1 = maxQueue.max_value();
        System.out.println("最大值：" + i1);

    }

//    [null,-1,-1,-1,null,46,46,-1,-1,null,868,-1,-1,null,525,-1,-1,-1,null,null,868,null,868,868,868,null,123,871,null,871,871,871,646,null,null,null,null,229,871,871,285,45,871,null,null,140,null,null,null,null,837,871,null,871,871,545,871,871,871,null,561,null,237,871,871,871,null,633,null,null,null,98,871,806,871,871,871,717,null,186,null,null,268,null,29,null,866,239,null,3,850,310,null,null,871,null,674,null,null,770]
//    [null,-1,-1,-1,null,46,46,-1,-1,null,868,-1,-1,null,525,-1,-1,-1,null,null,646,null,646,646,646,null,123,871,null,871,871,871,646,null,null,null,null,229,871,837,285,45,837,null,null,140,null,null,null,null,837,806,null,806,806,545,806,806,806,null,561,null,237,806,806,806,null,633,null,null,null,98,866,806,866,866,866,717,null,186,null,null,268,null,29,null,866,239,null,3,850,310,null,null,770,null,674,null,null,770]

    @Test
    public void max_value1() {
        String opera = "\"max_value\",\"pop_front\",\"max_value\",\"push_back\",\"max_value\",\"pop_front\",\"max_value\",\"pop_front\",\"push_back\",\"pop_front\",\"pop_front\",\"pop_front\",\"push_back\",\"pop_front\",\"max_value\",\"pop_front\",\"max_value\",\"push_back\",\"push_back\",\"max_value\",\"push_back\",\"max_value\",\"max_value\",\"max_value\",\"push_back\",\"pop_front\",\"max_value\",\"push_back\",\"max_value\",\"max_value\",\"max_value\",\"pop_front\",\"push_back\",\"push_back\",\"push_back\",\"push_back\",\"pop_front\",\"pop_front\",\"max_value\",\"pop_front\",\"pop_front\",\"max_value\",\"push_back\",\"push_back\",\"pop_front\",\"push_back\",\"push_back\",\"push_back\",\"push_back\",\"pop_front\",\"max_value\",\"push_back\",\"max_value\",\"max_value\",\"pop_front\",\"max_value\",\"max_value\",\"max_value\",\"push_back\",\"pop_front\",\"push_back\",\"pop_front\",\"max_value\",\"max_value\",\"max_value\",\"push_back\",\"pop_front\",\"push_back\",\"push_back\",\"push_back\",\"pop_front\",\"max_value\",\"pop_front\",\"max_value\",\"max_value\",\"max_value\",\"pop_front\",\"push_back\",\"pop_front\",\"push_back\",\"push_back\",\"pop_front\"";
        String input = "[],[],[],[46],[],[],[],[],[868],[],[],[],[525],[],[],[],[],[123],[646],[],[229],[],[],[],[871],[],[],[285],[],[],[],[],[45],[140],[837],[545],[],[],[],[],[],[],[561],[237],[],[633],[98],[806],[717],[],[],[186],[],[],[],[],[],[],[268],[],[29],[],[],[],[],[866],[],[239],[3],[850],[],[],[],[],[],[],[],[310],[],[674],[770],[],[525],[],[425],[],[],[720],[],[],[],[373],[411],[],[831],[],[765],[701],[]";
        String[] split = opera.split(",");
        String[] data = input
                .replaceAll("\\[","")
                .replaceAll("\\]","")
                .split(",");
        int j = 0;
        for (String action : split) {
            System.out.println(action);
            if (action.contains("max_value")) {
                int i = maxQueue.max_value();
                System.out.println("最大值：" + i);
            }
            if (action.contains("pop_front")) {
                int i = maxQueue.pop_front();
                System.out.println("pop_front：" + i);
            }

            if (action.contains("push_back")) {
                String datum = data[j];
                maxQueue.push_back(Integer.parseInt(datum));
            }
            if(j == 19){
                System.out.println(j);
            }
            j++;
        }

    }

    @Test
    public void max_value2() {
        String opera = "\"max_value\",\"pop_front\",\"max_value\",\"push_back\",\"max_value\",\"pop_front\",\"max_value\",\"pop_front\",\"push_back\",\"pop_front\",\"pop_front\",\"pop_front\",\"push_back\",\"pop_front\",\"max_value\",\"pop_front\",\"max_value\",\"push_back\",\"push_back\",\"max_value\",\"push_back\",\"max_value\",\"max_value\",\"max_value\",\"push_back\",\"pop_front\",\"max_value\",\"push_back\",\"max_value\",\"max_value\",\"max_value\",\"pop_front\",\"push_back\",\"push_back\",\"push_back\",\"push_back\",\"pop_front\",\"pop_front\",\"max_value\",\"pop_front\",\"pop_front\",\"max_value\",\"push_back\",\"push_back\",\"pop_front\",\"push_back\",\"push_back\",\"push_back\",\"push_back\",\"pop_front\",\"max_value\",\"push_back\",\"max_value\",\"max_value\",\"pop_front\",\"max_value\",\"max_value\",\"max_value\",\"push_back\",\"pop_front\",\"push_back\",\"pop_front\",\"max_value\",\"max_value\",\"max_value\",\"push_back\",\"pop_front\",\"push_back\",\"push_back\",\"push_back\",\"pop_front\",\"max_value\",\"pop_front\",\"max_value\",\"max_value\",\"max_value\",\"pop_front\",\"push_back\",\"pop_front\",\"push_back\",\"push_back\",\"pop_front\"";
        String input = "[],[],[],[],[46],[],[],[],[],[868],[],[],[],[525],[],[],[],[],[123],[646],[],[229],[],[],[],[871],[],[],[285],[],[],[],[],[45],[140],[837],[545],[],[],[],[],[],[],[561],[237],[],[633],[98],[806],[717],[],[],[186],[],[],[],[],[],[],[268],[],[29],[],[],[],[],[866],[],[239],[3],[850],[],[],[],[],[],[],[],[310],[],[674],[770],[],[525],[],[425],[],[],[720],[],[],[],[373],[411],[],[831],[],[765],[701],[]";
        String[] split = opera.split(",");
        String[] data = input
                .replaceAll("\\[","")
                .replaceAll("\\]","")
                .split(",");
        int j = 0;
        for (String action : split) {
            System.out.println(action);
            if (action.contains("max_value")) {
                int i = maxQueue.max_value();
                System.out.println("最大值：" + i);
            }
            if (action.contains("pop_front")) {
                int i = maxQueue.pop_front();
                System.out.println("pop_front：" + i);
            }

            if (action.contains("push_back")) {
                maxQueue.push_back(Integer.parseInt(data[j]));
            }

            j++;
        }

    }


    @Test
    public void max_value4() {
        maxQueue.push_back(1);
        maxQueue.push_back(2);
        int i = maxQueue.max_value();
        System.out.println("最大值：" + i);

        int front = maxQueue.pop_front();
        System.out.println("前一个值：" + front);

        int i1 = maxQueue.max_value();
        System.out.println("最大值：" + i1);

        maxQueue.push_back(5);
        maxQueue.push_back(4);
        maxQueue.push_back(5);
        maxQueue.pop_front();
        maxQueue.pop_front();
        maxQueue.pop_front();

    }
}