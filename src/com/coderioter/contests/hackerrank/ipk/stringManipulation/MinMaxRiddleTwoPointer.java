package com.coderioter.contests.hackerrank.ipk.stringManipulation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MinMaxRiddleTwoPointer {

	// Complete the riddle function below.
	static long[] riddle(long[] arr) {
		Stack<Integer> s = new Stack<>();
		int n = arr.length;

		int[] left = new int[n + 1];
		int[] right = new int[n + 1];

		for (int i = 0; i < n; i++) {
			left[i] = -1;
			right[i] = n;
		}

		for (int i = 0; i < n; i++) {
			while (!s.empty() && arr[s.peek()] >= arr[i])
				s.pop();

			if (!s.empty())
				left[i] = s.peek();

			s.push(i);
		}

		while (!s.empty())
			s.pop();

		for (int i = n - 1; i >= 0; i--) {
			while (!s.empty() && arr[s.peek()] >= arr[i])
				s.pop();

			if (!s.empty())
				right[i] = s.peek();

			s.push(i);
		}

		long ans[] = new long[n + 1];
		for (int i = 0; i <= n; i++)
			ans[i] = 0;
		for (int i = 0; i < n; i++) {
			int len = right[i] - left[i] - 1;
			ans[len] = Math.max(ans[len], arr[i]);
		}

		for (int i = n - 1; i >= 1; i--)
			ans[i] = Math.max(ans[i], ans[i + 1]);

		return ans;
	}

	private static final Scanner scanner = new Scanner(System.in);

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		long[] arr = new long[n];

		String[] arrItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			long arrItem = Long.parseLong(arrItems[i]);
			arr[i] = arrItem;
		}

		long[] res = riddle(arr);

		for (int i = 0; i < res.length; i++) {
			bufferedWriter.write(String.valueOf(res[i]));

			if (i != res.length - 1) {
				bufferedWriter.write(" ");
			}
		}

		bufferedWriter.newLine();

		bufferedWriter.close();

		scanner.close();
	}
}
