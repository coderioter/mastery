/**
 * 
 */
package com.coderioter.contests.beingZero.day4;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class HasEqualSumPartitions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0) {
			int N = sc.nextInt();
			int[] a = new int[N];
			for(int i=0;i<N;i++) {
				a[i]=sc.nextInt();
			}
			System.out.println(hasEqualSumPartitions(a));
		}
	}
	private static int sumCheck;
	private static int found;
	public static boolean hasEqualSumPartitions(int arr[]) {
		System.out.println(Arrays.toString(arr));
    	int totalSum=0;
		found=0;
		for(int i=0;i<arr.length;i++) totalSum+=arr[i];
		if(totalSum%2!=0)
			return false;
		sumCheck = totalSum/2;
		hasEqualParitionSum(arr,0,0,false);
		System.out.println(found);
		return found==2;
}
	public static void hasEqualParitionSum(int[] a, int i, int cs,boolean included) {
		
		if(cs==sumCheck && included)
			found++;
		if(i>a.length-1)
			return;
		hasEqualParitionSum(a, i+1, cs+a[i],true);
		hasEqualParitionSum(a, i+1, cs,false);
	}

}
