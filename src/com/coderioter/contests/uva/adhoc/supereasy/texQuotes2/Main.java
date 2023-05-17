/**
 * 
 */
package com.coderioter.contests.uva.adhoc.supereasy.texQuotes2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 503240791
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int c=-1;
		int chars=0;
		boolean first=true;
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
				if(c=='\"') {
					if(first) {
						System.out.print("``");
						first=false;
					}else {
						System.out.print("''");
						first=true;
					}
				} else{
					System.out.print((char)c);
				}
			}
		} catch (IOException e) {
		}
		
	}

}
