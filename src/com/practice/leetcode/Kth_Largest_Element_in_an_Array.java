package com.practice.leetcode;

import java.util.PriorityQueue;

public class Kth_Largest_Element_in_an_Array {
	
	  public int findKthLargest(int[] nums, int k) {
	        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	        for(int i:nums)
	        {
	        	pq.add(i);
	        	if(pq.size()>k)
	        	{
	        		pq.poll();
	        	}
	        }
	       return  pq.peek();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
