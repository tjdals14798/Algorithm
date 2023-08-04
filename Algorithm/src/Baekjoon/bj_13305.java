package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_13305 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());		
		long money[] = new long[n], city[] = new long[n-1];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n-1; i++) city[i] = Long.parseLong(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) money[i] = Long.parseLong(st.nextToken());
		
		long sum = money[0] * city[0];
		long min = money[0];
		for(int i = 1; i < n-1; i++) {
			min = Math.min(min, money[i]);
			sum += min * city[i];
		}
		System.out.println(sum);
		
	}

}
