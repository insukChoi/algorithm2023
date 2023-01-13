package com.muzi.algorithm.programmers;

/**
 * 깊이/너비 우선 탐색(DFS/BFS)
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/43162">네트워크</a>
 */
public class Network {
    private boolean[] visit = null;

    public int solution(int n, int[][] computers) {
        int answer = 0;
        visit = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visit[i]) {
                answer++;
                DFS(i, computers, n);
            }
        }

        return answer;
    }

    private void DFS(final int i, final int[][] computers, final int n) {
        visit[i] = true;

        for (int k = 0; k < n; k++) {
            if (!visit[k] && computers[i][k] == 1) {
                DFS(k, computers, n);
            }
        }
    }
}
