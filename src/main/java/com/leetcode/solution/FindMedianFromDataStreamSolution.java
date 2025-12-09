package com.leetcode.solution;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * <b>Find Median from Data Stream</b>
 * <p>Level: <i>Hard</i></p>
 *
 * <p>The median is the middle value in an ordered integer list. If the size of the list is even,
 * there is no middle value, and the median is the mean of the two middle values.
 * For example, for arr = [2,3,4], the median is 3.
 * For example, for arr = [2,3], the median is (2 + 3) / 2 = 2.5.
 * Implement the MedianFinder class:
 * MedianFinder() initializes the MedianFinder object.
 * void addNum(int num) adds the integer num from the data stream to the data structure.
 * double findMedian() returns the median of all elements so far. Answers within 10-5 of the actual answer will be accepted.</p>
 *
 * @see <a href="https://leetcode.com/problems/find-median-from-data-stream/description/">295. Find Median from Data Stream</a>
 */
public class FindMedianFromDataStreamSolution {
    private final PriorityQueue<Integer> lowerHalf;
    private final PriorityQueue<Integer> upperHalf;

    public FindMedianFromDataStreamSolution() {
        lowerHalf = new PriorityQueue<>(Collections.reverseOrder());
        upperHalf = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (lowerHalf.isEmpty() || num <= lowerHalf.peek()) {
            lowerHalf.offer(num);
        } else {
            upperHalf.offer(num);
        }

        if (lowerHalf.size() > upperHalf.size() + 1) {
            upperHalf.offer(lowerHalf.poll());
        } else if (upperHalf.size() > lowerHalf.size()) {
            lowerHalf.offer(upperHalf.poll());
        }
    }

    public double findMedian() {
        if (lowerHalf.size() > upperHalf.size()) {
            return lowerHalf.peek();
        }
        return (lowerHalf.peek() + upperHalf.peek()) / 2.0;
    }
}
