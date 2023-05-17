/**
 * 
 */
package com.coderioter.competitiveProgramming3;

/**
 * @author shakeels
 *
 */
public class StringMatchingNaive {
	public int naiveMatch(String text, String pat){
		boolean found=false;
		int currentIndex = -1;
		for(int i=0;i<text.length()-pat.length();i++) {
			int j=0;
			while(j<pat.length()) {
				if(text.charAt(i+j)!=pat.charAt(j))
					break;
				j++;
			}
			if(j==pat.length()) {
				currentIndex=i;
			}
		}
	 return currentIndex;
	}
	
	public static void main(String[] args) {
		StringMatchingNaive s = new StringMatchingNaive();
		int index = s.naiveMatch("anbcaa", "abc");
		System.out.println(index>-1?"Pattern found at index "+index:"Not found");
	}
	
}
