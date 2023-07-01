package com.algorithm.array;

import java.util.*;
import java.util.function.Function;
import java.util.stream.IntStream;

public class ArraySingleData {

    public int[] findNumsAppearOnce(int[] data) {
        if(data == null || data.length < 2){
            return data;
        }
        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> removeSet = new HashSet<>();
        for (int item: data){
            Integer integer = map.get(item);
            if(integer == null){
                map.put(item,1);
                continue;
            }
            integer++;
            map.put(item,integer);
        }
        TreeSet<Integer> set = new TreeSet<>();
        for (Map.Entry<Integer, Integer> item: map.entrySet()){
            Integer value = item.getValue();
            if(value > 1){
                continue;
            }
            set.add(item.getKey());
        }
        Object[] objects = set.toArray();
        int[] result = new int[objects.length];
        for (int i = 0; i < objects.length; i++) {
            result[i] = (int) objects[i];
        }
        return result;
    }
}
