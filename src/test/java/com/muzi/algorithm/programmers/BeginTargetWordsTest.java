package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BeginTargetWordsTest {

    @Test
    void test1() {
        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        assertThat(executeSolution(begin, target, words)).isEqualTo(4);
    }

    private int executeSolution(String begin, String target, String[] words) {
        return new BeginTargetWords().solution(begin, target, words);
    }
}