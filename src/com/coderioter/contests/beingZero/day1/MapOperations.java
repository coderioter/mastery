package com.coderioter.contests.beingZero.day1;

import java.util.*;

public class MapOperations {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int tests = sc.nextInt();
		for (int ti = 1; ti <= tests; ti++) {
			// For Every Test, We need to create new Stack
			Map<Integer, Integer> mp = new HashMap<>();

			int opsCount = sc.nextInt();
			for (int op = 1; op <= opsCount; op++) {
			int opType = sc.nextInt();
				switch (opType) {
					case 0: {
						mp.put(sc.nextInt(), sc.nextInt());
						break;
					}
					case 1: {
						System.out.print(mp.containsKey(sc.nextInt()) + " ");
						break;
					}
					case 2: {
						System.out.print(mp.get(sc.nextInt()) + " ");
						break;
					}
					case 3: {
						System.out.print(mp.size() + " ");
						break;
					}
					case 4: {
						mp.remove(sc.nextInt());
						break;
					}
				}
			}
			System.out.println();
		}
	}
}