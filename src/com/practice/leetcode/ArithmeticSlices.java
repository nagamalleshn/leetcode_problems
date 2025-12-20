package com.practice.leetcode;

public class ArithmeticSlices {
	
	   public int numberOfArithmeticSlices(int[] nums) {
	        
	        int res=0;
	        int dp=0;

	        for(int i=2;i<nums.length;i++)
	        {
	            if(nums[i-2]-nums[i-1]==nums[i-1]-nums[i])
	            {
	                dp=dp+1;
	                res+=dp;
	            }else{
	                dp=0;
	            }
	        }
	        return res;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
