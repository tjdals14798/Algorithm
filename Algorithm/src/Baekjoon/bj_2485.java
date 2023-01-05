package Baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bj_2485 {
	public static int gcd(int a,int b) {
		while(b > 0) {
			int tmp = b;
			b = a % b;
			a = tmp;
		}
		return a;
	}

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) arr[i] = Integer.parseInt(br.readLine());
		
		int[] mrr = new int[n-1];
		for(int i = 0; i < n-1; i++) mrr[i] = arr[i+1] - arr[i];
		
		int gcd = 0;
		gcd = gcd(mrr[0], mrr[1]);
		for(int i = 2; i < n-2; i++) {
			gcd = gcd(gcd, mrr[i]);
			if(gcd == 1) break;
		}
		
		int res = 0;
		for(int i = 0; i < n-1; i++) res += ((mrr[i]/gcd) - 1);
		System.out.println(res);
		
	}

}
