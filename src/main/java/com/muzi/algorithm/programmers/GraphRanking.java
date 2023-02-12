package com.muzi.algorithm.programmers;

/**
 * 그래프 > 순위
 * @see [그래프 순위](https://school.programmers.co.kr/learn/courses/30/lessons/49191)
 */
public class GraphRanking {
    public int solution(int n, int[][] results) {
        int answer = 0;
        int[][] graph = new int[n + 1][n + 1];

        for (final int[] result : results) {
            graph[result[0]][result[1]] = 1;
            graph[result[1]][result[0]] = -1;
        }

        for (int k = 1; k <= n; k++) { // 들렀다 가는곳
            for (int i = 1; i <= n; i++) { // 시작
                for (int j = 1; j <= n; j++) { // 도착
                    if (i == j || graph[i][j] != 0) continue;
                    if (graph[i][k] == graph[k][j]) graph[i][j] = graph[i][k];
                }
            }
        }

        // 자기 자신을 제외하고 전부 겨루어 봤으면 answer++
        loop:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) continue;
                if (graph[i][j] == 0) continue loop;
            }
            answer++;
        }
        return answer;
    }
}
