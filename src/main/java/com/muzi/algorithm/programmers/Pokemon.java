package com.muzi.algorithm.programmers;

import java.util.HashSet;

/**
 * 해시 > 포켓몬
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/1845">Pokemon</a>
 */
public class Pokemon {
    public int solution(int[] nums) {
        var hashSet = new HashSet<Integer>();
        for (int num : nums) {
            hashSet.add(num);
        }

        return Math.min(hashSet.size(), nums.length / 2);
    }
}