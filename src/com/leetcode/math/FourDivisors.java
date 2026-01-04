package com.leetcode.math;

public class FourDivisors {

	public int divisors(int n) {
		if (n < 6)
			return 0;

		int divisor = 0;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				if (divisor == 0) {
					divisor = i; // first divisor found
				} else {
					return 0; // more than one divisor → not 4 divisors
				}
			}
		}

		// valid only if exactly one divisor pair exists and not a perfect square
		if (divisor != 0 && divisor * divisor != n) {
			return 1 + n + divisor + (n / divisor);
		}

		return 0;

	}

	public int sumFourDivisors(int[] nums) {
		int ans = 0;
		for (int i : nums) {
			ans += divisors(i);
		}

		return ans;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
