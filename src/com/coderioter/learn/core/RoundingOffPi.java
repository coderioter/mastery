package com.coderioter.learn.core;

import java.text.NumberFormat;
import java.util.Scanner;

public class RoundingOffPi {

	public static void main(String[] args) {
		double PI = 2*Math.acos(0.0);
		NumberFormat nf = NumberFormat.getInstance();
		int n = new Scanner(System.in).nextInt();
		nf.setMaximumFractionDigits(n);
		System.out.println(nf.format(PI));
	}
}
