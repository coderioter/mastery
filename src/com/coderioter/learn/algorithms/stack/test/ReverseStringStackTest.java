package com.coderioter.learn.algorithms.stack.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderioter.learn.algorithms.stack.ReverseStringStack;

public class ReverseStringStackTest {
	@Test
	public void testReverse() {
		String s = new String("coderioter");
		ReverseStringStack reverseStringStack = new ReverseStringStack();
		String reverse = reverseStringStack.reverse(s);
		assertEquals("leekahs", reverse);
	}

}
