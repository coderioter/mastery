package com.coderioter.contests.leetcode.p000125;


class Solution {
    public boolean isPalindrome(String s) {
        int l=0,r=s.length()-1;
        while(l<r){
            if(!Character.isLetterOrDigit(s.charAt(l))){
                ++l;
                continue;
            }if(!Character.isLetterOrDigit(s.charAt(r))){
                --r;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l))!=Character.toLowerCase(s.charAt(r))){
                return false;
            }
               ++l;--r;
        }
        
    return true;
    }
	public static void main(String[] args) {

		String[] testCases = new String[] { "A man, a plan, a canal: Panama", "race a car",
				"Eva, can I see bees in a cave?",
				"He lived as a devil, eh?"," " };
		boolean[] expected = new boolean[] { true,false,true,true,true};
		Solution s = new Solution();

		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < testCases.length; i++) {
			boolean actual = s.isPalindrome(testCases[i]);
			if (expected[i]==(actual)) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" + "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}
}