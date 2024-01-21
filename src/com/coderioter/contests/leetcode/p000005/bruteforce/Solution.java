package com.coderioter.contests.leetcode.p000005.bruteforce;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author coderioter
 * 
 *
 */
class Solution {
    public String longestPalindrome(String s) {
    	//Create a PriorityQueue to sort strings by length
        PriorityQueue<String> l = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return Integer.compare( o2.length(),o1.length());
			}
		});
    	
    	for(int i=0;i<s.length();i++) {
    		int L=i,R=i;
    		//odd palindromes
    		//start with an index and compare characters to the left and right
    		while(L>=0 && R<s.length()) {
    			if(s.charAt(L)!=s.charAt(R)) {
    				break;
    			}
				L--;
				R++;
    		}
//    		if the size > 0 add it the priority queue
    		if(R-L-1>1) l.add(s.substring(L+1,R));
    		//even palindromes
    		////start with an index,index+1 and compare characters to the left and right
    		L=i;R=i+1;
    		while(L>=0 && R<s.length()) {
    			if(s.charAt(L)!=s.charAt(R)) {
    				break;
    			}
				L--;
				R++;
    		}

    		//if the size > 0 add it the priority queue
    		if(R-L-1>1) l.add(s.substring(L+1,R));
    	}
    	
        return l.isEmpty()?(s.length()>0?s.substring(0,1):""):l.remove();
    }
	public static void main(String[] args) {

		String[] testCases = new String[] { "racecar", "amanaplanacanalpanama", 
				"evacaniseebeesinacave",
				"helivedasadevileh","thisisaracecar","cbba","a","ac","bb" };
		String[] expected = new String[] { "racecar", "amanaplanacanalpanama", "evacaniseebeesinacave",
				"helivedasadevileh", "racecar", "bb", "a", "a","bb" };
		Solution s = new Solution();

		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < testCases.length; i++) {
			String actual = s.longestPalindrome(testCases[i]);
			if (expected[i].equals(actual)) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" + "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}
}