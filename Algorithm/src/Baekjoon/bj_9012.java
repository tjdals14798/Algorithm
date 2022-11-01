package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_9012 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			System.out.println(YorN(br.readLine()));
		}
	}
	
	public static String YorN(String str) {
		Stack<Character> st = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if(c=='(') st.push(c);
			else if(st.empty()) {
				return "NO";
			}else st.pop();
		}
		if(st.empty()) return "YES";
		else return "NO";
	}

}
