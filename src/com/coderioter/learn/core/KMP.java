/**
 * 
 */
package com.coderioter.learn.core;

import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class KMP {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		String pattern = scanner.nextLine();
		
		KMP kmp = new KMP();
		int[] piTable = kmp.generatePiTable(pattern);
		int foundAtIndex = kmp.searchPattern(text, pattern, piTable);
		if(foundAtIndex==-1) {
			System.out.println("Not found.");
		}else {
			System.out.println(text);
			for (int i=0;i<text.length();i++) {
				char c = i==foundAtIndex?(char)94:' ';
				System.err.print(c);
			}
		}
		//System.out.println(foundAtIndex>-1?"Found at "+foundAtIndex:"Not found");;
	}

	private int searchPattern(String text,String pattern, int[] piTable) {
		int foundAtIndex=-1;
		for(int i=0;i<text.length()-1;i++) {
			int j=0;
			while(j<pattern.length() && i<text.length()) {
				if(text.charAt(i)!=pattern.charAt(j)) {
					j=piTable[j]<0?-1:piTable[j];
				}
				j++;
				i++;
			}
			if(j==pattern.length()) {
				foundAtIndex=i-j;
				break;
			}
		}
		return foundAtIndex;
	}
	
	private int[] generatePiTable(String pattern) {
		int[] pat = new int[pattern.length()];
		pat[0]=-1;
		for(int i=0;i<pattern.length();i++) {
			pat[i]=-1;
		}
		for(int i=0;i<pattern.length()-1;i++) {
			for(int j=i+1;j<pattern.length();j++) {
				if(pattern.charAt(i)==pattern.charAt(j)) {
					if(pat[i]==-1) pat[j]=i;
				}
			}
		}
		return pat;
	}
}
