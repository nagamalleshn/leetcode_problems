package com.leetcode.slidingwindow;

import java.util.List;

public class MinimumPositiveSumSubarray {
	
	public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=i;j<n;j++)
            {
                sum+=nums.get(j);
                if(j-i+1>=l && j-i+1<=r && sum>0)
                {
                    ans=Math.min(ans,sum);
                }
                if(j-i+1>r)
                {
                  break;
                }
            }
        }
        return ans==Integer.MAX_VALUE?-1 :ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
