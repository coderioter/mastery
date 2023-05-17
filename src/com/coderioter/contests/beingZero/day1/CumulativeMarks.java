/**
 * 
 */
package com.coderioter.contests.beingZero.day1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class CumulativeMarks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		Map<String, Integer> marks = new HashMap<>();
		while(items-->0) {
			String s = sc.next();
			if(marks.containsKey(s)){
				marks.put(s,marks.get(s)+sc.nextInt());
				continue;
			}
			marks.put(s,sc.nextInt());
		}
		items = sc.nextInt();
		while(items-->0){
			Integer l = marks.get(sc.next());
			System.out.println(l);
		}
		sc.close();
	}
}
