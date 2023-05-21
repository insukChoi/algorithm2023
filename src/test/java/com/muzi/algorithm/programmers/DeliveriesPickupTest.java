package com.muzi.algorithm.programmers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DeliveriesPickupTest {
    private final DeliveriesPickup deliveriesPickup = new DeliveriesPickup();

    @Test
    void test1() {
        int cap = 4;
        int n = 5;
        int[] deliveries = {1, 0, 3, 1, 2};
        int[] pickups = {0, 3, 0, 4, 0};

        assertThat(deliveriesPickup.solution(cap, n, deliveries, pickups))
                .isEqualTo(16);
    }

    @Test
    void test2() {
        int cap = 2;
        int n = 7;
        int[] deliveries = {1, 0, 2, 0, 1, 0, 2};
        int[] pickups = {0, 2, 0, 1, 0, 2, 0};

        assertThat(deliveriesPickup.solution(cap, n, deliveries, pickups))
                .isEqualTo(30);
    }
}