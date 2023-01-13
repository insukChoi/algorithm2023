package com.muzi.algorithm.leetcode;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MountainArray_852Test {

    @Test
    void test1() {
        int[] input = {0,1,0};
        assertThat(executeSolution(input)).isEqualTo(1);
    }

    @Test
    void test2() {
        int[] input = {0,1,1,0};
        assertThat(executeSolution(input)).isEqualTo(1);
    }

    @Test
    void test3() {
        int[] input = {0,10,5,2};
        assertThat(executeSolution(input)).isEqualTo(1);
    }

    @Test
    void test4() {
        int[] input = {40,48,61,75,100,99,98,39,30,10};
        assertThat(executeSolution(input)).isEqualTo(4);
    }

    @Test
    void test5() {
        int[] input = {3,4,5,1};
        assertThat(executeSolution(input)).isEqualTo(2);
    }

    @Test
    void test6() {
        int[] input = {18,29,38,59,98,100,99,98,90};
        assertThat(executeSolution(input)).isEqualTo(5);
    }

    private int executeSolution(int[] input) {
        return new MountainArray_852().peakIndexInMountainArray(input);
    }
}