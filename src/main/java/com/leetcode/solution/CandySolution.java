package com.leetcode.solution;

import java.util.Arrays;

/**
 * <b>Candy</b>
 * <p>Level: <i>Hard</i></p>
 * <p>There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
 * You are giving candies to these children subjected to the following requirements:
 * Each child must have at least one candy.
 * Children with a higher rating get more candies than their neighbors.
 * Return the minimum number of candies you need to have to distribute the candies to the children.</p>
 *
 * @see <a href="https://leetcode.com/problems/candy/description/">135. Candy</a>
 */
public class CandySolution {
    public int candy(int[] ratings) {
        int count = ratings.length;
        int[] candies = new int[count];
        Arrays.fill(candies, 1);
        for (int i = 1; i < ratings.length; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candies[i] = candies[i - 1] + 1;
            }
        }
        for (int i = count - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
            }
        }
        int countCandies = 0;
        for (int candy : candies) {
            countCandies += candy;
        }
        return countCandies;
    }
}
