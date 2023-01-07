package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ProgressesSpeedsTest {

    @Test
    void test1() {
        int[] progresses = {93, 30, 55};
        int[] speeds = {1, 30, 5};

        int[] answer = {2, 1};
        assertThat(executeSolution(progresses, speeds)).isEqualTo(answer);
    }

    @Test
    void test2() {
        int[] progresses = {95, 90, 99, 99, 80, 99};
        int[] speeds = {1, 1, 1, 1, 1, 1};

        int[] answer = {1, 3, 2};
        assertThat(executeSolution(progresses, speeds)).isEqualTo(answer);
    }

    @Test
    void test3() {
        int[] progresses = {95, 96, 91};
        int[] speeds = {3, 3, 1};

        int[] answer = {2, 1};
        assertThat(executeSolution(progresses, speeds)).isEqualTo(answer);
    }

    private int[] executeSolution(int[] progresses, int[] speeds) {
        return new ProgressesSpeeds().solution(progresses, speeds);
    }
}