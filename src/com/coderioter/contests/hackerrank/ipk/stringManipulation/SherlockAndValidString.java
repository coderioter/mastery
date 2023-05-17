package com.coderioter.contests.hackerrank.ipk.stringManipulation;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'isValid' function below.
	 *
	 * The function is expected to return a STRING. The function accepts STRING s as
	 * parameter.
	 */

	public static String isValid(String s) {
		if (s.length() < 2) {
			return "YES";
		}
		// Write your code here
		int[] a = new int[26];
		for (int i = 0; i < s.length(); i++) {
			a[s.charAt(i) - 'a']++;
		}
		Map<Integer, List<Character>> x = new TreeMap<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				continue;
			}
			if (x.containsKey(a[i])) {
				List<Character> l = x.get(a[i]);
				l.add((char) (i + 'a'));
				x.put(a[i], l);
			} else {
				List<Character> l = new ArrayList();
				l.add((char) (i + 'a'));
				x.put(a[i], l);

			}
		}
		if (x.size() > 2) {
			return "NO";
		}
		if (x.size() == 1) {
			return "YES";
		}
		int[] y = new int[2];
		int i = 0;
		for (Integer y1 : x.keySet()) {
			y[i++] = y1;
		}
		if (x.get(y[0]).size() > 1 && x.get(y[1]).size() > 1) {
			return "NO";
		}

		if (y[0] == 1 && x.get(y[0]).size() == 1) {
			return "YES";
		}
		if (y[1] - y[0] == 1) {
			return "YES";
		}
		return "NO";
	}
}

public class SherlockAndValidString {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedReader bufferedReader = new BufferedReader(new FileReader(new File("C:\\tools\\cpw\\workspace\\coding\\src\\com\\hackerrank\\ipk\\stringManipulation\\SherlockAndValidStringTest")));
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		String s = bufferedReader.readLine();

		String result = Result.isValid(s);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
