package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Candy_135Test {

    @Test
    void test1() {
        int[] ratings = {1,0,2};
        assertThat(executeSolution(ratings)).isEqualTo(5);
    }

    @Test
    void test2() {
        int[] ratings = {1,2,2};
        assertThat(executeSolution(ratings)).isEqualTo(4);
    }

    @Test
    void test3() {
        int[] ratings = {1,2,87,87,87,2,1};
        assertThat(executeSolution(ratings)).isEqualTo(13);
    }

    @Test
    void test4() {
        int[] ratings = {1,2,87,3,1};
        assertThat(executeSolution(ratings)).isEqualTo(9);
    }

    private int executeSolution(int[] ratings) {
        return new Candy_135().candy(ratings);
    }
}