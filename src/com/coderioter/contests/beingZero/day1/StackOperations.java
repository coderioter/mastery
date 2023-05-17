package com.coderioter.contests.beingZero.day1;

import java.util.*;

public class StackOperations {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			// For Every Test, We need to create new Stack
			Stack<Integer> stk = new Stack<Integer>();

			int opsCount = sc.nextInt();
			for (int op = 1; op <= opsCount; op++) {
				int opType = sc.nextInt();
				switch (opType) {
					case 0: {
						stk.push(sc.nextInt());
						break;
					}
					case 1: {
						System.out.print(stk.pop() + " ");
						break;
					}
				}
				// TODO: Based on op type, complete the code as requested
			}
			System.out.println();
		}
	}
}