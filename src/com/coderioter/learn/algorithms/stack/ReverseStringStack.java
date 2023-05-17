package com.coderioter.learn.algorithms.stack;

import java.util.Stack;

public class ReverseStringStack {

	public String reverse(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++) {
			stack.push(s.charAt(i));
		}
		StringBuilder sb = new StringBuilder();
		while(!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		return sb.toString();
	}

}
