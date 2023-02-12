package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GraphRankingTest {
    @Test
    void test1() {
        int n = 5;
        int[][] result = {{4, 3}, {4, 2}, {3, 2}, {1, 2}, {2, 5}};
        assertThat(executeSolution(n, result)).isEqualTo(2);
    }

    private int executeSolution(int n, int[][] result) {
        return new GraphRanking().solution(n, result);
    }
}