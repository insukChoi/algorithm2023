package com.muzi.algorithm.leetcode;

import java.util.HashMap;

/**
 * 136. Single Number
 * @see <a href="https://leetcode.com/problems/single-number/">single-number</a>
 */
public class SingleNumber_136 {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int num : nums) {
            var mapOrDefault = hashMap.getOrDefault(num, 0);
            hashMap.put(num, ++mapOrDefault);
        }

        int answer = 0;
        for (Integer key : hashMap.keySet()) {
            if (hashMap.get(key) == 1) answer = key;
        }
        return answer;
    }
}
