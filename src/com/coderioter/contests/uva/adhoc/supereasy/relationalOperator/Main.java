/**
 * 
 */
package com.coderioter.contests.uva.adhoc.supereasy.relationalOperator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T=0;
		try {
			T=Integer.parseInt (br.readLine().split("\\s")[0]);
			while(T-->0) {
				String[] input = br.readLine().split("\\s");
				int a = Integer.parseInt(input[0]);
				int b = Integer.parseInt(input[1]);
				System.out.println(a==b?"=":(a>b?">":"<"));
			}
		} catch (IOException e) {
		}
	}
}
