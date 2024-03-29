package com.leetcode.solution;

/**
 * <b>Gas Station</b>
 * <p>Level: <i>Medium</i></p>
 * <p>There are n gas stations along a circular route, where the amount of gas at the ith station is gas[i].
 * You have a car with an unlimited gas tank and it costs cost[i] of gas to travel
 * from the ith station to its next (i + 1)th station. You begin the journey with an empty tank at one of the gas stations.
 * Given two integer arrays gas and cost, return the starting gas station's index if you can travel around the circuit
 * once in the clockwise direction, otherwise return -1. If there exists a solution, it is guaranteed to be unique</p>
 *
 * @see <a href="https://leetcode.com/problems/gas-station/description/">134. Gas Station</a>
 */
public class GasStationSolution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tank = 0;
        int totalDiff = 0;
        int startIndex = 0;

        for (int i = 0; i < gas.length; i++) {
            int diff = gas[i] - cost[i];
            if (tank >= 0) {
                tank += diff;
            } else {
                tank = diff;
                startIndex = i;
            }
            totalDiff += diff;
        }
        if (totalDiff >= 0) {
            return startIndex;
        } else {
            return -1;
        }
    }
}
