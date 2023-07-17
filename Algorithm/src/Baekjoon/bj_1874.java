package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class bj_1874 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Stack<Integer> st = new Stack<>();
		
		int N = Integer.parseInt(br.readLine());
		
		int start = 0;
		
		for(int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			
			if(num > start) {
				for(int j = start+1; j <= num; j++) {
					st.push(j);
					sb.append("+").append("\n");
				}
				start = num;
			} else if(st.peek() != num) {
				System.out.println("NO");
				return;
			}
			
			st.pop();
			sb.append("-").append("\n");
		}
		System.out.println(sb);
	}

}
