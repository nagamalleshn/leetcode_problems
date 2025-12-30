package com.leetcode.bitmanipulation;

public class CountingBits {
	
	public static int count(int n)
	{
		int count=0;
		while(n>0)
		{
			if(n%2==1)
			{
                count++;
			}
			n=n/2;
		}
		return count;
	}

    public int[] countBits(int n) {

        int[] ans=new int[n+1];

        for(int i=0;i<=n;i++)
        {
            ans[i]=count(i);
        }


        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
