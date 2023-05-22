package com.algorithm.swordoffer.offer12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-23 09:16
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 剑指 Offer 12. 矩阵中的路径
 */
public class Offer12_2 {


    private int X;// 棋盘的列数
    private int Y;// 棋盘的列数

    //创建一个数组，标记棋盘的各个位置是否被访问过
    private boolean visited[][];

    //使用一个属性，标记是否棋盘的所有位置都被访问
    private List<Point> visitedPath;

    public void init(int x, int y) {
        X = x;
        Y = y;
        visited = new boolean[x][y]; //初始值都是false
        visitedPath = new ArrayList<>();
    }


    /**
     * 功能:根据当前位置(Point对象)， 计算下一步还能走哪些位置(Point),
     * 并放入到一-个集合中(ArrayList)
     *
     * @param curPoint
     * @return
     */
    public ArrayList<Point> next(Point curPoint) {
        //创建一个ArrayList
        ArrayList<Point> ps = new ArrayList<Point>();

        // 往左边走
        int heng = curPoint.x;
        int shu = (int) curPoint.getY() - 1;
        // 如果这个位置在table内，而且没有被访问，那么就是可以访问的
        if (isInTable(heng, shu) && !visited(heng, shu)) {
            ps.add(new Point(heng, shu));
        }

        // 往右边走
        heng = curPoint.x;
        shu = (int) (curPoint.getY() + 1);
        if (isInTable(heng, shu) && !visited(heng, shu)) {
            ps.add(new Point(heng, shu));
        }

        // 往上边走
        heng = curPoint.x - 1;
        shu = (int) (curPoint.getY());
        if (isInTable(heng, shu) && !visited(heng, shu)) {
            ps.add(new Point(heng, shu));
        }

        // 往下边走
        heng = curPoint.x + 1;
        shu = (int) (curPoint.getY());
        if (isInTable(heng, shu) && !visited(heng, shu)) {
            ps.add(new Point(heng, shu));
        }

        return ps;
    }

    private boolean visited(int heng, int shu) {
        if (visited[heng][shu]) {
            return true;
        }
        return false;
    }

    private boolean isInTable(int heng, int shu) {
        boolean hengIn = (0 <= heng && heng < X);
        boolean shuIn = (0 <= shu && shu < Y);
        if (hengIn && shuIn) {
            return true;
        }
        return false;
    }

    /**
     * 递归完成访问
     *
     * @param chessboard 棋盘
     * @param row        当前的位置的行
     * @param column     当前的位置的列
     * @param step       是第几步,初始位置就是第1步
     */
    public void traversalChessboardGreedy(char[][] chessboard, int row, int column, int step, String word, List<Point> visitedChar) {

        // 当前点设置为已经访问过了
        visited[row][column] = true; //标记该位置已经访问

        if (visitedChar.size() == word.length()) {
            return;
        }
        if (step == word.length()) {
            return;
        }

        //获取当前位置可以走的下一个位置的集合
        ArrayList<Point> ps = next(new Point(row, column));

        // 这里的循环，如果有多个可选的路径，如果没有匹配会循环每个可走的路径
        // 也就是说这个点的上下左右都会试试能不能走通
        while (!ps.isEmpty()) {
            // 如果集合中有多个，其中一个找到了后面的就不需要循环了
            if (visitedChar.size() == word.length()) {
                break;
            }
            // 取出来下一个可以走的位置
            Point p = ps.remove(0);
            //判断该点是否已经访问过
            if (!visited[p.x][p.y]) {//说明还没访问过
                // 获取棋盘上下一个要走的字符
                char nextChar = chessboard[p.x][p.y];
                // 获取当前步骤要对比的字符
                char wordNextChar = word.charAt(step);
                // 如果2个字符相同，那么可以继续查找，说明本次查找成功
                if (nextChar == wordNextChar) {
                    // 那么将下一步的算入有效路径
                    visitedChar.add(new Point(p));
                    // 然后以这个点往下继续找，同时步骤加一
                    traversalChessboardGreedy(chessboard, p.x, p.y, step + 1, word, visitedChar);
                }
            }
        }

        // 如果找到了，那么直接返回
        if (visitedChar.size() == word.length()) {
            return;
        } else {
            // 否则就要进行回溯，说明上次找的路径不对
            if (visitedChar.size() > 0) {
                // 上次的路径不对，因此要把上次的路径去除
                visitedChar.remove(visitedChar.size() - 1);
            }
            // 然后将已经访问的地址，设置没有访问
            visited[row][column] = false;
        }

    }

    public boolean exist(char[][] board, String word) {
        X = board.length;
        Y = board[0].length;


        List<Pair<Integer, Integer>> starts = findStart(board, word);
        // 第一个字母都找不到，那么就不会存在了
        if (starts.isEmpty()) {
            return false;
        }

        List<List<Point>> allresult = new ArrayList<>();
        for (Pair<Integer, Integer> item : starts) {
            Integer key = item.getKey();
            Integer value = item.getValue();
            init(X, Y);

            visitedPath.add(new Point(key, value));
            traversalChessboardGreedy(board, key, value, 1, word, visitedPath);
            if (visitedPath.size() == word.length()) {
                allresult.add(visitedPath);
            }
        }
        System.out.println("最终结果：" + allresult);
        if (allresult.size() > 0) {
            return true;
        }
        return false;
    }

    /**
     * 找到第一个匹配的字母的位置  可能有多个位置
     *
     * @param board
     * @param word
     * @return
     */
    private List<Pair<Integer, Integer>> findStart(char[][] board, String word) {
        char first = word.charAt(0);
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            char[] chars = board[i];
            for (int j = 0; j < chars.length; j++) {
                if (first == board[i][j]) {
                    Pair<Integer, Integer> pair = new Pair<>(i, j);
                    list.add(pair);
                }
            }
        }
        return list;
    }

}

class Pair<T,V>{
    public T key;
    public V value;

    public Pair(T key, V value) {
        this.key = key;
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}

class Point {
    public int x;
    public int y;

    public Point() {
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

