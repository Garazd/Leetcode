package com.leetcode.solution;

/**
 * <b>Roman to Integer</b>
 * <p>Level: <i>Hard</i></p>
 * <p>Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * Given a roman numeral, convert it to an integer.</p>
 *
 * @see <a href="https://leetcode.com/problems/candy/description/">13. Roman to Integer</a>
 */
public class RomanToIntegerSolution {
    public int romanToInt(String s) {
        int result = 0;
        char[] charArray = s.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--) {
            if (charArray[i] == 'M') {
                if (i == 0) {
                    result += 1000;
                } else {
                    if (charArray[i - 1] == 'C') {
                        result += 900;
                        i--;
                    } else {
                        result += 1000;
                    }
                }
            } else if (charArray[i] == 'D') {
                if (i == 0) {
                    result += 500;
                } else {
                    if (charArray[i - 1] == 'C') {
                        result += 400;
                        i--;
                    } else {
                        result += 500;
                    }
                }
            } else if (charArray[i] == 'C') {
                if (i == 0) {
                    result += 100;
                } else {
                    if (charArray[i - 1] == 'X') {
                        result += 90;
                        i--;
                    } else {
                        result += 100;
                    }
                }
            } else if (charArray[i] == 'L') {
                if (i == 0) {
                    result += 50;
                } else {
                    if (charArray[i - 1] == 'X') {
                        result += 40;
                        i--;
                    } else {
                        result += 50;
                    }
                }
            } else if (charArray[i] == 'X') {
                if (i == 0) {
                    result += 10;
                } else {
                    if (charArray[i - 1] == 'I') {
                        result += 9;
                        i--;
                    } else {
                        result += 10;
                    }
                }
            } else if (charArray[i] == 'V') {
                if (i == 0) {
                    result += 5;
                } else {
                    if (charArray[i - 1] == 'I') {
                        result += 4;
                        i--;
                    } else {
                        result += 5;
                    }
                }
            } else if (charArray[i] == 'I') {
                result += 1;
            } else {
                result += 0;
            }
        }
        return result;
    }
}
