/**
 * 
 */
package com.coderioter.contests.uva.adhoc.supereasy.combinationLock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		try {
			while((str=br.readLine())!=null) {
				String[] split=str.split("\\s");
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[1]);
				int c = Integer.parseInt(split[2]);
				int d = Integer.parseInt(split[3]);
				if(a==0&&b==0&&c==0&&d==0)
					return;
				
				int x = a - b;
				if (x < 0)
					x += 40;
				int y = c - b;
				if (y < 0)
					y += 40;
				int z = c - d;
				if (z < 0)
					z += 40;
				int sum = (x + y + z) * 9;
				sum+=1080;
				System.out.println(sum);
			}
		} catch (IOException e) {
		}
	}
}
