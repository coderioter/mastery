/**
 * 
 */
package com.coderioter.contests.beingZero.day1;

/**
 * @author shakeels
 *
 */
public class Pangram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(costToMakePangram("ds".toCharArray(), new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 260}));
	}

	public static long costToMakePangram(char s[], int cost[]) 
	{ 
		int [] costCopy=new int[cost.length];
		System.arraycopy(cost, 0, costCopy, 0, cost.length);
		for(int i=0;i<s.length;i++) {
			costCopy[(int)(s[i])-97]=0;
		}
		long c=0;
		for (int i : costCopy) {
			c+=i;
		}
		return c;
	}
}
