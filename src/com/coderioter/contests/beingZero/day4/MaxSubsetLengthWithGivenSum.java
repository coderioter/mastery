package com.coderioter.contests.beingZero.day4;

import java.util.*;

public class MaxSubsetLengthWithGivenSum
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int T = sc.nextInt();
		while(T-->0) {
			int N = sc.nextInt();
			int[] a =  new int[N];
			for(int i=0;i<N;i++) {
				a[i]=sc.nextInt();
			}
			int S = sc.nextInt();
			while(S-->0) {
				int Q = sc.nextInt();
				System.out.print(getMaxSubsetLenghForGivenSum(a,Q)+" ");
			}
          System.out.println();
		}
	}
  	static PriorityQueue<Integer> p;
	private static int getMaxSubsetLenghForGivenSum(int[] a, int s) {
		int i=0;
		int cs = 0;
		int length=0;
		p=new PriorityQueue<Integer>(Collections.reverseOrder());
		getMaxSubsetLenghForGivenSum(a, s,i,cs,length);
		return p.remove();
	}

	private static int getMaxSubsetLenghForGivenSum(int[] a, int s, int i, int cs, int length) {
		if(cs==s)
			p.add(length);
		if(i>a.length-1) {
			return 0;
		}
		return getMaxSubsetLenghForGivenSum(a, s, i+1, cs+a[i], length+1) + getMaxSubsetLenghForGivenSum(a, s, i+1, cs, length);
	}

}