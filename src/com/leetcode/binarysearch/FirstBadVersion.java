package com.leetcode.binarysearch;

public class FirstBadVersion {
	 boolean isBadVersion(int version) {
		 return true;
	 }
	public int firstBadVersion(int n) {
        int bad=Integer.MAX_VALUE;

        int low=1;
        int high=n;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(isBadVersion(mid))
            {
                bad=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }

        return bad;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a'<'b');

	}

}
