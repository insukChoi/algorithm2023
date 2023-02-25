package com.muzi.algorithm.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * 167. Two Sum II - Input Array Is Sorted
 *
 * @see [Input Array Is Sorted](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)
 */
public class TwoSum2_167 {
    public int[] twoSum(int[] numbers, int target) {
        final List<Integer> candidateNumbers = Arrays.stream(numbers)
                .boxed()
                .toList();

        int start = 0, end = 0;
        loop:
        for (int i = 0; i < candidateNumbers.size(); i++) {
            for (int j = i+1; j < candidateNumbers.size(); j++) {
                if (candidateNumbers.get(i) + candidateNumbers.get(j) == target) {
                    start = i;
                    end = j;
                    break loop;
                }
            }
        }

        return new int[]{start+1, end+1};
    }
}
