/**
 * 
 */
package com.coderioter.contests.leetcode.p000013.elegant;

import java.util.HashMap;
import java.util.Map;

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
    	Map<Character,Integer> m = new HashMap<>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D', 500);
		m.put('M', 1000);
    	int p=-1;
		for(int i=s.length()-1;i>=0;i--) {
			int c=m.get(s.charAt(i));
			if(p!=-1 && c<p) {
				n-=c;
			}else {
				n+=c;
			}
			p=c;
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
