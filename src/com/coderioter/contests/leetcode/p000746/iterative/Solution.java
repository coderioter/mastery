package com.coderioter.contests.leetcode.p000746.iterative;
/**
 * @author coderioter
 *
 * 746. Min Cost Climbing Stairs :https://leetcode.com/problems/min-cost-climbing-stairs/description/
 * Dynamic Programming card
 * https://leetcode.com/explore/learn/card/dynamic-programming/631/strategy-for-solving-dp-problems/4040/
 * 
 * Recusive approach
 */
class Solution {
    public int minCostClimbingStairs(int[] cost) {
    	int p=0,pp=0,ans=0;
    	for(int i=0;i<cost.length;i++) {
    		int current=0;
   			current = Math.min(pp+cost[i], p+cost[i]);
    		pp=p;
    		p=current;
    		ans=Math.min(pp, p);
    	}
        return ans;
    }
    public int minRec(int i,int[] cost){
        if(i<2){
            return i<0?0:cost[i];
        }
        return Math.min(minRec(i-1,cost),minRec(i-2,cost))+cost[i];
    }
    public static void main(String[] args) {
    	
		int[][] testCases = new int[][]{{10,15,20},
			{1,100,1,1,1,100,1,1,100,1},
			{0,0,1,1},
			{0, 0, 0,0},
			{10, 15, 20, 9, 1, 22, 8},
			{10,15},
			{15,10}};
		int[] expected = new int[] { 15, 6, 1, 0, 33, 10, 10 };
		Solution s = new Solution();
		
		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < testCases.length; i++) {

			int actual = s.minCostClimbingStairs(testCases[i]);
			if((expected[i] == actual)) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" +  "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}
}