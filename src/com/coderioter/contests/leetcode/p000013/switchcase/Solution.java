/**
 * 
 */
package com.coderioter.contests.leetcode.p000013.switchcase;


/**
 * @author coderioter
 * 
 * <h3>13. Roman to Integer</h3>
 * https://leetcode.com/problems/roman-to-integer/description/?envType=study-plan-v2&envId=google-spring-23-high-frequency
 * Google Problems
 * 
 * Symbol       Value
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 
 * IV            4
 * IX            9
 * XL            40
 * XC            90
 * CD            400
 * CM            900
 *
 */
public class Solution {
    public int romanToInt(String s) {
    	int n = 0;
    	for(int i=0;i<s.length();i++) {
    		char ch = s.charAt(i);
    		switch(ch) {
    		case 'I':
    			if(i+1<s.length() && s.charAt(i+1)=='X') {n+=9;++i;}
    			else if(i+1<s.length() && s.charAt(i+1)=='V') {n+=4;++i;}
    			else n+=1;
    			break;
    		case 'V': n+=5; break;
    		case 'X': 
    			if(i+1<s.length() && s.charAt(i+1)=='L') {n+=40;++i;}
    			else if(i+1<s.length() && s.charAt(i+1)=='C') {n+=90;++i;}
    			else n+=10;
    			break;
    		case 'L': n+=50; break;
    		case 'C': 
    			if(i+1<s.length() && s.charAt(i+1)=='D') {n+=400;++i;}
    			else if(i+1<s.length() && s.charAt(i+1)=='M') {n+=900;++i;}
    			else n+=100;
    			break;
    		case 'D': n+=500; break;
    		case 'M': n+=1000;break;
    		default: n+=0;
        	}
    	}
    	return n;
    	
    }

	public static void main(String[] args) {

		String[] testCases = new String[] { "III", "LVIII", "MCMXCIV" };
		int[] expected = new int[] { 3,58,1994};
		Solution s = new Solution();

		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < testCases.length; i++) {

			int actual = s.romanToInt(testCases[i]);
			if ((expected[i] == actual)) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" + "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}

}
