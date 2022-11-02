package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class bj_10828 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Stack<Integer> sk = new Stack<>();
		StringTokenizer st;
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			String pr = st.nextToken();
			switch (pr) {
			case "push":
				sk.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if(sk.empty()) System.out.println(-1);
				else System.out.println(sk.pop());
				break;
			case "size":
				System.out.println(sk.size());
				break;
			case "empty":
				if(sk.empty()) System.out.println(1);
				else System.out.println(0);
				break;
			case "top":
				if(sk.empty()) System.out.println(-1);
				else System.out.println(sk.peek());
				break;
			}
		}
	}

}
