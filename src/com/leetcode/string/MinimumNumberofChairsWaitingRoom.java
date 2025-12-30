package com.leetcode.string;

public class MinimumNumberofChairsWaitingRoom {

	public int minimumChairs(String s) {
		int ans = 0;
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'E') {
				count++;
			} else {
				ans = Math.max(ans, count);
				count--;
			}
			ans = Math.max(ans, count);

		}
		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
