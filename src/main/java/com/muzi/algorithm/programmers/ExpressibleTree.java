package com.muzi.algorithm.programmers;

import java.util.ArrayList;
import java.util.List;

/**
 * 2023 KAKAO BLIND RECRUITMENT > 표현 가능한 이진트리
 *
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/150367">표현 가능한 이진트리</a>
 */
public class ExpressibleTree {
    public int[] solution(long[] numbers) {
        final List<Integer> answer = new ArrayList<>();

        for (final long number : numbers) {
            String binaryString = Long.toBinaryString(number);

            binaryString = padWithZeros(binaryString);

            // 누군가의 부모 노드는 항상 존재해야 함
            if (binaryString.charAt(binaryString.length() / 2) == '1' && check(binaryString, true)) {
                answer.add(1);
            } else {
                answer.add(0);
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }

    private boolean check(String numBinary, boolean prevParent) {
        // 중앙값(자손)을 기준으로 재귀적으로 확인
        int mid = numBinary.length() / 2;
        if (numBinary.isEmpty()) {
            return true;
        }

        boolean son = (numBinary.charAt(mid) == '1');

        // 내가 존재하면 부모가 존재해야 함
        if (son && !prevParent) {
            return false;
        } else {
            return check(numBinary.substring(mid + 1), son) && check(numBinary.substring(0, mid), son);
        }
    }

    private String padWithZeros(final String binaryString) {
        int exponent = 0;
        while (Math.pow(2, exponent) - 1 < binaryString.length()) {
            exponent++;
        }

        int targetLength = (int) (Math.pow(2, exponent) - 1);

        return "0".repeat(targetLength - binaryString.length()) + binaryString;
    }
}
