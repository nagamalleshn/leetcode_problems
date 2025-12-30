package com.leetcode.binarysearch;

public class FindSmallestLetterGreaterThanTarget {
	
	
	public char nextGreatestLetter(char[] letters, char target) {
        char ans=letters[0];

        int low=0;
        int high=letters.length-1;
        while(low<=high)
        {
            int mid=low+(high-low)/2;

            if(letters[mid]>target)
            {
                ans=letters[mid];
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
