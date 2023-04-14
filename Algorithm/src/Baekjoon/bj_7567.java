package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_7567 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split("");
		Stack<String> st = new Stack<>();
		int height = 0;
		
		for(String s : str) {
			if(st.isEmpty()) {
				st.add(s);
				height += 10;
			}else {
				if(st.peek().equals(s)) height += 5;
				else height += 10;
			}
			st.add(s);
		}
		System.out.println(height);
		

	}

}
