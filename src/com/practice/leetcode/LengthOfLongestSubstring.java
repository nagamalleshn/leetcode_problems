package com.practice.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LengthOfLongestSubstring {
	
    public static int lengthOfLongestSubstring(String s) {
    	
    	int len=s.length();
    	
    	Set<Character> set=new HashSet<>();
    	
    	int left=0;
    	int right=0;
    	int max=0;
    	
    	for(int i=0;i<len;i++)
    	{
    		while(set.contains(s.charAt(i)))
    		{
    			set.remove(s.charAt(left));
    			left++;
    		}
    		
    		set.add(s.charAt(i));
    		max=Math.max(max, i-left+1);
    	}
    	
    	
		return max;
        
    }

	public static void main(String[] args) {
		System.out.println("main");
		
		System.out.println(lengthOfLongestSubstring("abcabcbb"));

	}

}
