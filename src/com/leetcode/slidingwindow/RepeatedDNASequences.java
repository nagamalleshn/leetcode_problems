package com.leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
        Set<String> ans=new HashSet<String>();
        Set<String> set=new HashSet<String>();
        int i=0;
        int j=10;
        while(j<=s.length())
        {
            if(set.contains(s.substring(i,j)))
            {
                ans.add(s.substring(i,j));
            }
            else{
                 set.add(s.substring(i,j));
            }
            
           i++;
           j++;
        }

        return new ArrayList<>(ans);


        
    }

}
