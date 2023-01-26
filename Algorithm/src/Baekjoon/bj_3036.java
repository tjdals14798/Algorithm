package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class bj_3036 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int first = Integer.parseInt(st.nextToken());
		
		for(int i = 1; i < n; i++) {
			int next = Integer.parseInt(st.nextToken());
			int gcd = gcd(first, next);
			System.out.println((first / gcd) + "/" + (next / gcd));
		}
	}
	
	public static int gcd (int a, int b) {
		int r;
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

}
