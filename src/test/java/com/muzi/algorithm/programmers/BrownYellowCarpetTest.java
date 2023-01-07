package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BrownYellowCarpetTest {

    private final BrownYellowCarpet brownYellowCarpet = new BrownYellowCarpet();

    @Test
    void test1() {
        int brown = 10;
        int yellow = 2;
        assertThat(executeSolution(brown, yellow)).isEqualTo(new int[]{4, 3});
    }

    @Test
    void test2() {
        int brown = 8;
        int yellow = 1;
        assertThat(executeSolution(brown, yellow)).isEqualTo(new int[]{3, 3});
    }

    @Test
    void test3() {
        int brown = 24;
        int yellow = 24;
        assertThat(executeSolution(brown, yellow)).isEqualTo(new int[]{8, 6});
    }

    private int[] executeSolution(int brown, int yellow) {
        return brownYellowCarpet.solution(brown, yellow);
    }
}

