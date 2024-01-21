package com.coderioter.contests.leetcode.p000001.bruteforce;

import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        boolean found=false;
        for(int i=0;i<nums.length-1&&!found;i++){
            ans[0]=i;
            for(int j=i+1;j<nums.length&&!found;j++){
                if(nums[i]+nums[j]==target){
                    ans[1]=j;
                    found=true;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(Arrays.toString(s.twoSum(new int[] { 2, 7, 11, 15 }, 9)));//0,1
		System.out.println(Arrays.toString(s.twoSum(new int[] { 3, 2, 4 }, 6)));//1,2
		System.out.println(Arrays.toString(s.twoSum(new int[] { 3, 3 }, 6)));//0,1
	}
}