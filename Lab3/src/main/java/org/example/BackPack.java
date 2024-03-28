package org.example;

public class BackPack {

    public static int backpack(int[] weights, int[] values, int capacity) {
        for (int weight : weights) {
            if (weight < 0) {
                return 0;
            }
        }
        for (int value : values) {
            if (value < 0) {
                return 0;
            }
        }
        if (capacity < 0) {
            return 0;
        }
        if (weights.length == 0 || values.length == 0 || capacity == 0) {
            return 0;
        }
        int n = weights.length;
        int[][] dp = new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= capacity; j++) {
                if (weights[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weights[i - 1]] + values[i - 1]);
                }
            }
        }

        return dp[n][capacity];
    }
}
