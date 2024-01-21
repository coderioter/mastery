package com.coderioter.contests.leetcode.p001137.iterative;
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
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        int m0=0,m1=1,m2=1;
        for(int i=3;i<=n;i++){
            int current = m0+m1+m2;
            m0=m1;
            m1=m2;
            m2=current;
        }
        return m2;
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