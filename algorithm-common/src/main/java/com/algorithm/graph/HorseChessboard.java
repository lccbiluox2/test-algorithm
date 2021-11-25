package com.algorithm.graph;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author: chuanchuan.lcc
 * @date: 2021-11-21 21:22
 * @modifiedBy: chuanchuan.lcc
 * @version: 1.0
 * @description: 马踏棋盘
 */
public class HorseChessboard {

    private static int X;// 棋盘的列数
    private static int Y;// 棋盘的列数

    //创建一个数组，标记棋盘的各个位置是否被访问过
    private static boolean visited[];
    //使用一个属性，标记是否棋盘的所有位置都被访问
    private static boolean finished; //如果为true, 表示成功

    public static void init(int x, int y) {
        X =x;
        Y =y;
        visited = new boolean[x * y] ; //初始值都是false
    }



    /**
     * 功能:根据当前位置(Point对象)， 计算马儿还能走哪些位置(Point),并放入到一-个集合中(ArrayList), 最多有8个位置
     *
     * @param curPoint
     * @return
     */
    public static ArrayList<Point> next(Point curPoint) {
        //创建一个ArrayList
        ArrayList<Point> ps = new ArrayList<Point>();
        //创建一个Point
        Point p1 = new Point();
        //表示马儿可以走5这个位置
        if ((p1.x = curPoint.x - 2) >= 0 & (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
            //判断马儿可以走6这个位置
        }
        //表示马儿可以走6这个位置
        if ((p1.x = curPoint.x - 1) >= 0 & (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //表示马儿可以走7这个位置
        if ((p1.x = curPoint.x + 1) < X & (p1.y = curPoint.y - 2) >= 0) {
            ps.add(new Point(p1));
        }
        //表示马儿可以走0这个位置
        if ((p1.x = curPoint.x + 2) < X & (p1.y = curPoint.y - 1) >= 0) {
            ps.add(new Point(p1));
        }
        //表示马儿可以走1这个位置
        if ((p1.x = curPoint.x + 2) < X & (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }
        //表示马儿可以走2这个位置
        if ((p1.x = curPoint.x + 1) < X & (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //表示马儿可以走3这个位置
        if ((p1.x = curPoint.x - 1) >= 0 & (p1.y = curPoint.y + 2) < Y) {
            ps.add(new Point(p1));
        }
        //表示马儿可以走4这个位置
        if ((p1.x = curPoint.x - 2) >= 0 & (p1.y = curPoint.y + 1) < Y) {
            ps.add(new Point(p1));
        }
        return ps;
    }

    /**
     * 完成骑士周游问题的算法
     *
     * @param chessboard 棋盘
     * @param row        马儿当前的位置的行从0开始
     * @param column     马儿当前的位置的列从0开始
     * @param step       是第几步,初始位置就是第1步
     */
    public static void traversalChessboard(int[][] chessboard, int row, int column, int step) {
        chessboard[row][column] = step;
        //row = 4 X= 8 column =4=4*8+4=36
        // 这一点因为 visited 是一维数组，所以这里需要转换一下，可以对比棋盘验证，
        // 这个计算方式是对的
        visited[row * X + column] = true; //标记该位置已经s访问
        //获取当前位置可以走的下一个位置的集合
        ArrayList<Point> ps = next(new Point(column, row));
        while (!ps.isEmpty()) {
            // 取出来下一个可以走的位置
            Point p = ps.remove(0);
            //判断该点是否已经访问过
            if (!visited[p.y * X + p.x]) {//说明还没访问过
                System.out.println("判断位置：x="+p.y +" y="+p.x);
                traversalChessboard(chessboard, p.y, p.x, step + 1);
            }
        }

        System.out.println("判断结果");

        //判断马儿是否完成了任务，使用step 和应该走的步数比较
        //如果没有达到数量，则表示没有完成任务，将整个棋盘置0
        //说明:step<X*Y成立的情况有两种
        //1.棋盘到目前位置,仍然没有走完
        //2.棋盘处于一个回溯过程
        if(step < X * Y && !finished ) {
            chessboard[row] [ column] = 0;
            visited[row * X + column] = false;
        }else {
            finished = true;
        }
    }

    /**
     * 完成骑士周游问题的算法
     *
     * 使用贪心算法对其进行优化
     *
     * @param chessboard 棋盘
     * @param row        马儿当前的位置的行从0开始
     * @param column     马儿当前的位置的列从0开始
     * @param step       是第几步,初始位置就是第1步
     */
    public static void traversalChessboardGreedy(int[][] chessboard, int row, int column, int step) {
        chessboard[row][column] = step;
        //row = 4 X= 8 column =4=4*8+4=36
        // 这一点因为 visited 是一维数组，所以这里需要转换一下，可以对比棋盘验证，
        // 这个计算方式是对的
        visited[row * X + column] = true; //标记该位置已经访问
        //获取当前位置可以走的下一个位置的集合
        ArrayList<Point> ps = next(new Point(column, row));
        // todo: 这里突出了贪心算法
        sort(ps);
        while (!ps.isEmpty()) {
            // 取出来下一个可以走的位置
            Point p = ps.remove(0);
            //判断该点是否已经访问过
            if (!visited[p.y * X + p.x]) {//说明还没访问过
//                System.out.println("判断位置：x="+p.y +" y="+p.x);
                traversalChessboardGreedy(chessboard, p.y, p.x, step + 1);
            }
        }

//        System.out.println("判断结果");

        //判断马儿是否完成了任务，使用step 和应该走的步数比较
        //如果没有达到数量，则表示没有完成任务，将整个棋盘置0
        //说明:step<X*Y成立的情况有两种
        //1.棋盘到目前位置,仍然没有走完
        //2.棋盘处于一个回溯过程
        if(step < X * Y && !finished ) {
            chessboard[row] [ column] = 0;
            visited[row * X + column] = false;
        }else {
            finished = true;
        }
    }

    //根据当前这个一步的所有的下一步的选择位置，进行非递减排序
    // 我们需要对fps中所有的Point的下-步的所有集合的数目，进行非递碗排序就ok,
    //  9, 7, 6, 5, 3, 2, 1//递减排序
    //  1, 2,3, 4,5,6, 10, //递增排序
    //  1,2,2, 2,3,3, 4,5, 6//非递减排序
    //  9, 7, 6,6,6,5, |3, 2, 1 //递增排序
    public static void sort(ArrayList<Point> Ps) {
        Ps.sort(new Comparator<Point>() {
            @Override
            public int compare(Point o1, Point o2) {
                // TODO Auto- generated method stub
                //获取到o1的下一步的所有位置个数
                int count1 = next(o1).size();
                //获取到o2的下一步的所有位置个数
                int count2 = next(o2).size();
                if(count1 < count2) {
                    return -1;
                } else if (count1 == count2) {
                    return 0;
                } else {
                    return 1;
                }
            }
        });
    }


}