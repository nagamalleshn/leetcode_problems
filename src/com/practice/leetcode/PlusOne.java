package com.practice.leetcode;

import java.util.Arrays;

public class PlusOne {
	
    public static int[] plusOne(int[] digits) {
        int len=digits.length-1;

        for(int i=len;i>=0;i--)
        {
          if(digits[i]+1!=10)
          {
            digits[i]++;
            return digits;
          }
          digits[i]=0;
        }

        int[] ans=new int[digits.length+1];
        ans[0]=1;
    	System.out.println(Arrays.toString(ans));
        return ans;
       
    }
    
    public static void main(String[] args) {
    	
    	int[] input= {4,8,9};
    	
    	int[] ans=plusOne(input);
    	
    	System.out.println(Arrays.toString(ans));
		
	}

}
