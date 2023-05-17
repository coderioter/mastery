/**
 * 
 */
package com.coderioter.learn.core;

/**
 * @author shakeels
 *
 */
public class PalindromeChecker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromeChecker p = new PalindromeChecker();
		String[] s = {"aabbbbaa",
				"Anna",
				"Civic",
				"kayak",
				"Level",
				"madam",
				"Mom",
				"noon",
				"Racecar",
				"radar",
				"Redder",
				"Refer",
				"repaper",
				"Rotator",
				"Rotor",
				"sagas",
				"Solos",
				"Stats",
				"Tenet",
				"Wow"};
		System.out.println("Test\t\t\tCase Sensitive \t\t Case insensitive");
		for (String string : s) {
			System.out.println(string+"\t\t"+p.check(string)+"\t\t\t"+p.checkCaseInsensitive(string));
		}
		;

	}

	private boolean checkCaseInsensitive(String s) {
		int i=0;
		while(i<s.length()/2) {
			if(Character.toUpperCase(s.charAt(i))!=Character.toUpperCase(s.charAt(s.length()-i-1))) {
				return false;
			}
			i++;
		}
		return true;
	}

	private boolean check(String s) {
		int i=0;
		while(i<s.length()/2) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
			i++;
		}
		return true;
	}

}
