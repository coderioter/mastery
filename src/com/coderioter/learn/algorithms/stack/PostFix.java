package com.coderioter.learn.algorithms.stack;

import java.util.Stack;

public class PostFix {

	public Stack<Character> convertToPostFix(String s) {
		Stack<Character> postFix = new Stack<>();
		for(int i=0;i<s.length();i++) {
			char c = s.charAt(i);
			if(Character.isDigit(c)) {
				postFix.push(c);
			}else {
				switch(c){
					case '+': 
					case '-': 
					case '*': 
					case '/': 
						char x = postFix.pop();
						postFix.push(c);
						postFix.push(x);
				}
			}
		}
		return postFix;
	}
}
