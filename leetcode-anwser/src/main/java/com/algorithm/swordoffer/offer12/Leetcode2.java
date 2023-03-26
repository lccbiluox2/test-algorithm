package com.algorithm.swordoffer.offer12;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-24 22:31
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 作者：lin-shen-shi-jian-lu-k
 * 链接：https://leetcode-cn.com/problems/ju-zhen-zhong-de-lu-jing-lcof/solution/ju-zhen-zhong-de-lu-jing-hui-su-suan-fa-immxn/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 */
public class Leetcode2 {


    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[i].length; j++)
                if (dfs(board, word, 0, i, j)) return true;
        return false;
    }

    int[] dx = new int[]{-1, 0, 1, 0}, dy = new int[]{0, 1, 0, -1};

    boolean dfs(char[][] board, String word, int u, int x, int y) {
        if (board[x][y] != word.charAt(u)) return false;
        if (u == word.length() - 1) return true;
        char t = board[x][y];
        board[x][y] = '.';
        for (int i = 0; i < 4; i++) {
            int a = x + dx[i], b = y + dy[i];
            if (a < 0 || a >= board.length || b < 0 || b >= board[0].length || board[a][b] == '.') continue;
            if (dfs(board, word, u + 1, a, b)) return true;
        }
        board[x][y] = t;
        return false;
    }
}


