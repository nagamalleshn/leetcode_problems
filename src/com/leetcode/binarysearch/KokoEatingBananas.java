package com.leetcode.binarysearch;

public class KokoEatingBananas {
	
	public boolean canEatbanana(int[] piles, int h,int n)
    {
        long hours=0;
        for(int pile:piles)
        {
            hours+=(pile+n-1)/n;
        }
       return hours<=h;

    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int ans=0;
        for(int pile:piles)
        {
            high=Math.max(high,pile);
        }

        while(low<=high)
        {
           int mid=low+(high-low)/2;

           if(canEatbanana(piles,h,mid))
           {
            ans=mid;
            high=mid-1;

           }
           else
           {
            low=mid+1;
           }
           

        }
        return ans;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
