package com.algorithm.collection;


import java.util.*;

/***
 * todo: 7_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_7  2023/1/24 17:59 7 九师兄
 *       【算法】并查集结构
 *       https://blog.csdn.net/qq_21383435/article/details/128755788
 */
public class UnionFind {

    // 样本进来会包一层，叫做元素
    public static class Element<V> {
        public V value;

        public Element(V value) {
            this.value = value;
        }
    }

    public static class UnionFindSet<V> {
        public HashMap<V, Element<V>> elementMap;
        // key 某个元素Value 该元素的父
        public HashMap<Element<V>, Element<V>> fatherMap;
        // key 某个集合的代表元素 value 该集合的大小
        public HashMap<Element<V>, Integer> sizeMap;

        public UnionFindSet(List<V> list) {
            elementMap = new HashMap<>();
            fatherMap = new HashMap<>();
            sizeMap = new HashMap<>();
            for (V value : list) {
                Element<V> element = new Element<V>(value);
                elementMap.put(value, element);
                fatherMap.put(element, element);
                sizeMap.put(element, 1);
            }
        }

        public boolean isSameSet (V a, V b) {
            // 必须先注册 A样本有A圈 B样本有B圈
            if (elementMap.containsKey(a) && elementMap.containsKey(b)) {
                // 找到a圈集合的头  找到b圈的头 如果相等 那么就是一个集合
                return findHead(elementMap.get (a)) == findHead(elementMap.get(b));
            }
            return false;
        }
        public void union(V a, V b) {
            // 必须先注册 A样本有A圈 B样本有B圈
            if (elementMap.containsKey(a) && elementMap.containsKey(b)) {
                Element<V> aF = findHead(elementMap.get(a));
                Element<V> bF = findHead(elementMap.get(b));
                // 如果两个父相同 那么就是一个集合 不需要合并，否则需要合并
                if (aF != bF) {
                    /**
                     * todo: 56_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_56  2023/1/24 11:50 56 九师兄
                     *   根据我们的合并规则 数量较少集合的顶端 要 挂在 数据较多集合顶端的 下面
                     */
                    Element<V> big = sizeMap.get(aF) >= sizeMap.get(bF) ? aF : bF;
                    Element<V> small = big == aF ? bF : aF;

                    // 小集合 挂在 大集合的下面
                    fatherMap.put(small, big);
                    // 更新大集合的大小
                    sizeMap.put(big, sizeMap.get(aF) + sizeMap.get(bF));
                    // 如果你的small原先是代表节点  但是合并了大集合后 大集合 变成了 代表节点
                    // 然后需要删除小集合的大小
                    sizeMap.remove(small);
                }
            }
        }

        // 给定一个ele，往上一直找，把代表元素返回
        private Element<V> findHead(Element<V> element) {
            Stack<Element<V>> path = new Stack<>();
            // 如果 element 不等于 父 ，那么就一直往上走
            while (element != fatherMap.get (element)) {
                path. push(element) ;
                element = fatherMap.get(element);
            }
            while (!path.isEmpty()) {
                // 需要将 路径 设置成 大顶部
                fatherMap.put (path.pop(), element);
            }
            return element;
        }
    }

}
