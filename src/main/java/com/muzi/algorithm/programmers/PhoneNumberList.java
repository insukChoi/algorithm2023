package com.muzi.algorithm.programmers;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 해시 > 전화번호 목록
 *
 * @see [전화번호 목록](https://school.programmers.co.kr/learn/courses/30/lessons/42577)
 */
public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        Set<String> phoneSet = new HashSet<>(Arrays.asList(phone_book));
        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {
                final String substring = phone.substring(0, i);
                if (phoneSet.contains(substring)) {
                    return false;
                }
            }
        }
        return true;
    }
}
