package com.leetcode.string;

public class LongestContinuousIncreasingSubsequence {

	public int findLengthOfLCIS(int[] nums) {
		if (nums.length == 1) {
			return 1;
		}
		int ans = 0;
		int count = 1;
		int prev = nums[0];

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > prev) {
				count++;

			} else {
				ans = Math.max(ans, count);
				count = 1;

			}
			prev = nums[i];
			ans = Math.max(ans, count);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
