package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_25379 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long L = 0, R = 0, sum = 0;
		int idx = 0;
		
		for(int i = 0; i < n; i ++) {
			int num = Integer.parseInt(st.nextToken());
			if(num % 2 == 0) {
				sum += idx++;
				L += i;
				R += n-1-i;
			}
		}
		System.out.println(Math.min(L, R) - sum);
	}

}
