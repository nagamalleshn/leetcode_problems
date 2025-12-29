package com.leetcode.dynamicprogramming;

public class CoinChange {
	
	 public int coinChange(int[] coins, int amount) {

	        if(amount<1)
	           return 0;

	     int[] ans=new int[amount+1];

	     for(int i=1;i<=amount;i++)
	     {
	        ans[i]=Integer.MAX_VALUE;
	        for(int coin:coins)
	        {
	            if(coin<=i && ans[i-coin]!=Integer.MAX_VALUE)
	            {
	                ans[i]=Math.min(ans[i],ans[i-coin]+1);
	            }
	        }
	        
	     }
	        return ans[amount]==Integer.MAX_VALUE ? -1:ans[amount];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
