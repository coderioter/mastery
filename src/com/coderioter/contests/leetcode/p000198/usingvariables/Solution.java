package com.coderioter.contests.leetcode.p000198.usingvariables;
/**
 * @author coderioter
 * https://leetcode.com/problems/house-robber/
 * 
 * Also part of Dynamic Programming card
 * https://leetcode.com/explore/learn/card/dynamic-programming/631/strategy-for-solving-dp-problems/4148/
 *
 */
class Solution {
    int[] max;
    public int rob(int[] nums) {
        if(nums.length<=2){
            return nums.length==1?nums[0]:Math.max(nums[0],nums[1]);
        }
        int p=Math.max(nums[0],nums[1]),pp=nums[0];
        for(int i=2;i<nums.length;i++){
            int current = Math.max(p,pp+nums[i]);
            pp=p;
            p=current;
        }
        return p;
    }
	public static void main(String[] args) {
		Solution s =  new Solution();
		int[][] testCases = new int[][] {
			{1,2,3,1},
			{1},
			{2,7,9,3,1},
			{8, 9, 9, 4, 10, 5, 6, 9, 7, 9},
			{0,0,0,10,0,0,0,0,20,0,0,0,30,0,0,0,0,10},
			{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
		};
		int[] expected = { 4, 1, 12, 45, 70, 0 };
	
		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("-----------------------------------");
		for(int i=0;i<testCases.length;i++) {
			int actual = s.rob(testCases[i]);
			System.out.println(actual +"\t\t"+expected[i]+"\t\t"+((expected[i]==actual)?"Passed":"Failed"));
		}
	}
}
