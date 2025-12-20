package com.practice.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Validat_Coupons {
	
	 public static List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
	        List<String> result = new ArrayList<>();

	        // Define valid business line order
	        List<String> validLines = Arrays.asList("electronics", "grocery", "pharmacy", "restaurant");
	        Map<String, List<String>> categorized = new HashMap<>();
	        
	        for (String line : validLines) {
	            categorized.put(line, new ArrayList<>());
	        }

	        for (int i = 0; i < code.length; i++) {
	            if (isActive[i]
	                && code[i] != null
	                && !code[i].isEmpty()
	                && code[i].matches("[a-zA-Z0-9_]+")
	                && categorized.containsKey(businessLine[i])) {

	                categorized.get(businessLine[i]).add(code[i]);
	            }
	        }

	        for (String line : validLines) {
	            List<String> codes = categorized.get(line);
	            Collections.sort(codes);
	            result.addAll(codes);
	        }

	        return result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] code={"GROCERY15","ELECTRONICS_50","DISCOUNT10"};
		String[] businessLine={"grocery","electronics","invalid"};
		boolean[] isActive= {false,true,true};
		List<String>  ans=validateCoupons(code, businessLine, isActive);
		System.out.println(ans);
	}

}
