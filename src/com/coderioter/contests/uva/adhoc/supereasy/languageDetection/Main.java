package com.coderioter.contests.uva.adhoc.supereasy.languageDetection;

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
			for(int i=0;i<2000;i++) {
				switch(s.next()) {
				case "HELLO": System.out.println("Case "+(i+1)+":"+" ENGLISH");break;
				case "HOLA":System.out.println("Case "+(i+1)+":"+" SPANISH");break;
				case "HALLO":System.out.println("Case "+(i+1)+":"+" GERMAN");break;
				case "BONJOUR":System.out.println("Case "+(i+1)+":"+" FRENCH");break;
				case "CIAO":System.out.println("Case "+(i+1)+":"+" ITALIAN");break;
				case "ZDRAVSTVUJTE":System.out.println("Case "+(i+1)+":"+" RUSSIAN");break;
				case "#":return;
				default:System.out.println("Case "+(i+1)+":"+" UNKNOWN");
				}
			}
	}
}
