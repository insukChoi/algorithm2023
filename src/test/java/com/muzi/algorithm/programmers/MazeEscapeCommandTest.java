package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MazeEscapeCommandTest {

    @Test
    void test1() {
        assertThat(getSolution( 3, 4, 2, 3, 3, 1, 5))
                .isEqualTo("dllrl");
    }

    @Test
    void test2() {
        assertThat(getSolution( 2, 2, 1, 1, 2, 2, 2))
                .isEqualTo("dr");
    }

    @Test
    void test3() {
        assertThat(getSolution( 3, 3, 1, 2, 3, 3, 4))
                .isEqualTo("impossible");
    }

    private static String getSolution(int n, int m, int x, int y, int r, int c, int k) {
        return new MazeEscapeCommand().solution(
                n, m, x, y, r, c, k
        );
    }
}