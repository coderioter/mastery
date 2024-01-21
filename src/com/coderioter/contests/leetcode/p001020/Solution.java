package com.coderioter.contests.leetcode.p001020;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


/**
 * @author coderioter
 * <h3>1020. No. of Enclaves</h3>
 * <a href="https://leetcode.com/problems/number-of-enclaves/description/" >
 * https://leetcode.com/problems/number-of-enclaves/description/
 * </a>
 *
 */
class Solution {
//	int[][] random ;
    public int numEnclaves(int[][] grid) {
//    	random = new int[grid.length][grid[0].length];
//    	for(int[] rand:random)
//    		Arrays.fill(rand,0);
        boolean[][] visited = new boolean [grid.length][grid[0].length];
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1 && !visited[i][j]){
                    count+=bfs(grid,visited,i,j);
                }else visited[i][j]=true;
            }
        }
//        for(int[] rand: random)
//        	System.out.println(Arrays.toString(rand));
        return count;
    }
    public int bfs(int[][] grid, boolean[][] visited,int i, int j){
        int[][] dir = new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        boolean isClosed=true;
        int count=0;
        while(!q.isEmpty()){
            int[] c = q.remove();
            if(!visited[c[0]][c[1]]) ++count;
            visited[c[0]][c[1]]=true;
//            ++random[c[0]][c[1]];
            for(int[] d:dir){
                int nr = c[0]+d[0];
                int nc = c[1]+d[1];
                if(nr<0||nc<0||nr>grid.length-1||nc>grid[0].length-1){
                    isClosed=false;
                }else if(grid[nr][nc]==1 && !visited[nr][nc]){
                    q.add(new int[]{nr,nc});
                }else{ visited[nr][nc]=true;}
            }
        }
        return isClosed?count:0;
    }
	public static void main(String[] args) {

		int[][][] testCases = new int[][][] {
			{{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}},
			{{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}},
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
		int[] expected = new int[] { 3,0,27};
		Solution s = new Solution();

		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < testCases.length; i++) {
			int actual = s.numEnclaves(testCases[i]);
			if (expected[i]==actual) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" + "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}
}