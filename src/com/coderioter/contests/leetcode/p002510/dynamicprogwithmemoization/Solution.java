package com.coderioter.contests.leetcode.p002510.dynamicprogwithmemoization;

import java.util.HashMap;
import java.util.Map;

class Solution {
	Map<String,Boolean> memo; 
    public boolean isThereAPath(int[][] grid) {
        memo = new HashMap<>();
        return dyn(grid, 0,0,0);
    }
    public boolean dyn(int[][] grid, int i, int j, int count){
        if(i>grid.length-1 || j>grid[0].length-1){
            return false;
        }
        String key = new String(i+":"+j+":"+count);
        if(memo.containsKey(key)){
            return memo.get(key);
        } 
        count+=grid[i][j]==1?1:-1;
        if(i==grid.length-1 && j==grid[0].length-1){
            return count==0;
        }
        String key1 = new String((i+1)+":"+j+":"+count);
        String key2 = new String(i+":"+(j+1)+":"+count);

        memo.put(key1,dyn(grid,i+1,j,count));
        memo.put(key2,dyn(grid,i,j+1,count));
        return memo.get(key1)||memo.get(key2);
    }
	public static void main(String[] args) {

		int[][][] testCases = new int[][][] {
			{{0,1,0,0},{0,1,0,0},{1,0,1,1}},
			{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0},{1,0,1,0}},
			{
				{0,0,0,1,1,1,0,1,1,1,1,1,0,0,0},
				{1,1,1,1,0,0,0,1,1,0,0,0,1,1,1},
				{1,1,1,0,0,1,0,1,1,1,0,0,0,1,1},
				{1,1,0,1,0,1,1,0,0,0,1,1,0,1,0},
				{1,1,1,1,0,0,0,1,1,1,0,0,0,1,1},
				{1,0,1,1,0,0,1,1,1,1,1,1,0,0,0},
				{0,1,0,0,1,1,1,1,0,0,1,1,1,0,0},
				{0,0,1,0,0,0,0,1,1,0,0,1,0,0,0},
				{1,0,1,0,0,1,0,0,0,0,0,0,1,0,1},
				{1,1,1,0,1,0,1,0,1,1,1,0,0,1,0}},
			
			
			
		};
		boolean[] expected = new boolean[] { true,true,true};
		Solution s = new Solution();

		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < testCases.length; i++) {
			boolean actual = s.isThereAPath(testCases[i]);
			if (expected[i]==actual) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" + "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}
}