package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_11729 {
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		hanoi(n, 1, 3, 2);
		
		System.out.println(cnt);
		System.out.println(sb);
	}
	
	public static void hanoi(int n, int start, int to, int num) {
		if(n == 0) return;
		else {
			cnt++;
			hanoi(n - 1, start, num, to);
			sb.append(start + " " + to + "\n");
			hanoi(n - 1, num, to, start);
		}
	}

}
