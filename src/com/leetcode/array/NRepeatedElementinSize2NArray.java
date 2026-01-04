package com.leetcode.array;

import java.util.HashSet;
import java.util.Set;

public class NRepeatedElementinSize2NArray {
	
	  public int repeatedNTimes(int[] nums) {
	        Set<Integer> seen = new HashSet<>();
	        
	        for (int num : nums) {
	            if (!seen.add(num)) {
	                return num; // first repeated element
	            }
	        }
	        return -1; // not possible as per constraints
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
