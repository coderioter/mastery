/**
 * 
 */
package com.coderioter.contests.uva.adhoc.supereasy.celebrityJeopardy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c=-1;
		int chars=0;
		try {
			while((c=br.read())!=-1) {
				if(c=='\u001a') {
					break;
				}
				if((c==13 && (c=br.read())==10)) {
					if(chars<2)
						break;
					else
						chars=0;
				}
				chars++;
				System.out.print((char)c);
			}
		} catch (IOException e) {
		}
	}
}
