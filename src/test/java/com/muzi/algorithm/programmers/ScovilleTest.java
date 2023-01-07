package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ScovilleTest {

    @Test
    void test1() {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int K = 7;

        assertThat(executeSolution(scoville, K)).isEqualTo(2);
    }

    private int executeSolution(int[] scoville, int K) {
        return new Scoville().solution(scoville, K);
    }
}