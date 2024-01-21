package com.coderioter.contests.leetcode.p000005.dynamicProgramming;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author coderioter
 * 
 *
 */
class Solution {
	public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }

        int maxLen = 1;
        int start = 0;
        int end = 0;
        boolean[][] dp = new boolean[s.length()][s.length()];

        for (int i = 0; i < s.length(); ++i) {
            dp[i][i] = true;
            for (int j = 0; j < i; ++j) {
                if (s.charAt(j) == s.charAt(i) && (i - j <= 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    if (i - j + 1 > maxLen) {
                        maxLen = i - j + 1;
                        start = j;
                        end = i;
                    }
                }
            }
        }

        return s.substring(start, end + 1);
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