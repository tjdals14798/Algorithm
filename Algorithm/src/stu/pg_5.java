package stu;

import java.util.Stack;

public class pg_5 {

	public static void main(String[] args) {
		String s = "cdcd";
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i< s.length(); i++) {
			char c = s.charAt(i);
			
			if(!stack.isEmpty() && stack.peek() == c) stack.pop();
			else stack.push(c);
		}
			
		System.out.println(stack.isEmpty()? 1: 0);

	}

}
