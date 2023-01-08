package com.muzi.algorithm.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class NetworkTest {

    private final Network network = new Network();

    @Test
    void test1() {
        int n = 3;
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};

        Assertions.assertThat(network.solution(3, computers)).isEqualTo(2);
    }
}