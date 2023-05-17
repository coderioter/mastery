package com.coderioter.contests.uva.adhoc.supereasy.HajjeAkbar;

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
		int i=1;
		while (true) {
			switch(s.next()) {
			case "Hajj":System.out.println("Case "+i+": "+"Hajj-e-Akbar");break;
			case "Umrah":System.out.println("Case "+i+": "+"Hajj-e-Asghar");break;
			case "*":return;
			}
			i++;
		}

	}
}
