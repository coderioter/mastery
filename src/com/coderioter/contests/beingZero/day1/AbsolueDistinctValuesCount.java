/**
 * 
 */
package com.coderioter.contests.beingZero.day1;

import java.util.HashSet;
import java.util.Set;

/**
 * @author shakeels
 *
 */
public class AbsolueDistinctValuesCount {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(absoluteDistinctValues(new int []{1,-1,1,-1,-1,1,1,-1,1,1,-1}));
	}
	public static int absoluteDistinctValues(int a[]) 
	{
		Set<Integer> s = new HashSet<Integer>();
		for(int i:a){
			s.add(i>=0?i:(i*-1));
		}
		return s.size();
	}
}
