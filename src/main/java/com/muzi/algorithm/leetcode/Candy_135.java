package com.muzi.algorithm.leetcode;

import java.util.Arrays;

/**
 * 135. Candy
 * @see <a href="https://leetcode.com/problems/candy/submissions/">Candy</a>
 * {@link screenshot/Candy_135.png}
 */
public class Candy_135 {
    public int candy(int[] ratings) {
        if (ratings.length == 1) return 1;

        int[] candies = new int[ratings.length];
        Arrays.fill(candies, 1);

        for (int i = 0; i < ratings.length; i++) {
            calculateCandies(ratings, candies, i);
        }

        for (int i = candies.length - 1; i >= 0; i--) {
            calculateCandies(ratings, candies, i);
        }

        return Arrays.stream(candies).sum();
    }

    private void calculateCandies(final int[] ratings, final int[] candies, final int i) {
        if (i == 0) {
            if (ratings[0] > ratings[1])
                candies[0] = candies[0] > candies[1] ? candies[0] : candies[1]+1;
        }
        else if (i == ratings.length - 1) {
            if (ratings[ratings.length - 1] > ratings[ratings.length - 2])
                candies[ratings.length - 1] = candies[ratings.length - 1] > candies[ratings.length - 2]
                        ? candies[ratings.length - 1] : candies[ratings.length - 2] + 1;
        }
        else {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i] > candies[i -1] ? candies[i] : candies[i -1] + 1;
            }
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = candies[i] > candies[i +1] ? candies[i] : candies[i +1] + 1;
            }
        }
    }
}
