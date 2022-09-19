package com.algorithm.offer_bible;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Question04 {

    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char item : chars) {
            Integer orDefault = map.getOrDefault(item, 0);
            orDefault++;
            map.put(item, orDefault);
        }
        Map<Character, Integer> result = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (oldValue, newValue) -> oldValue, LinkedHashMap::new));
        Integer integer = result.get(0);
        if (integer != 1) {
            return false;
        }
        for (int i = 1; i < result.size(); i++) {
            Integer integer1 = result.get(i);
            if (integer1 % 2 != 0) {
                return false;
            }
        }
        return true;
    }
}
