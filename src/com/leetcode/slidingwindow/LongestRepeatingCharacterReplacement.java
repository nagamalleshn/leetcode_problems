package com.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {
	
	public int characterReplacement(String s, int k) {
        Map<Character,Integer> map=new HashMap<>();
        int maxfreq=0;
        int ans=0;
        int i=0;
        for(int j=0;j<s.length();j++)
        {
          map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
          maxfreq = Math.max(maxfreq, map.get(s.charAt(j)));
          while(((j-i+1)-maxfreq)>k)
          {
             map.put(s.charAt(i),map.get(s.charAt(i))-1);
            i++;
          }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
