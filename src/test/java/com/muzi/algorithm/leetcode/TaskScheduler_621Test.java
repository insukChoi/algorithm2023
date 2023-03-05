package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TaskScheduler_621Test {
    @Test
    void test1() {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 2;
        assertThat(executeSolution(tasks, n)).isEqualTo(8);
    }

    @Test
    void test2() {
        char[] tasks = {'A','A','A','B','B','B'};
        int n = 0;
        assertThat(executeSolution(tasks, n)).isEqualTo(6);
    }

    @Test
    void test3() {
        char[] tasks = {'A','A','A','A','A','A','B','C','D','E','F','G'};
        int n = 2;
        assertThat(executeSolution(tasks, n)).isEqualTo(16);
    }

    private int executeSolution(char[] tasks, int n) {
        return new TaskScheduler_621().leastInterval(tasks, n);
    }
}