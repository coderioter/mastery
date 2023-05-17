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
public class WordMeaning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int items = sc.nextInt();
		Map<String, String> dictionary = new HashMap<String, String>();
		while(items-->0){
			dictionary.put(sc.next(),sc.next());
		}
		items = sc.nextInt();
		while(items-->0){
			System.out.println(dictionary.get(sc.next()));
		}
		sc.close();
	}

}
