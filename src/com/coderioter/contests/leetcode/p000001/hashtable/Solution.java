package com.coderioter.contests.leetcode.p000001.hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2]; 
        Map<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(m.containsKey(target-nums[i])) {
            	return new int[] {i,m.get(target-nums[i])};
            }
            m.put(nums[i], i);
            
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