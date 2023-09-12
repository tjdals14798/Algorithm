package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_14563 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(st.nextToken()), sum = 0;
			
			for(int j = 1; j < num; j++) {
				if(num % j == 0) {
					sum += j;
				}
			}
			
			if(sum == num) sb.append("Perfect\n");
			else sb.append(sum > num ? "Abundant\n":"Deficient\n");
		}
		System.out.println(sb);
	}

}
