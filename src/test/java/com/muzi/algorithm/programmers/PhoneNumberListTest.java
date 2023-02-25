package com.muzi.algorithm.programmers;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;


class PhoneNumberListTest {
    private final PhoneNumberList phoneNumberList = new PhoneNumberList();

    @Test
    void test1() {
        String[] phone_book = {"119", "97674223", "1195524421"};

        Assertions.assertThat(phoneNumberList.solution(phone_book)).isFalse();
    }

    @Test
    void test2() {
        String[] phone_book = {"123","456","789"};

        Assertions.assertThat(phoneNumberList.solution(phone_book)).isTrue();
    }

    @Test
    void test3() {
        String[] phone_book = {"12","123","1235","567","88"};

        Assertions.assertThat(phoneNumberList.solution(phone_book)).isFalse();
    }
}