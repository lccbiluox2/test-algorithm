package com.algorithm.graph.trie;

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
    }
}
