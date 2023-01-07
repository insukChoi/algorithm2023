package com.muzi.algorithm.programmers;

import java.util.Arrays;

/**
 * 정렬 > H-Index
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42747">H-Index</a>
 */
public class HIndex {
    public int solution(int[] citations) { // 3, 6,5
        int h = citations.length; // 5

        while (h >= 0) { // h = 3
            final int finalH = h;
            final long overHCount = Arrays.stream(citations).filter(i -> i >= finalH).count();
            if (finalH == overHCount) break;
            h--;
        }

        return Math.max(h, 0);
    }
}
