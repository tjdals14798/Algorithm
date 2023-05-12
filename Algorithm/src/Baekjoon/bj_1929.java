package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_1929 {
	
	static boolean arr[];

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		int M = Integer.parseInt(st.nextToken()),
			N = Integer.parseInt(st.nextToken());
		
		arr = new boolean[N + 1];
		get_prime();
		
		for(int i = M; i <= N; i++) {
			if(!arr[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);
	}
	
	public static void get_prime() {
		arr[0] = arr[1] = true;
		
		for(int i = 2; i <= Math.sqrt(arr.length); i++) {
			if(arr[i]) continue;
			for(int j = i * i; j < arr.length; j += i) {
				arr[j] = true;
			}
		}
	}
}
 