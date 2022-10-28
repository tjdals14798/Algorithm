package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_10773 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int k = Integer.parseInt(br.readLine()), res = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i = 0; i < k; i++) {
			int n = Integer.parseInt(br.readLine());
			if(n == 0) stack.pop();
			else stack.push(n);
		}
		for(int i : stack) res += i;
		System.out.println(res);
	}

}
