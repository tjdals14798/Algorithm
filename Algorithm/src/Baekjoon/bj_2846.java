package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_2846 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int Pi = Integer.parseInt(st.nextToken());
		int max = 0, first = Pi, res = 0;
		
		for(int i = 1; i < n; i++) {
			Pi = Integer.parseInt(st.nextToken());
			if(res < Pi) max = Math.max(max, Pi - first);
			else first = Pi;
			res = Pi;
		}
		System.out.println(max);
		
	}

}
