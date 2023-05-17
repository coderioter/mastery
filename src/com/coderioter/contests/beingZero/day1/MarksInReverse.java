/**
 * 
 */
package com.coderioter.contests.beingZero.day1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class MarksInReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		Map<String, List<Integer>> marks = new HashMap<>();
		while(items-->0) {
			String s = sc.next();
			if(marks.containsKey(s)){
				List<Integer> st = marks.get(s);
				st.add(sc.nextInt());
				marks.put(s,st);
				continue;
			}
			List<Integer> st = new ArrayList<Integer>();
			st.add(sc.nextInt());
			marks.put(s,st);
		}
		items = sc.nextInt();
		while(items-->0){
			List<Integer> l = marks.get(sc.nextInt());
			int i = l.size();
			while(i>0){
				System.out.print(l.get(i)+" ");
			}
			System.out.println();
		}
	}

}
