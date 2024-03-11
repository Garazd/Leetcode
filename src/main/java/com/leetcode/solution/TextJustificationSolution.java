package com.leetcode.solution;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Text Justification</b>
 * <p>Level: <i>Hard</i></p>
 * <p>Given an array of strings words and a width maxWidth,
 * format the text such that each line has exactly maxWidth characters and is fully (left and right) justified.</p>
 *
 * @see <a href="https://leetcode.com/problems/text-justification/description/">68. Text Justification</a>
 */
public class TextJustificationSolution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();

        for (int i = 0, wordCount, lineLength; i < words.length; i += wordCount) {
            for (wordCount = 0, lineLength = 0; i + wordCount < words.length
                    && lineLength + words[i + wordCount].length() + wordCount <= maxWidth;
                 wordCount++) {
                lineLength += words[i + wordCount].length();
            }

            StringBuilder lineBuilder = new StringBuilder(words[i]);

            if (wordCount == 1 || i + wordCount == words.length) {
                for (int j = 1; j < wordCount; j++) {
                    lineBuilder.append(" ").append(words[i + j]);
                }
                lineBuilder.append(" ".repeat(maxWidth - lineBuilder.length()));
            } else {
                int totalSpaces = (maxWidth - lineLength) / (wordCount - 1);
                int extraSpaces = (maxWidth - lineLength) % (wordCount - 1);

                for (int j = 1; j < wordCount; j++) {
                    int spacesToAdd = totalSpaces + (extraSpaces-- > 0 ? 1 : 0);
                    lineBuilder.append(" ".repeat(spacesToAdd)).append(words[i + j]);
                }
            }
            result.add(lineBuilder.toString());
        }
        return result;
    }
}
