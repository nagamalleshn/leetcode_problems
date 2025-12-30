package com.leetcode.string;

public class ConsecutiveCharacters {

	public int maxPower(String s) {
		if (s.length() == 1) {
			return 1;
		}
		int ans = 0;
		char a = s.charAt(0);
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (a == s.charAt(i)) {
				count++;
			} else {
				ans = Math.max(ans, count);
				a = s.charAt(i);
				count = 1;
			}
			ans = Math.max(ans, count);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
