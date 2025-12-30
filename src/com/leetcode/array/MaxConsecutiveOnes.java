package com.leetcode.array;

public class MaxConsecutiveOnes {
	public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int ans=0;

        for(int i:nums)
        {
            if(i==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            
            ans=Math.max(ans,count);
           
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] ans= {1,0,1,1,0,1};
		int res=findMaxConsecutiveOnes(ans);
		System.out.println(":res"+res);

	}

}
