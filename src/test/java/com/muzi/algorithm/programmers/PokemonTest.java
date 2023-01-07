package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PokemonTest {

    private final Pokemon pokemon = new Pokemon();

    @Test
    void test1() {
        int[] input = {3,1,2,3};
        assertThat(executeSolution(input)).isEqualTo(2);
    }

    @Test
    void test2() {
        int[] input = {3,3,3,2,2,4};
        assertThat(executeSolution(input)).isEqualTo(3);
    }

    @Test
    void test3() {
        int[] input = {3,3,3,2,2,2};
        assertThat(executeSolution(input)).isEqualTo(2);
    }

    private int executeSolution(int[] input) {
        return pokemon.solution(input);
    }
}