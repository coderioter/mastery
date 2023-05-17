/**
 * 
 */
package com.coderioter.contests.beingZero.day2;

import java.util.ArrayList;

/**
 * @author shakeels
 *
 */
public class SortableCheck {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(3);
		a.add(2);
		a.add(4);
		a.add(5);
		a.add(8);
		a.add(9);
		a.add(7);
		System.out.println(isSortable(a));
	}
	public static boolean isSortable(ArrayList<Integer> a)
	{
		for(int i=0, j=1;j<a.size();i++,j++) {
			if(a.get(i)<a.get(j))
				continue;
			if(!((j+1<a.size()?a.get(i)<a.get(j+1):true) && (i>0?a.get(j)>a.get(i-1):true))) {
				return false;
			}
		}
		return true;
	}
}
