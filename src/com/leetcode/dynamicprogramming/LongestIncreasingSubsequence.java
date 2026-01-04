package com.leetcode.dynamicprogramming;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
	
	public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] ans = new int[n];
         Arrays.fill(ans, 1);
         for(int i=1;i<n;i++)
         {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    ans[i]=Math.max(ans[i],ans[j]+1);
                }
            }
         }
         int res=0;
         for(int i:ans)
         {
            res=Math.max(res,i);
         }
         return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
