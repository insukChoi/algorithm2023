package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class IntegerTriangleTest {

    private static final IntegerTriangle solution = new IntegerTriangle();

    @Test
    void test1() {
        int[][] triangle = {{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
        assertThat(executeSolution(triangle)).isEqualTo(30);
    }

    private int executeSolution(int[][] triangle) {
        return solution.solution(triangle);
    }
}