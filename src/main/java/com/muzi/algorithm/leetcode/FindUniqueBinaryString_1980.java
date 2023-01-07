package com.muzi.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 1980. Find Unique Binary String
 * @see <a href="https://leetcode.com/problems/find-unique-binary-string/">find-unique-binary-string</a>
 */
public class FindUniqueBinaryString_1980 {

    private static final int POW_BASE_NUM = 2;

    /**
     * 풀이)
     * nums 의 첫번째 원소를 꺼내, 바이너리 길이와 제곱을 구한다.
     * 0 부터 제곱값-1 까지 loop 를 돌면서 nums List 에 해당값이 있는지 확인하고,
     * 리스트에 없는 첫번째 값을 return 한다.
     *
     * ref : resources/screenshot/FindUniqueBinaryString_1980.png
     */
    public String findDifferentBinaryString(String[] nums) {
        final int numLength = nums[0].length();
        final double pow = Math.pow(POW_BASE_NUM, numLength);
        final List<String> numsList = Arrays.stream(nums).toList();

        for (int i = 0; i < pow; i++) {
            final String binaryString = Integer.toBinaryString(i).length() < numLength ?
                    "0".repeat(numLength - Integer.toBinaryString(i).length()) + Integer.toBinaryString(i)
                    : Integer.toBinaryString(i);
            if (!numsList.contains(binaryString))
                return binaryString;
        }

        return null;
    }
}