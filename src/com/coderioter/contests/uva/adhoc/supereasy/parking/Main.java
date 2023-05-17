package com.coderioter.contests.uva.adhoc.supereasy.parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}

		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() { return Integer.parseInt(next()); }

		long nextLong() { return Long.parseLong(next()); }

		double nextDouble()
		{
			return Double.parseDouble(next());
		}

		String nextLine()
		{
			String str = "";
			try {
				if(st.hasMoreTokens()){
					str = st.nextToken("\n");
				}
				else{
					str = br.readLine();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}

	public static void main(String[] args)
	{
		FastReader s = new FastReader();
		int T=s.nextInt();
		while(T-->0) {
			int S = s.nextInt();
			int min=Integer.MAX_VALUE,max=-1;
			while(S-->0) {
				int c = s.nextInt();
				min=Math.min(min, c );
				max=Math.max(max, c);
			}
			System.out.println((max-min)*2);
		}
	}
}
