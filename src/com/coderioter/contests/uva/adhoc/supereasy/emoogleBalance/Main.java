package com.coderioter.contests.uva.adhoc.supereasy.emoogleBalance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;

		public FastReader() {
			br = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() {
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}

		int nextInt() {
			return Integer.parseInt(next());
		}

		long nextLong() {
			return Long.parseLong(next());
		}

		double nextDouble() {
			return Double.parseDouble(next());
		}

		String nextLine() {
			String str = "";
			try {
				if (st.hasMoreTokens()) {
					str = st.nextToken("\n");
				} else {
					str = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}

		public BufferedReader getReader() {
			return br;
		}
	}

	public static void main(String[] args) {
		FastReader s = new FastReader();
		int S=-1;
		int i=1;
			while((S=s.nextInt())!=0) {
				int emoogle=0;
				while(S-->0) {
					if(s.nextInt()==0) {
						emoogle--;
					}else {
						emoogle++;
					}
				}
				System.out.println("Case " + i++ + ": " + emoogle);
			}
	}
}
