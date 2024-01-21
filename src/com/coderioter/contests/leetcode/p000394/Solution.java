package com.coderioter.contests.leetcode.p000394;

import java.util.Stack;

/**
 * @author coderioter
 * 
 * <h3>394. Decode String</h3>
 * <a href="https://leetcode.com/problems/decode-string/description/?envType=study-plan-v2&envId=google-spring-23-high-frequency">
 * https://leetcode.com/problems/decode-string/description/?envType=study-plan-v2&envId=google-spring-23-high-frequency</a>
 * <br/>
 * https://leetcode.com/studyplan/google-spring-23-high-frequency/
 *
 */
class Solution {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();
        int i=0;
        while(i<s.length()) {
        	char ch = s.charAt(i);
        	if(ch==']') {
        		StringBuilder tempString = new StringBuilder();
        		while(!stack.isEmpty() && stack.peek()!='[') {
        			tempString.append(stack.pop());
        		}
        		if(!stack.isEmpty()) stack.pop();
        		String temp = tempString.reverse().toString();
        		tempString = new StringBuilder();
        		StringBuilder numStack = new StringBuilder();
        		while(!stack.isEmpty() && stack.peek()>='0' && stack.peek()<='9') {
        			numStack.append(stack.pop());
        		}
        		int num = Integer.parseInt(numStack.reverse().toString());
        		while(num-->0) {
        			tempString.append(temp);
        		}
        		for(char c:tempString.toString().toCharArray()) {
        			stack.push(c);
        		}
        	}else {
        		stack.push(ch);
        	}
        	++i;
        }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()) {
        	sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
    
	public static void main(String[] args) {

		String[] testCases = new String[] { "3[a]2[bc]", "3[a2[c]]", "2[abc]3[cd]ef", "100[a2[b]]" };
		String[] expected = new String[] { "aaabcbc","accaccacc","abcabccdcdcdef","abbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabbabb"};
		Solution s = new Solution();

		System.out.println("Actual\t\tExpected\tResult");
		System.out.println("---------------------------------------------");

		for (int i = 0; i < testCases.length; i++) {
			String actual = s.decodeString(testCases[i]);
			if (expected[i].equals(actual)) {
				System.out.println(actual + "\t\t" + expected[i] + "\t\t" + "Passed");
			} else {
				System.err.println(actual + "\t\t" + expected[i] + "\t\t" + "Failed");
			}
		}
	}
}