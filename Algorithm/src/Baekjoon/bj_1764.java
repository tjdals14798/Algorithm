package Baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class bj_1764 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(), m = sc.nextInt();
		
		String nrr[] = new String[n];
		String mrr[] = new String[m];
		Stack<String> stack = new Stack<>();
		
		for(int i = 0;i < n;i++) {
			nrr[i] = sc.next();
		}
		for(int i = 0;i < m;i++) {
			mrr[i] = sc.next();
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				if(nrr[i].equals(mrr[j])) {
					stack.push(nrr[i]);
				}
			}
		}
		System.out.println(stack.size());
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
	}

}
