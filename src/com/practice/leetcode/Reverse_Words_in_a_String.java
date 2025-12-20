package com.practice.leetcode;

import java.util.Arrays;

public class Reverse_Words_in_a_String {

	 public static String reverseWords(String s) {
		 String[] words=s.split("\\s+");
		 System.out.println(Arrays.toString(words));
	        
	        StringBuilder sb=new StringBuilder();
	        for(int i=words.length-1;i>=0;i--)
	        {
	        	String a=words[i].trim();
	        	sb.append(a+" ");
	        }
	        return sb.toString().trim();
	        
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans=reverseWords("a good   example");
		System.out.println(ans);
		

	}

}
