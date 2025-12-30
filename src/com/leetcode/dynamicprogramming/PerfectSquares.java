package com.leetcode.dynamicprogramming;

public class PerfectSquares {
	
	public int numSquares(int n) {

        int[] dp=new int[n+1];

        for(int i=1;i<=n;i++){
            dp[i]=Integer.MAX_VALUE;
            for(int j=1;j<=Math.sqrt(n);j++)
            {
              int sqr=j*j;
              if(sqr<=i && dp[i-sqr]!=Integer.MAX_VALUE)
              {
                dp[i]=Math.min(dp[i],dp[i-sqr]+1);
              }
            }
        }
        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
