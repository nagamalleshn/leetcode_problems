package com.practice.leetcode;

import java.util.*;

public class MinimumDifferenceInSums {
    public long minimumDifference(int[] nums) {
        int n = nums.length / 3;
        int len = nums.length;

        long[] leftSum = new long[len];
        long[] rightSum = new long[len];

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        long sumLeft = 0;

        // Process left side (get n smallest values in first 2n elements)
        for (int i = 0; i < len; i++) {
            maxHeap.add(nums[i]);
            sumLeft += nums[i];

            if (maxHeap.size() > n) {
                sumLeft -= maxHeap.poll();
            }

            if (maxHeap.size() == n) {
                leftSum[i] = sumLeft;
            } else {
                leftSum[i] = Long.MAX_VALUE;
            }
        }
        System.out.println(Arrays.toString(leftSum));

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        long sumRight = 0;

        // Process right side (get n largest values in last 2n elements)
        for (int i = len - 1; i >= 0; i--) {
            minHeap.add(nums[i]);
            sumRight += nums[i];

            if (minHeap.size() > n) {
                sumRight -= minHeap.poll();
            }

            if (minHeap.size() == n) {
                rightSum[i] = sumRight;
            } else {
                rightSum[i] = Long.MIN_VALUE;
            }
        }
        
        System.out.println(Arrays.toString(rightSum));

        // Calculate min difference
        long result = Long.MAX_VALUE;
        for (int i = n - 1; i < 2 * n; i++) {
            result = Math.min(result, leftSum[i] - rightSum[i + 1]);
        }

        return result;
    }

    public static void main(String[] args) {
        MinimumDifferenceInSums sol = new MinimumDifferenceInSums();
        int[] nums = {7,9,5,8,1,3}; // Example: 3n = 9
        System.out.println(sol.minimumDifference(nums)); // Output depends on input
    }
}
