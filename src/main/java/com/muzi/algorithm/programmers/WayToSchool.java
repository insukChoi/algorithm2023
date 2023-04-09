package com.muzi.algorithm.programmers;

/**
 * 동적계획법 > 등굣길
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42898">등굣길</a>
 */
public class WayToSchool {
    public int solution(int m, int n, int[][] puddles) {
        int[][] dp = new int[n][m];

        for (final int[] i : puddles) {
            dp[i[1] - 1][i[0] - 1] = -1;
        }
        dp[0][0] = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dp[i][j] == 0) {
                    if (i != 0 && dp[i - 1][j] != -1)
                        dp[i][j] += dp[i - 1][j];
                    if (j != 0 && dp[i][j - 1] != -1)
                        dp[i][j] += dp[i][j - 1];
                    dp[i][j] %= 1000000007;
                }
            }
        }
        return dp[n - 1][m - 1];
    }
}
