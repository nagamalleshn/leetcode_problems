package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaxConsecutiveOnesIII {
	public int longestOnes(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
      int maxfreq=0;
      int ans=0;
      int i=0;
      for(int j=0;j<nums.length;j++)
      {
        map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        maxfreq=Math.max(maxfreq,map.getOrDefault(1,0));
        while((j-i+1)-maxfreq>k)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)-1);
           
            i++;
        }
        ans=Math.max(ans,j-i+1);
      }
      return ans;
      
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
