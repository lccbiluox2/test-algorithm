package com.algorithm.graph.trie;

/***
 * todo: 4_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_4  2023/1/22 下午8:07 4 九师兄
 *       【算法】图的前缀树
 *       https://blog.csdn.net/qq_21383435/article/details/128732350
 */
public class TrieTreeDemo {

    private class TrieNode {
        public int pass;
        public int end;
        public TrieNode[] nexts; // HashMap<Char, Node› nexts;

        public TrieNode() {
            pass = 0;
            end = 0;
            // nextsra] == nul1 没有走向‘a的路
            // nextsrel != nul1 有走向‘a’的路
            // nexts[25] != null
            nexts = new TrieNode[26];
        }
    }

    public class Trie {
        private TrieNode root;
        public Trie trie;

        public Trie(TrieNode root) {
            this.root = new TrieNode();
        }

        public void insert(String word) {
            if (word == null) {
                return;
            }
            char[] chs = word.toCharArray();
            TrieNode node = root;
            node.pass++;
            int index = 0;
            for (int i = 0; i < chs.length; i++) {//从左往右遍历字符
                /**
                 * 这一点 比如
                 * a 字符 - a  那么位置就是0 位置就是0
                 * b 字符 - a  那么位置就是1 位置就是1
                 * c 字符 - a  那么位置就是2 位置就是2
                 */
                index = chs[i] - 'a';//由字符，对应成走向哪条路
                if (node.nexts[index] == null) {
                    node.nexts[index] = new TrieNode();
                }
                // 有数据的话 就设置下一个节点
                node = node.nexts[index];
                // 当前节点使用的key自增1
                node.pass++;
            }
            node.end++;
        }


        // word这个单词之前加入过几次
        public int search(String word) {
            if (word == null) {
                return 0;
            }
            char[] chs = word.toCharArray();
            TrieNode node = root;
            int index = 0;
            // 循环每个字符
            for (int i = 0; i < chs.length; i++) {
                // 计算字符所处的位置
                index = chs[i] - 'a';
                /***
                 * todo: 69_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_69  2023/1/22 上午11:18 69 九师兄
                 *    比如你开始加入了 abc 三个字符
                 *    但是你现在要搜索 abcdef字符，那么循环到d字符串的时候，发现计算后索引位置为空
                 *    那么说明d字符在开始插入的时候没有，那么结束查找，否则就继续往下循环，一直到结束
                 */
                if (node.nexts[index] == null) {
                    return 0;
                }
                node = node.nexts[index];
            }
            return node.end;
        }


        // 所有加入的字符串中，有几个是以pre这个字符串作为前缀的
        public int prefixNumber(String pre) {
            if (pre == null) {
                return 0;
            }
            char[] chs = pre.toCharArray();
            TrieNode node = root;
            int index = 0;
            for (int i = 0; i < chs.length; i++) {
                index = chs[i] - 'a';
                if (node.nexts[index] == null) {
                    return 0;
                }
                // 往下找 一直找到你需要的pass值
                node = node.nexts[index];
            }
            // 返回前缀
            return node.pass;
        }


        public void delete(String word) {
            /***
             * todo: 106_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_106  2023/1/22 上午11:26 106 九师兄
             *  我只加入了 abc  结果你要删除 abcdef  ，你在循环 abc的执行了 abc的删除
             *  比如在删除d的时候，发现没有了，然后就删除bac的时候 值更改错误了，所以我们要先查询一下。
             *  
             */
            if (search(word) != 0) {//确定树中确实加入过word，才删除
                char[] chs = word.toCharArray();
                TrieNode node = root;
                node.pass--;
                int index = 0;
                for (int i = 0; i < chs.length; i++) {
                    index = chs[i] - 'a';
                    /***
                     * todo: 119_5Lmd5biI5YWE5ZSv5LiA5Y6f5Yib5paH56ug77yM56aB5q2i6L2s6L29_119  2023/1/22 上午11:44 119 九师兄
                     *       如果一个节点删除的时候，发现自己的paas为0了，那么说明这个节点失效了
                     *       无用了，那么需要把这个节点后面所有的很多节点都设置为空，在java中可以直接
                     *       把父设置为空，就好了，因为找不到引用了，就会把所有的后面一坨，全删除
                     *       但是如果是c++需要自己遍历把后续节点都设置为空
                     */
                    if (--node.nexts[index].pass == 0) {
                        // java c++ 要遍历到底去析构
                        node.nexts[index] = null;
                        return;
                    }
                    node = node.nexts[index];
                }
                node.end--;
            }
        }
    }


}
