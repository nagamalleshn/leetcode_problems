package com.practice.leetcode;

import java.util.Map;
import java.util.TreeMap;

public class Shuffle_String {
	
	   public static String restoreString1(String s, int[] indices) {
		   char[] arr= new char[s.length()];
	          for(int i=0;i<s.length();i++){
	         arr[indices[i]]=s.charAt(i);
	              }
	           return new String(arr);
	    }
	   public static String restoreString(String s, int[] indices) {
	        StringBuilder ans=new StringBuilder();
	        TreeMap<Integer, Character> map=new TreeMap<Integer, Character>();
	        for(int i=0;i<s.length();i++)
	        {
	        	map.put(indices[i], s.charAt(i));
	        }
	        for(Map.Entry<Integer, Character> entry:map.entrySet())
	        {
	        	ans.append(entry.getValue());
	        }
	       
	        return ans.toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,5,6,7,0,2,1,3};
		String ans=restoreString1("codeleet", arr);
		System.out.println(ans);

	}

}
