package com.coderioter.learn.algorithms.stack.test;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import com.coderioter.learn.algorithms.stack.PostFix;

public class PostFixTest {

	@Test
	public void testConvertToPostFix() {
		String s = "5+7-9*8/3";
		PostFix p = new PostFix();
		Stack<Character> convertToPostFix = p.convertToPostFix(s);
		while(!convertToPostFix.isEmpty()) {
			System.out.print(convertToPostFix.pop());
		}
	}

}
