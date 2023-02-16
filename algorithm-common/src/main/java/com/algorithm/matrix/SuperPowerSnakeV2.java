package com.algorithm.matrix;

/**
 *todo: 2023/2/16 22:07 九师兄
 * 【算法】矩阵内的贪吃蛇，蛇最大长度
 *  https://blog.csdn.net/qq_21383435/article/details/129071814
 **/
public class SuperPowerSnakeV2 {

    public static class Info {
        public int no;//  不使用超能力达到的最大值
        public int yes;// 使用超能力达到的最大值

        public Info(int no, int yes) {
            this.no = no;
            this.yes = yes;
        }
    }

    public static int snake(int[][] matrix) {
        int ans = Integer.MIN_VALUE;
        Info[][] dp = new Info[matrix.length][matrix[0].length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                // 当前位置给我获取两种结果
                Info cur = f(matrix, row, col,dp);
                // 先求出当前最大值
                ans = Math.max(ans, Math.max(cur.yes, cur.no));
            }
        }
        return ans;
    }

    // 从最左侧出发（具体位置不关心），当前到达(row, col)
    //在这个旅程中， // no, 一次能力也不用，能达到的最大路径和（如果是负数，表示没有该答案）
    // yes，使用了一次能力，能达到的最大路径和（如果是负数，表示没有该答案）
    private static Info f(int[][] matrix, int row, int col,Info[][] dp) {
        // 使用动态规划缓存
        if(dp[row][col] != null){
            return dp[row][col];
        }

        // base case 如果是最左侧 那么说明蛇刚刚来，可能一次都不走，或者需要走
        if (col == 0) {
            // 如果你不用超能力 那么就是当前值 如果你用超能力那就是相反数
            // 这里不用考虑正负数，这俩必然有一个是正数，然后求最大值的时候必然是正数
            Info info = new Info(matrix[row][col], -matrix[row][col]);
            dp[row][col] = info;
            return info;
        }
        // 没有在最左边 那么可以有3种选择
        // 左上 到 当前位置
        // 左边 到 当前位置
        // 左下 到 当前位置

        int preNo = -1; // 我之前的旅程中，一次能力都没有使用，能达到最大路径和
        int preYes = -1; //我之前的旅程中，用过能力，能达到最大路径和

        // 可能性1 左上 到 当前位置
        if (row > 0) {
            Info leftUp = f(matrix, row - 1, col - 1,dp);
            if (leftUp.no >= 0) {
                preNo = leftUp.no;
            }
            if (leftUp.yes >= 0) {
                preYes = leftUp.yes;
            }
        }

        // 第二种可能性 左边 到 当前位置
        Info left = f(matrix, row, col - 1,dp);
        if (left.no >= 0) {
            preNo = Math.max(preNo, left.no);
        }
        if (left.yes >= 0) {
            preYes = Math.max(preYes, left.yes);
        }

        // 第3种可能性 左下 到 当前位置
        if (row < matrix.length - 1) {
            Info leftDown = f(matrix, row + 1, col - 1,dp);
            if (leftDown.no >= 0) {
                preNo = Math.max(preNo, leftDown.no);
            }
            if (leftDown.yes >= 0) {
                preYes = Math.max(preYes, leftDown.yes);
            }
        }

        // 上面考虑的是 到你的当前位置 你使用不使用能力
        // 现在你要根据上面的信息 根据你是否使用能力 加工出来，你的no和yes

        int no = -1;
        int yes = -1;

        if(preNo >= 0){
            // 我上次没有使用能力 加上现在我也不使用能力，可能加之前是正数
            // 加完之后是负数
            no = preNo+ matrix[row][col];

            // 但是之前你不用能力，你可以现在使用能力
            yes = preNo+ (-matrix[row][col]);
        }
        if(preYes >= 0){
            // 我上次使用能力 加上现在我不使用能力，可能加之前是正数
            // 加完之后是负数
            yes = Math.max(yes,preYes+ matrix[row][col]);
        }

        dp[row][col] = new Info(no,yes);
        return dp[row][col];
    }

}
