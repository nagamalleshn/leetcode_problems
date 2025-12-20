package com.practice.leetcode;

public class AddBinary {
	 public static int converttodecimal(String x)
	   {
	    int len=x.length();
	    int p2=1;
	    int num=0;
	    for(int i=len-1;i>=0;i--)
	    {
	        if(x.charAt(i)=='1')
	        {
	            num=num+p2;
	        }
	        p2=p2*2;
	    }
	     return num;
	   }

	   public static String convertobinary(int n)
	   {
	    String res="";
	    while(n>0)
	    {
	        if(n%2==1)
	        {
	            res+='1';
	        }
	        else
	        {
	            res+='0';
	        }
	        n=n/2;
	    }
	    return res;
	   }

	    public static String addBinary(String a, String b) {
	        int x=converttodecimal(a);
	        System.out.println("x "+x);
	      
	         int y=converttodecimal(b);
	         System.out.println("y "+y);
	         x=x+y;
	         
	         StringBuffer ans=new StringBuffer(convertobinary(x));
	         if(ans.isEmpty())
	         {
	        	 return "0";
	         }
	         
	         return ans.reverse().toString();
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String ans=addBinary("11", "1"); 
        System.out.println(ans);
	}

}
