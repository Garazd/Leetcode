package com.leetcode.solution;

/**
 * <b>Zigzag Conversion</b>
 * <p>Level: <i>Medium</i></p>
 * <p>The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this:
 * (you may want to display this pattern in a fixed font for better legibility)
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * And then read line by line: "PAHNAPLSIIGYIR"</p>
 *
 * @see <a href="https://leetcode.com/problems/zigzag-conversion/description/">6. Zigzag Conversion</a>
 */
public class ZigzagConversionSolution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] stringBuilders = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            stringBuilders[i] = new StringBuilder();
        }
        char[] chars = s.toCharArray();
        int length = chars.length;
        int index = 0;
        while (index < length) {
            for (int i = 0; i < numRows && index < length; i++) {
                stringBuilders[i].append(s.charAt(index++));
            }
            for (int i = numRows - 2; i > 0 && index < length; i--) {
                stringBuilders[i].append(s.charAt(index++));
            }
        }
        StringBuilder result = stringBuilders[0];
        for (int i = 1; i < numRows; i++) {
            result.append(stringBuilders[i].toString());
        }
        return result.toString();
    }
}
