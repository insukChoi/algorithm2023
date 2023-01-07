package com.muzi.algorithm.leetcode;

import java.util.Collections;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * 1781. Sum of Beauty of All Substrings
 * @see <a href="https://leetcode.com/problems/sum-of-beauty-of-all-substrings/">Sum of Beauty of All Substring</a>
 */
public class SumBeautyOfAllSubstrings_1781 {
    public int beautySum(String s) {
        int answer = 0;
        for (int i = 0; i <= s.length(); i++) {
            for (int k = i+1; k <= s.length(); k++) {
                final String substring = s.substring(i, k);
                answer += getBeautyDifference(substring);
            }
        }

        return answer;
    }

    private int getBeautyDifference(final String s) {
        final TreeMap<Character, Integer> frequenciesMap = new String(s.toCharArray())
                .chars()
                .mapToObj(i -> (char) i)
                .collect(
                        Collectors.toMap(Function.identity(), aChar -> 1, Math::addExact, TreeMap::new)
                );
        Integer maxValue = Collections.max(frequenciesMap.values());
        Integer minValue = Collections.min(frequenciesMap.values());

        return maxValue - minValue;
    }
}
