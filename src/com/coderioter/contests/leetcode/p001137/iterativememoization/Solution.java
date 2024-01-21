package com.coderioter.contests.leetcode.p001137.iterativememoization;
/**
 * @author coderioter
 * 
 * <h2>1137. N-th Tribonacci Number</h2>
 * 
 * <a href="https://leetcode.com/problems/n-th-tribonacci-number/description/">https://leetcode.com/problems/n-th-tribonacci-number/description/</a>
 * <br>
 * Dynamic Programming card
 * <br>
 * https://leetcode.com/explore/learn/card/dynamic-programming/631/strategy-for-solving-dp-problems/4041/
 *
 */
class Solution {
	int[] mem;
    public int tribonacci(int n) {
    	mem = new int[n+1];
    	mem[0]=0;
    	mem[1]=1;
    	mem[2]=1;
        
        for(int i=3;i<=n;i++){
        	mem[i]=mem[i-1]+mem[i-2]+mem[i-3];
        }
        return mem[n];
    }

	public static void main(String[] args) {

		int[] testCases = new int[] { 4, 37, 25, 8, 15 };
		int[] expected = new int[] { 4, 2082876103, 1389537, 44, 3136 };
		Solution s = new Solution();

		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < testCases.length; i++) {

			int actual = s.tribonacci(testCases[i]);
			if ((expected[i] == actual)) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" + "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}
}