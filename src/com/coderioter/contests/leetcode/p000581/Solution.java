package com.coderioter.contests.leetcode.p000581;
import java.util.Arrays;
public class Solution
{
	public static void main(String[] args) {
		
		System.out.println(findUnsortedSubarray(new int[]{2,6,4,8,10,9,15}));
	}

    public static int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = snums.length, end = 0;
        for (int i = 0; i < snums.length; i++) {
            if (snums[i] != nums[i]) {
                start = Math.min(start, i);
                end   = Math.max(end, i);
            }
        }
        return (end - start >= 0 ? end - start + 1 : 0);
    }

}
