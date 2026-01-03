package com.leetcode.binarysearch;

public class FindMinimuminRotatedSortedArray {

	public int findMin(int[] nums) {
		int low = 0;
		int high = nums.length - 1;

		while (low < high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] > nums[high]) {
				low = mid + 1;
			} else if (nums[mid] < nums[high]) {
				high = mid;
			} else {
				// nums[mid] == nums[high]
				high--;
			}
		}
		return nums[low];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
