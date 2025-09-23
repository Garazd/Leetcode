package com.leetcode.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <b>Group Anagrams</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Given an array of strings strs, group the anagrams together. You can return the answer in any order.</p>
 *
 * @see <a href="https://leetcode.com/problems/group-anagrams/description/">49. Group Anagrams</a>
 */
public class GroupAnagramsSolution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) {
            return List.of(List.of(""));
        } else if (strs.length == 1) {
            return List.of(List.of(strs[0]));
        } else {
            Map<String, List<String>> map = new HashMap<>();

            for (String word : strs) {
                char[] chars = word.toCharArray();
                Arrays.sort(chars);
                String sortedWord = new String(chars);

                if (!map.containsKey(sortedWord)) {
                    map.put(sortedWord, new ArrayList<>());
                }

                map.get(sortedWord).add(word);
            }

            return new ArrayList<>(map.values());
        }
    }
}
