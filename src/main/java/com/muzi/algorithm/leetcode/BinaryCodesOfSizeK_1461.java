package com.muzi.algorithm.leetcode;

import java.util.Arrays;

/**
 * 1461. Check If a String Contains All Binary Codes of Size K
 *
 * @see <a href="https://leetcode.com/problems/check-if-a-string-contains-all-binary-codes-of-size-k/">check-if-a-string-contains-all-binary-codes-of-size-k</a>
 */
public class BinaryCodesOfSizeK_1461 {
    public boolean hasAllCodes(String s, int k) {
        int base = (int) (Math.pow(2, k) - 1);

        final String[] subStringArray = new String[(base + 1)];
        for (int i = 0; i <= base; i++) {
            subStringArray[i] = getBinaryString(i, k);
        }

        return Arrays.stream(subStringArray).allMatch(s::contains);
    }

    private String getBinaryString(final int i, final int k) {

        final String s = Integer.toBinaryString(i);
        if (s.length() >= k) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        while (sb.length() < k - s.length()) {
            sb.append('0');
        }
        sb.append(s);

        return sb.toString();
    }
}
