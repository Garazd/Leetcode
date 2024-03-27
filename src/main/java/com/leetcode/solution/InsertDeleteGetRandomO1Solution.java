package com.leetcode.solution;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * <b>Insert Delete GetRandom O(1)</b>
 * <p>Level: <i>Medium</i></p>
 * <p>Implement the RandomizedSet class:
 * RandomizedSet() Initializes the RandomizedSet object.
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that
 * at least one element exists when this method is called). Each element must have the same probability of being returned.
 * You must implement the functions of the class such that each function works in average O(1) time complexity.</p>
 *
 * @see <a href="https://leetcode.com/problems/insert-delete-getrandom-o1/description/">380. Insert Delete GetRandom O(1)</a>
 */
public class InsertDeleteGetRandomO1Solution {
    List<Integer> integers;
    Map<Integer, Integer> integerMap;
    Random random = new Random();

    public InsertDeleteGetRandomO1Solution() {
        integers = new ArrayList<>();
        integerMap = new HashMap<>();
    }

    public boolean insert(int val) {
        boolean contain = integerMap.containsKey(val);
        if (contain) return false;
        integerMap.put(val, integers.size());
        integers.add(val);
        return true;
    }

    public boolean remove(int val) {
        boolean contain = integerMap.containsKey(val);
        if (!contain) return false;
        int loc = integerMap.get(val);
        if (loc < integers.size() - 1) {
            int lastOne = integers.get(integers.size() - 1);
            integers.set(loc, lastOne);
            integerMap.put(lastOne, loc);
        }
        integerMap.remove(val);
        integers.remove(integers.size() - 1);
        return true;
    }

    public int getRandom() {
        return integers.get(random.nextInt(integers.size()));
    }
}
