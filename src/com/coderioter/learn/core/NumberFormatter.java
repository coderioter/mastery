/**
 * 
 */
package com.coderioter.learn.core;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author shakeels
 *
 */
public class NumberFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double i = in.nextDouble();
		NumberFormat numberFormatter = NumberFormat.getInstance();
		numberFormatter.setMaximumFractionDigits(3);
		numberFormatter.setMaximumIntegerDigits(7);
		numberFormatter.setGroupingUsed(false);
		System.out.println(numberFormatter.format(i));;
	}

}
