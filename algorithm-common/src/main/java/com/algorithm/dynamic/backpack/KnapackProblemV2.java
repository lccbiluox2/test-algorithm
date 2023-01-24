package com.algorithm.dynamic.backpack;

public class KnapackProblemV2 {

    ///i... 的货物自由选择，形成的最大价值返回
    // 重要永远不要超过bag
    // 之前做的决定，所达到的重量，alreadyweight
    public static int process1(int[] weights, int[] values,
                               int i, int alreadyweight, int bag) {
        if (alreadyweight > bag) {
            return 0;
        }
        if (i == weights.length) {
            return 0;
        }
        return Math.max(
                process1(weights, values, i
                        + 1, alreadyweight, bag),
                values[i] + process1(weights, values,
                        i + 1,
                        alreadyweight + weights[i], bag));
    }

}
