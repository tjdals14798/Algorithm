package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_7696 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			int a = Integer.parseInt(br.readLine());
			if(a == 0) break;
			Stack<Integer> stack = new Stack<>();
			int cnt = 1;
			
			while(stack.size() != a) {
				if(cnt <= 10) {
					stack.add(cnt);
					cnt++;
					continue;
				}
				String str = Integer.toString(cnt);
				boolean ck = true;
				
				for(int i = 0; i <= 9; i++) {
					String c = Integer.toString(i);
					if(countChar(str, c) >= 2) {
						ck = false;
						break;
					}
				}
				if(ck) stack.add(cnt);
				cnt++;
			}
			System.out.println(stack.peek());
		}
//		Runtime.getRuntime().gc();
//		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
//		System.out.print(usedMemory + " bytes");
	}
	
	public static int countChar(String str, String c) {
		return str.length() - str.replace(c,"").length();
	}
}
