package com.leetcode.solution;

import java.io.Serial;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * <b>LRU Cache</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Design a data structure that follows the constraints of a Least Recently Used (LRU) cache.
 * Implement the LRUCache class:
 * LRUCache(int capacity) Initialize the LRU cache with positive size capacity.
 * int get(int key) Return the value of the key if the key exists, otherwise return -1.
 * void put(int key, int value) Update the value of the key if the key exists.
 * Otherwise, add the key-value pair to the cache. If the number of keys exceeds the capacity from this operation,
 * evict the least recently used key.
 * The functions get and put must each run in O(1) average time complexity.</p>
 *
 * @see <a href="https://leetcode.com/problems/partition-list/description/">146. LRU Cache</a>
 */
public class LRUCacheSolution {

    private final Map<Integer, Integer> cache;
    private final int SIZE;

    public LRUCacheSolution(int capacity) {
        SIZE = capacity;
        cache = new LinkedHashMap<>(capacity, 0.75f, true) {
            @Serial
            private static final long serialVersionUID = -5278988255986021032L;

            protected boolean removeEldestEntry(Map.Entry eldest) {
                return size() > SIZE;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
