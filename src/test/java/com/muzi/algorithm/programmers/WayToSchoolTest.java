package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class WayToSchoolTest {
    @Test
    void test1() {
        int m = 4;
        int n = 3;
        int[][] puddles = {{2,2}};

        assertThat(executeSolution(m, n, puddles)).isEqualTo(4);
    }

    private int executeSolution(int m, int n, int[][] puddles) {
        return new WayToSchool().solution(m, n, puddles);
    }
}