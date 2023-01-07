package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class HIndexTest {

    private final HIndex hIndex = new HIndex();

    @Test
    void test1() {
        int[] input = {3, 0, 6, 1, 5};
        assertThat(executeSolution(input)).isEqualTo(3);
    }

    @Test
    void test2() {
        int[] input = {0};
        assertThat(executeSolution(input)).isEqualTo(0);
    }

    @Test
    void test3() {
        int[] input = {4, 4, 4};
        assertThat(executeSolution(input)).isEqualTo(3);
    }

    @Test
    void test4() {
        int[] input = {12, 11, 10, 9, 8, 1};
        assertThat(executeSolution(input)).isEqualTo(5);
    }

    @Test
    void test5() {
        int[] input = {88, 89};
        assertThat(executeSolution(input)).isEqualTo(2);
    }

    private int executeSolution(int[] input) {
        return hIndex.solution(input);
    }
}