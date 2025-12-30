package com.leetcode.binarysearch;

public class ValidPerfectSquare {

	public boolean isPerfectSquare(int num) {

		if (num < 0)
			return false;
		if (num == 0 || num == 1)
			return true;

		long low = 1;
		long high = num / 2;

		while (low <= high) {
			long mid = low + (high - low) / 2;
			long sqr = mid * mid;

			if (sqr == num) {
				return true;
			} else if (sqr < num) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return false;
		// long sum=1;
		// long oddnum=1;
		// while(sum<=num)
		// {
		// if(sum==num)
		// {
		// return true;
		// }
		// oddnum+=2;
		// sum+=oddnum;

		// }
		// return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
