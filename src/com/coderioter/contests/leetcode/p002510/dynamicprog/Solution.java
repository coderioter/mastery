package com.coderioter.contests.leetcode.p002510.dynamicprog;

class Solution {
    public boolean isThereAPath(int[][] grid) {
        return dyn(grid, 0,0,0);
    }
    public boolean dyn(int[][] grid, int i, int j, int count){
        if(i>grid.length-1 || j>grid[0].length-1){
            return false;
        }
        count+=grid[i][j]==1?1:-1;
        if(i==grid.length-1 && j==grid[0].length-1){
            return count==0;
        }
        return dyn(grid,i+1,j,count) || dyn(grid,i,j+1,count);
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