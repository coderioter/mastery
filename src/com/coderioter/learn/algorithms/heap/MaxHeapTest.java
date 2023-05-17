/**
 * 
 */
package com.coderioter.learn.algorithms.heap;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class MaxHeapTest {

	private static Scanner scanner;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		MaxHeap max = new MaxHeap();
		int val = scanner.nextInt();
		while (val != -1 ) {
			switch (val) {
			case 1:
				max.push(scanner.nextInt());
				break;
			case 2:
				System.out.println(max.pop());;

			}
			val = scanner.nextInt();
		}
		max.print();
	}

}
