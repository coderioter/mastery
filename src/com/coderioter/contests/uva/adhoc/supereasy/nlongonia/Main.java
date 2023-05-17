package com.coderioter.contests.uva.adhoc.supereasy.nlongonia;

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
		while (true) {
			int S = s.nextInt();
			if(S==0)
				break;
			int n = s.nextInt();
			int m = s.nextInt();
			while (S-- > 0) {
				String[] points = null;
				try {
					points = s.getReader().readLine().split("\\s");
				} catch (IOException e) {
				}
				if (points == null)
					return;
				int a = Integer.parseInt(points[0]);
				int b = Integer.parseInt(points[1]);
				if (a == n || b == m) {
					System.out.println("divisa");
					continue;
				}
				if(a>n && b>m) {
					System.out.println("NE");
					continue;
				}
				if(a<n && b>m) {
					System.out.println("NO");
					continue;
				}
				if(a<n && b<m) {
					System.out.println("SO");
					continue;
				}
				if(a>n && b<m) {
					System.out.println("SE");
				}
			}
		}
	}
}
