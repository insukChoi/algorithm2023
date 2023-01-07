package com.muzi.algorithm.programmers;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * 정렬 > 가장 큰 수
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42746">MaxNumber</a>
 */
public class MaxNumber {
    public String solution(int[] numbers) {
        List<Integer> combineList = new ArrayList<>();
        combineNumber(numbers, combineList, new ArrayList<>());
        combineList.sort(Comparator.reverseOrder());
        return combineList.get(0).toString();
    }

    private void combineNumber(final int[] numbers, final List<Integer> combineList, final List<Integer> combine) {
        if (numbers.length == combine.size()) {
            StringBuilder sb = new StringBuilder();
            combine.forEach(sb::append);
            combineList.add(Integer.parseInt(sb.toString()));
            return;
        }
        for (final int number : numbers) {
            if (combine.contains(number)) continue;
            combine.add(number);
            combineNumber(numbers, combineList, combine);
            combine.remove(combine.size() - 1);
        }
    }
}