package com.algorithm.offer_bible;

import java.util.*;
import java.util.stream.Collectors;

/***
 * todo: 2022/9/19 下午10:18 lcc 九师兄
 *      面试题 01.04. 回文排列
 *      https://leetcode.cn/problems/palindrome-permutation-lcci/
 */
public class Question04 {

    public boolean canPermutePalindrome(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char item : chars) {
            Integer orDefault = map.getOrDefault(item, 0);
            orDefault++;
            map.put(item, orDefault);
        }

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            list.add(item.getValue());
        }
        list.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        int length = chars.length;
        if(length % 2 != 0){
            Integer first = list.get(0);
            if (first %2 == 0) {
                return false;
            }
        }
        for (int i = 1; i < list.size(); i++) {
            Integer value = list.get(i);
            if (value % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    // 这个算法主要是使用了 两个定律
    public boolean canPermutePalindromev2(String s) {
        char[] chars = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char item : chars) {
            Integer orDefault = map.getOrDefault(item, 0);
            orDefault++;
            map.put(item, orDefault);
        }

        int length = chars.length;
        boolean isOld = length % 2 == 0; // 判断是奇数 还是偶数 偶数？

        if(isOld){
            // 「回文串」长度为偶数：所有不同字符的出现次数都为「偶数」；
            for (Map.Entry<Character, Integer> item : map.entrySet()) {
                if (item.getValue() % 2 != 0) {
                    return false;
                }
            }
        }else {
            int count = 0;
            for (Map.Entry<Character, Integer> item : map.entrySet()) {
                // 「回文串」长度为奇数：位于中点的字符出现「奇数」次，其余字符出现「偶数」次；
                if(item.getValue() % 2 != 0){
                    count++;
                }
            }
            if(count > 1){
                return false;
            }
        }
        return true;
    }

    /***
     * todo: 2022/9/19 下午10:20 lcc 九师兄
     *     作者：dc3a2nLETu
     *     链接：https://leetcode.cn/problems/palindrome-permutation-lcci/solution/wei-yun-suan-ji-hu-shuang-100-by-dc3a2nl-x0q6/
     *     来源：力扣（LeetCode）
     *     著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     */
    public boolean canPermutePalindromev3(String s) {
        long front = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            char cIndex = s.charAt(i);
            // 这里为什么区分64 呢 因为64*2 =128 正好是 字符就是（ASCII）🐎128 位
            if (cIndex >= 64) {
                int cInter = cIndex - 64;
                long left = 1L << cInter;
                // 这里利用了同一个数字两次异或为0的特征  偶数次 为0 基数次为1
                end ^= left;
            } else {
                long left = 1L << cIndex;
                front ^= left;
            }
        }
        return Long.bitCount(front) + Long.bitCount(end) <= 1;
    }


    /***
     * todo: 2022/9/19 下午10:36 lcc 九师兄
     *  作者：sdwwld
     *  链接：https://leetcode.cn/problems/palindrome-permutation-lcci/solution/ji-he-setwei-yun-suan-deng-3chong-fang-s-oljy/
     *
     */
    public boolean canPermutePalindromev4(String s) {
        Set<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            //set的add方法如果返回false，表示已经有了，
            //我们就把他删除
            if (!set.add(ch)) {
                set.remove(ch);
            }
        }
        //最后判断set的长度是否小于等于1，如果等于1说明
        //只有一个字符的个数是奇数，其他的都是偶数。如果
        //等于0说明每个字符都是偶数，否则不可能构成回文字符串
        return set.size() <= 1;
    }

}
