/**
 * 
 */
package com.coderioter.contests.beingZero.day2;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author shakeels
 *
 */
public class LargestNumberFormedByRearrangingArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] i = new Integer[] {1, 20, 9, 90, 89};
		rearrangeArrayToFormLargestNumber(i);
		for(int a:i) {
			System.out.print(a);
		}
	}

	public static void rearrangeArrayToFormLargestNumber(Integer a[]) {
		Arrays.sort(a,new Comparator<Integer>() {
			public int compare(Integer a, Integer b) {
				if(a==b) {
					return 0;
				}
				return Integer.parseInt(a+""+b)<Integer.parseInt(b+""+a)?1:-1;
			}
		});
	}
}
