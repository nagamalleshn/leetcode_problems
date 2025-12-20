package com.practice.leetcode;

public class Sum_of_Two_Integers {

    public static int getSum(int a, int b) {
        
        while(b!=0)
       {
           int carry=a&b;
           System.out.println("carry "+carry);
           a=a^b;
           System.out.println("a "+a);
           
           b=carry<<1;
           System.out.println("b "+b);
       }
       return a;
   }
	
	
	public static void main(String[] args) {
		
		int ans=getSum(5, 3);
		
		
		System.out.println(ans);
		
		int n=~(5);
		System.out.println("not of 5 is "+n);

	}

}
