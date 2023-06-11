package com.muzi.algorithm.leetcode;

/**
 * 518. Coin Change II
 *
 * @see <a href="https://leetcode.com/problems/coin-change-ii/">coin-change-ii</a>
 */
public class CoinChange2_518 {
    public int change(int amount, int[] coins) {
        return coinChangeRecursive(amount, coins, 0);
    }

    private int coinChangeRecursive(int amount, int[] coins, int index) {
        if (amount == 0) {
            return 1; // 조합이 완성된 경우
        }

        if (amount < 0 || index >= coins.length) {
            return 0; // 불가능한 경우
        }

        int includeCurrent = coinChangeRecursive(amount - coins[index], coins, index); // 현재 동전을 포함시키는 경우
        int excludeCurrent = coinChangeRecursive(amount, coins, index + 1); // 현재 동전을 포함시키지 않는 경우

        return includeCurrent + excludeCurrent;
    }
}
