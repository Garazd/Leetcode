package com.leetcode.solution;

/**
 * <b>Integer to Roman</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Given an integer, convert it to a roman numeral.</p>
 *
 * @see <a href="https://leetcode.com/problems/integer-to-roman/description/">12. Integer to Roman</a>
 */
public class IntegerToRomanSolution {
    public String intToRoman(int num) {
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] roman = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder result = new StringBuilder();
        for (int i = values.length - 1; i >= 0 && num > 0; i--) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(roman[i]);
            }
        }
        return result.toString();
    }
}
